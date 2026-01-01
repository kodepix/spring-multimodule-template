plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.kotlin.spring.gradle.plugin)
    implementation(libs.kotlin.jpa.gradle.plugin)
    implementation(libs.spring.boot.gradle.plugin)
    implementation(libs.spring.dependency.management.gradle.plugin)
    implementation(libs.ktlint.gradle)

    // A hack to make version catalogs accessible from buildSrc sources
    // https://github.com/gradle/gradle/issues/15383#issuecomment-779893192
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}

kotlin { jvmToolchain(17) }
