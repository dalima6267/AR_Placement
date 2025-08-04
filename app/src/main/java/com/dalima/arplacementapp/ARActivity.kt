package com.dalima.arplacementapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.ar.core.Anchor
import com.google.ar.sceneform.AnchorNode
import com.google.ar.sceneform.math.Vector3
import com.google.ar.sceneform.rendering.Color
import com.google.ar.sceneform.rendering.MaterialFactory
import com.google.ar.sceneform.rendering.ShapeFactory
import com.google.ar.sceneform.ux.ArFragment
import com.google.ar.sceneform.ux.TransformableNode

class ARActivity : AppCompatActivity() {

    private lateinit var arFragment: ArFragment
    private var placedAnchorNode: AnchorNode? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aractivity)

        // Get ArFragment instance from fragment manager
        arFragment = supportFragmentManager.findFragmentById(R.id.ar_fragment) as ArFragment

        // Tap listener
        arFragment.setOnTapArPlaneListener { hitResult, _, _ ->
            // Remove previously placed object
            placedAnchorNode?.let {
                arFragment.arSceneView.scene.removeChild(it)
                it.anchor?.detach()
            }

            val anchor: Anchor = hitResult.createAnchor()
            val anchorNode = AnchorNode(anchor).apply {
                setParent(arFragment.arSceneView.scene)
            }

            // Create cube material and model
            MaterialFactory.makeOpaqueWithColor(this, Color(android.graphics.Color.BLUE))
                .thenAccept { material ->
                    val cube = ShapeFactory.makeCube(
                        Vector3(0.1f, 0.1f, 0.1f),
                        Vector3.zero(),
                        material
                    )

                    // Attach cube to TransformableNode (to allow interaction)
                    val cubeNode = TransformableNode(arFragment.transformationSystem).apply {
                        renderable = cube
                        setParent(anchorNode)
                        select()
                    }
                }

            placedAnchorNode = anchorNode
        }
    }
}

