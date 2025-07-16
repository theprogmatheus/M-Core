import com.github.jengelman.gradle.plugins.shadow.ShadowJavaPlugin.Companion.shadowJar

plugins {
    id("java")
    id("com.gradleup.shadow") version "9.0.0-beta10" apply false
}

group = "com.github.theprogmatheus"
version = "1.0-SNAPSHOT"

subprojects {
    repositories {
        mavenCentral()
        maven {
            name = "papermc"
            url = uri("https://repo.papermc.io/repository/maven-public/")
        }
        maven { url = uri("https://jitpack.io") }
    }
}

tasks.test {
    useJUnitPlatform()
}
