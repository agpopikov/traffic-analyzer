plugins {
    kotlin("jvm") version "1.9.10" // Replace with your desired Kotlin version
    `java-library`
}

group = "com.example"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    // Add other dependencies here, for example:
    // implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    // testImplementation("org.jetbrains.kotlin:kotlin-test")
    // testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}
