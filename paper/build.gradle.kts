plugins {
    id("java")
    id("com.gradleup.shadow")
}

group = "com.github.theprogmatheus"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("io.papermc.paper:paper-api:1.21.6-R0.1-SNAPSHOT")
    implementation(project(":core"))
}

tasks.test {
    useJUnitPlatform()
}


tasks.shadowJar {
    archiveBaseName.set("mcore-plugin")
    archiveClassifier.set("paper")
    archiveVersion.set(project.version.toString())

    dependsOn(":core:jar")

    mergeServiceFiles()
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE

    // Ignorar arquivos  de META-INF
    exclude("META-INF/**")
}

tasks.build {
    dependsOn(tasks.shadowJar)
}