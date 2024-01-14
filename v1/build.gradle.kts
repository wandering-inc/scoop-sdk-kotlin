import com.vanniktech.maven.publish.SonatypeHost

plugins {
    kotlin("multiplatform")
    alias(libs.plugins.serialization)
    id("com.android.library")
    id("com.vanniktech.maven.publish")
}

kotlin {
    androidTarget()
    jvm()
    applyDefaultHierarchyTemplate()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    js()

    sourceSets {
        commonMain {
            dependencies {
                api(libs.serialization.core)
                api(libs.serialization.json)
                api(libs.coroutines.core)
                api(libs.ktor.core)
                api(libs.ktor.serialization.json)
                api(libs.ktor.serialization)
                api(libs.ktor.negotiation)
                api(libs.pbandk.runtime)
            }
        }
    }
}

android {
    namespace = "ai.wandering.scoop.v1"

    kotlin {
        jvmToolchain(17)
    }

    defaultConfig {
        minSdk = 24
    }

    compileSdk = 34
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.S01)
    signAllPublications()
}
