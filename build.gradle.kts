import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
}

group = "demo"
version = "0.0.1-SNAPSHOT"

allprojects {
    repositories {
        maven("https://artistry.airwallex.com/repository/lib-release/libs-release-local")
        mavenCentral()
    }
}

subprojects {
    java.sourceCompatibility = JavaVersion.VERSION_11

    tasks {
        withType<KotlinCompile> {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
                jvmTarget = "11"
            }
        }

        test {
            useJUnitPlatform()
        }
    }
}
