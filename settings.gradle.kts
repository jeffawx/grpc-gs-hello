pluginManagement {
    plugins {
        id("org.springframework.boot") version "2.7.2"
        id("io.spring.dependency-management") version "1.0.12.RELEASE"
        kotlin("jvm") version "1.6.21"
        kotlin("plugin.spring") version "1.6.21"
        id("com.airwallex.grpc") version "1.3.0"
    }

    repositories {
        mavenLocal()
        maven("https://artistry.airwallex.com/repository/lib-release/libs-release-local")
        gradlePluginPortal()
    }
}

rootProject.name = "grpc-gs-hello"

include("server", "client")
