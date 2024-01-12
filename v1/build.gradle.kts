plugins {
    kotlin("multiplatform")
    alias(libs.plugins.serialization)
    id("com.android.library")
}

kotlin {
    androidTarget()
    jvm()
    applyDefaultHierarchyTemplate()
    js()

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.serialization.core)
                implementation(libs.serialization.json)
                api(libs.coroutines.core)
                api(libs.ktor.core)
                api(libs.ktor.serialization.json)
                api(libs.ktor.serialization)
                api(libs.ktor.negotiation)
                implementation(libs.pbandk.runtime)
            }
        }
    }
}

android {
    namespace = "ai.wandering.scoop.v1"
}