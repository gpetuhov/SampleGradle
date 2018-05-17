# SampleGradle
Gradle custom tasks example.

In this example we declare some Groovy classes for Gradle tasks in a separate module that builds into a jar library. Then we use this jar to create custom tasks in app module level build.gradle script.

## Building the project
Right after cloning project won't build, because top-level build.gradle script itself requires already built jar with classes, from which Gradle tasks are created. So, to build the project, follow these steps:
1. Comment usage of gradleUtils.jar in top-level build.gradle script and usage of all classes from gradleUtils.jar in app module level build.gradle.
2. Build gradleUtils.jar.
3. Uncomment back all code from step 1.
4. Run Gradle Sync and build the project.
