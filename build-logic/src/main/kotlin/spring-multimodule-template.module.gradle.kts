import org.gradle.accessors.dm.*
import org.jlleitschuh.gradle.ktlint.*

plugins {
    kotlin("jvm")
    id("org.jlleitschuh.gradle.ktlint")
}

group = "io.github.kodepix"
version = "1.0"

repositories {
    mavenCentral()
}

private val libs = the<LibrariesForLibs>()

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.slf4j)
    implementation(libs.kotlin.logging)

    testImplementation(libs.bundles.testing)
}

kotlin { jvmToolchain(17) }

configure<KtlintExtension> { version = "1.7.1" } // обход ошибки HEADER_KEYWORD

ktlint {
    verbose = true
    outputToConsole = true
}

tasks {
    compileKotlin {
        /**
         * -Xjsr305=strict: Указывает, что компилятор должен строго следовать аннотациям JSR 305.
         *      Это означает, что если в Java-коде используется аннотация @Nullable,
         *      то соответствующий тип в Kotlin будет рассматриваться как nullable, а если используется аннотация @NonNull,
         *      то тип будет рассматриваться как non-nullable.
         */
        compilerOptions { freeCompilerArgs = listOf("-Xjsr305=strict") }
    }

    test { useJUnitPlatform() }

    runKtlintCheckOverKotlinScripts { dependsOn(runKtlintFormatOverKotlinScripts) }
    runKtlintCheckOverMainSourceSet { dependsOn(runKtlintFormatOverMainSourceSet) }
    runKtlintCheckOverTestSourceSet { dependsOn(runKtlintFormatOverTestSourceSet) }
}
