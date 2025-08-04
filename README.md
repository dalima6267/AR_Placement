# 🔧 AR Placement App for Android

## 🎯 Assignment Title  
**AR Placement App for Android**

## 📌 Objective  
To build a simple AR app that allows users to:  
1. Select a drill from a list.  
2. Tap on the ground (detected plane) to place a virtual drill marker in AR.

## 🧱 Features Implemented

### 1. Drill Selector UI  
- A dropdown or list with 2–3 mock drill options (e.g., Drill 1, Drill 2, Drill 3).  
- Each drill opens a detail page with:
  - Display image  
  - Description  
  - Tips  
- Button to initiate AR scene: **Start AR Drill**

### 2. AR Scene – Tap to Place Drill Object  
- Uses **ARCore** for plane detection.  
- Detects horizontal surfaces.  
- On tap, places a simple 3D object (cube or cone) representing the drill marker.  
- Only one object allowed to be placed at a time (optional but implemented).

## 🛠 Tech Stack  
- **Language**: Kotlin  
- **AR SDK**: Google ARCore + Sceneform  
- **Min SDK**: 24+

## 🚀 How to Run the Project

1. **Clone the Repository**  
   ```bash
   https://github.com/dalima6267/AR_Placement/tree/main
   ```

2. **Open in Android Studio**

3. **Build the Project**  
   - Make sure your emulator or physical device supports ARCore.  
   - Connect a device or use an AR-supported emulator.

4. **Run the App**  
   - Select a drill → Tap "Start AR Drill" → Point to a flat surface → Tap to place marker.

## 📁 Project Structure Highlights
- `MainActivity.kt` – Entry point with drill selection UI.  
- `ArActivity.kt` – Displays selected drill info.  

## 📦 Deliverables  
- ✅ Working AR Android app  
- ✅ Codebase (in this repository)  

## ScreenShots

<p align="center">
    <img src="https://github.com/user-attachments/assets/780ed4eb-c190-4d57-b3ac-0b88bc749bbe"  width="300" height="600">
  </p>
  <p align="center">
    <img src="https://github.com/user-attachments/assets/fa9f65d8-d502-4233-8ded-e9781ba353a1"  width="300" height="600">
  </p>
    <p align="center">
<img src="https://github.com/user-attachments/assets/2fa35cb3-8666-48b6-9f23-e8cb2ea46efa"  width="300" height="600">
  </p>
