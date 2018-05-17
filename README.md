# SampleGradle
Gradle custom tasks example.

In this example we declare some Groovy classes for Gradle tasks in a separate module that builds into a jar library. Then we use this jar to create custom tasks in app module level build.gradle script.

Steps to build project:
1. Right after cloning project won't build, because top-level build.gradle script itself requires already built jar with classes, from which Gradle tasks are created. So, first of all, comment usage of gradleUtils.jar in top-level build.gradle script and usage of all classes from gradleUtils.jar in app module level build.gradle.
