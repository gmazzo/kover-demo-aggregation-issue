plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.kover)
}

java.toolchain.languageVersion = JavaLanguageVersion.of(17)

dependencies {
    subprojects {
        kover(project)
    }
}
