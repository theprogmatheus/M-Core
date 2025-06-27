plugins {
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
    implementation("org.hibernate.orm:hibernate-core:7.0.3.Final")
    implementation("org.postgresql:postgresql:42.7.7")
    implementation("org.mongodb:mongodb-driver-sync:5.5.1")
    implementation("dev.morphia.morphia:morphia-core:2.5.0")
    implementation("redis.clients:jedis:6.0.0")
}

tasks.test {
    useJUnitPlatform()
}