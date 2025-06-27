plugins {
    id("java")
    id("com.gradleup.shadow")
}

group = "com.github.theprogmatheus"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("com.velocitypowered:velocity-api:3.4.0-SNAPSHOT")
    implementation(project(":core"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.shadowJar {
    archiveBaseName.set("mcore-plugin")
    archiveClassifier.set("velocity")
    archiveVersion.set(project.version.toString())

    dependsOn(":core:jar")
    exclude("META-INF/**")
}

tasks.build {
    dependsOn(tasks.shadowJar)
}