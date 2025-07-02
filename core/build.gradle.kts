plugins {
    `java-library`
    `maven-publish`
    id("java")
}

group = "com.github.theprogmatheus"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.projectlombok:lombok:1.18.38")
    annotationProcessor("org.projectlombok:lombok:1.18.38")

    api("org.hibernate.orm:hibernate-core:7.0.3.Final")
    api("org.postgresql:postgresql:42.7.7")
    api("org.mongodb:mongodb-driver-sync:5.5.1")
    api("dev.morphia.morphia:morphia-core:2.5.0")
    api("redis.clients:jedis:6.0.0")
    api("org.bspfsystems:yamlconfiguration:3.0.2")
    api("io.objectbox:objectbox-gradle-plugin:4.3.0")
    api("io.objectbox:objectbox-linux:4.3.0")
    api("io.objectbox:objectbox-macos:4.3.0")
    api("io.objectbox:objectbox-windows:4.3.0")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("core") {
            from(components["java"])
            artifactId = "core"
        }
    }
}