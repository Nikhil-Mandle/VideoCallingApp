# Video Calling App with Stream SDK Integration
This project demonstrates a video calling app using the Stream SDK with Kotlin and Jetpack Compose. It allows guest users to connect with each other through one-on-one video calls.
## Features
* One-on-One Video Calls: Enables video calls between two guest users.
* Guest Access: Allows users to join as guests without requiring registration.
* Modern UI: Built using Jetpack Compose for a seamless, declarative UI.
## Prerequisites
Make sure you have the following:

1. Android Studio: Version Arctic Fox or later
2. Stream API Key: Register on Stream’s website to get an API key
3. Android Device/Emulator: A device with camera and microphone access for video calling

## Getting Started
Step 1: Clone the Repository
git clone https://github.com/Nikhil-Mandle/VideoCallingApp.git

Step 2: Add Your Stream API Key

Step 3: Configure Dependencies
Add the following dependencies to the build.gradle file of the app module:
```
implementation(libs.bundles.koin)
    implementation(libs.bundles.stream)
    implementation(libs.navigation.compose)
    implementation(libs.kotlinx.serialization.json)
```
Ensure plugins for serialization and other required tools are set up correctly in the build.gradle:
```
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    alias(libs.plugins.kotlin.serialization)
}
```
Step 4: Verify the libs.versions.toml File
```
# Version References
stream = "0.5.8"
koin = "3.5.3"
composeNavigation = "2.8.3"
serialization = "1.6.3"

# Dependencies
stream-video = { module = "io.getstream:stream-video-android-core", version.ref = "stream" }
stream-video-android-ui-compose = { module = "io.getstream:stream-video-android-ui-compose", version.ref = "stream" }
navigation-compose = { module = "androidx.navigation:navigation-compose", version.ref = "composeNavigation" }
kotlinx-serialization-json = { module = "org.jetbrains.kotlinx:kotlinx-serialization-json", version.ref = "serialization"}
koin-android = { group = "io.insert-koin", name = "koin-android", version.ref = "koin" }
koin-core = { group = "io.insert-koin", name = "koin-core", version.ref = "koin" }
koin-androidx-compose = { group = "io.insert-koin", name = "koin-androidx-compose", version.ref = "koin" }

# Plugin References
[plugins]
android-application = { id = "com.android.application", version.ref = "agp" }
jetbrains-kotlin-android = { id = "org.jetbrains.kotlin.android", version.ref = "kotlin" }
kotlin-serialization = { id = "org.jetbrains.kotlin.plugin.serialization", version.ref = "kotlin" }

# Bundles
[bundles]
koin = ["koin-core", "koin-android", "koin-androidx-compose"]
stream = ["stream-video", "stream-video-android-ui-compose"]
```
Step 5: Sync and Build the Project

## Usage
1. Run the App: Open the project in Android Studio, connect an emulator or Android device, and press Run.
2. Join as a Guest: Upon launching, enter a unique room ID to connect with another guest.
3. Initiate a Video Call: Use the provided UI to start a video call with another guest user in the same room.




