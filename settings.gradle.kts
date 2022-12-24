pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "monumenta-paperfork"

include("monumenta-api", "monumenta-server")
