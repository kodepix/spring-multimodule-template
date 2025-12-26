import org.gradle.accessors.dm.*

plugins {
    kotlin("plugin.spring")
    id("spring-multimodule-template.module")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

private val libs = the<LibrariesForLibs>()

dependencies {
    implementation(libs.spring.boot.starter.web)
    implementation(libs.spring.boot.starter.webflux)
    implementation(libs.spring.boot.starter.actuator)
    implementation(libs.kotlin.logging)
}
