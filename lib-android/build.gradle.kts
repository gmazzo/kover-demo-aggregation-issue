plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kover)
}

java.toolchain.languageVersion = JavaLanguageVersion.of(17)

android {
    namespace = "com.example.lib"
    compileSdk = 33
}
