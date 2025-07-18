plugins {
    id("java")
    id("com.gradleup.shadow") version "8.3.8" apply false
}

group = "com.github.theprogmatheus"
version = "1.0-SNAPSHOT"


java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

subprojects {
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }

    plugins.withType<JavaPlugin> {
        extensions.configure<JavaPluginExtension> {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }
    }

}

tasks.test {
    useJUnitPlatform()
}
