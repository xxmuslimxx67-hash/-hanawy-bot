plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.hanawy.bot"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.hanawy.bot"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
