import com.vanniktech.maven.publish.SonatypeHost.Companion.CENTRAL_PORTAL
import org.gradle.accessors.dm.*

plugins {
    kotlin("jvm")
    id("org.jlleitschuh.gradle.ktlint")
    id("org.jetbrains.dokka")
    id("com.vanniktech.maven.publish")
    signing
}

group = "io.github.kodepix"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

private val libs = the<LibrariesForLibs>()

dependencies {
    api(libs.kotlinx.coroutines.core)
    api(libs.kotlinx.coroutines.slf4j)
    api(libs.kotlin.logging)
    api(libs.kodepix.commons)

    testImplementation(libs.bundles.testing)
}

kotlin { jvmToolchain(21) }

ktlint {
    verbose = true
    outputToConsole = true
}

mavenPublishing {
    publishToMavenCentral(CENTRAL_PORTAL, automaticRelease = true)
    signAllPublications()

    pom {
        description = project.description
        inceptionYear = "2025"
        url = "https://github.com/kodepix/${project.name}/"
        licenses {
            license {
                name = "The Apache License, Version 2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                distribution = "https://www.apache.org/licenses/LICENSE-2.0.txt"
            }
        }
        developers {
            developer {
                id = "kodepix"
                name = "kodepix"
                url = "https://github.com/kodepix/"
            }
        }
        scm {
            url = "https://github.com/kodepix/${project.name}/"
            connection = "scm:git:git://github.com/kodepix/${project.name}.git"
            developerConnection = "scm:git:git://github.com/kodepix/${project.name}.git"
        }
    }
}

signing {
    // Used while error "invalid header encountered" is not fixed (https://github.com/vanniktech/gradle-maven-publish-plugin/issues/900)
    val signingPassword: String? by project
    val signingSecretKeyRingFile: String? by project
    useInMemoryPgpKeys(files(signingSecretKeyRingFile).single().readText(), signingPassword)
}

tasks {
    test { useJUnitPlatform() }

    runKtlintCheckOverKotlinScripts { dependsOn(runKtlintFormatOverKotlinScripts) }
    runKtlintCheckOverMainSourceSet { dependsOn(runKtlintFormatOverMainSourceSet) }
    runKtlintCheckOverTestSourceSet { dependsOn(runKtlintFormatOverTestSourceSet) }
}
