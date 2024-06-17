plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.davie"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}