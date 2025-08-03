Fitness App
Overview
Fitness App is an Android application designed to support fitness-related features, built using Gradle as the build system. The project leverages AndroidX libraries and is configured for modern Android development practices. The build setup includes support for Google services and is optimized for development with Android Studio.
Prerequisites
To build and run Fitness App, ensure you have the following installed:

Java Development Kit (JDK): Version 8 or higher. Set the JAVA_HOME environment variable to point to your JDK installation.
Android Studio: Recommended for managing the project and its dependencies.
Gradle: The project includes a Gradle wrapper (gradlew and gradlew.bat) to ensure consistent builds. You don’t need to install Gradle separately.
Android SDK: Configured in Android Studio or via the local.properties file (not included in version control).

Project Structure

gradlew and gradlew.bat: Gradle wrapper scripts for Unix and Windows, respectively, to ensure consistent Gradle builds.
build.gradle: Top-level Gradle build file defining repositories (Google and JCenter) and dependencies, including the Android Gradle plugin and Google services.
gradle.properties: Configuration file specifying JVM arguments, AndroidX usage, and Jetifier for library compatibility.
.gitignore: Ignores common build artifacts, IDE files, and other unnecessary files for version control.

Setup Instructions

Clone the Repository:
git clone <repository-url>
cd fitness-app


Set Up Android Studio:

Open the Fitness App project in Android Studio.
Allow Android Studio to sync the project with Gradle. This will download the necessary dependencies specified in build.gradle.


Configure local.properties:

Create a local.properties file in the project root (if not already present).
Add the path to your Android SDK, e.g.:sdk.dir=/path/to/android-sdk




Verify JAVA_HOME:

Ensure the JAVA_HOME environment variable is set to your JDK installation directory. For example:export JAVA_HOME=/path/to/jdk





Building the Project
To build Fitness App, use the Gradle wrapper:
./gradlew build

On Windows, use:
gradlew.bat build

To clean the build directory:
./gradlew clean

Running the Project

Open Fitness App in Android Studio.
Configure an Android Virtual Device (AVD) or connect a physical Android device.
Click the Run button in Android Studio, or use the Gradle wrapper:./gradlew installDebug



Dependencies

Android Gradle Plugin: Version 7.2.2
Google Services: Version 4.3.14
Additional dependencies should be defined in module-level build.gradle files.

Notes

Fitness App is configured to use AndroidX (android.useAndroidX=true) and Jetifier (android.enableJetifier=true) for compatibility with modern Android libraries.
The Gradle JVM is configured with a maximum heap size of 2048 MB (org.gradle.jvmargs=-Xmx2048m).
Ensure that the Android SDK version used matches the requirements specified in the module-level build.gradle files.

Troubleshooting

JAVA_HOME not set: If you encounter an error about JAVA_HOME, verify that the environment variable is correctly set and points to a valid JDK installation.
Gradle sync fails: Ensure that your internet connection is active, as Gradle needs to download dependencies from Google and JCenter repositories.
Build errors: Check the build.gradle files for version mismatches or missing dependencies.
