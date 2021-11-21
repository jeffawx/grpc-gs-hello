pluginManagement {
    plugins {
        kotlin("jvm") version "1.5.31"
        id("com.airwallex.grpc-spring") version "1.1.1"
    }

    repositories {
        mavenLocal()
        maven("https://artistry.airwallex.com/repository/lib-release/libs-release-local")
        gradlePluginPortal()
    }
}

rootProject.name = "grpc-gs-hello"

include("server", "client")
