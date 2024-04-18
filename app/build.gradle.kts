plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kover)
}

java.toolchain.languageVersion = JavaLanguageVersion.of(17)

android {
    namespace = "com.example.app"
    compileSdk = 33
}
