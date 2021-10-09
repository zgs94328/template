package com.github.zgs94328.template.services

import com.intellij.openapi.project.Project
import com.github.zgs94328.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
