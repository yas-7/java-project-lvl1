plugins {
    id("com.github.ben-manes.versions") version "0.52.0"
    id("org.sonarqube") version "6.2.0.5505"
    application
    checkstyle
}

application {
    mainClass = "hexlet.code.App"
}

sonar {
    properties {
        property("sonar.projectKey", "yas-7_java-project-lvl1")
        property("sonar.organization", "yas-7")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}


group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}