package com.gpetuhov.android.gradleutils

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class MyTask extends DefaultTask {
    // Value of this property can be initialized from build.gradle script
    String userName = "Uncle Bob"

    @TaskAction
    def myAction() {
        println("Hello, ${userName}")
    }
}