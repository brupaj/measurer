plugins {
    id("com.android.application") version "9.4.1"
    id("org.jetbrains.kotlin.plugin.compose") version "2.4.20"
}

kotlin {
    jvmToolchain(17)
}

android {
    namespace = "net.ogcm.measurer"
    compileSdk = 37

    defaultConfig {
        applicationId = "net.ogcm.measurer"
        minSdk = 29
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            optimization {
                enable = true
            }
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.19.1")
    implementation("androidx.activity:activity-compose:1.13.0")

    implementation(platform("androidx.compose:compose-bom:2026.09.00"))
    implementation("androidx.compose.material3:material3")
}