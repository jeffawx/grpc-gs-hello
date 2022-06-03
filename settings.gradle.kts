pluginManagement {
    plugins {
        kotlin("jvm") version "1.6.10"
        id("com.airwallex.grpc-spring") version "1.2.5"
    }

    repositories {
        mavenLocal()
        maven("https://artistry.airwallex.com/repository/lib-release/libs-release-local")
        gradlePluginPortal()
    }
}

rootProject.name = "grpc-gs-hello"

include("server", "client")
