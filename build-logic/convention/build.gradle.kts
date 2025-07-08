plugins {
    `kotlin-dsl`
//    alias(libs.plugins.kotlin.serialization)

}
repositories {
    // Ensure these are here to resolve plugins for build-logic itself
    gradlePluginPortal()
    google()
    mavenCentral()
}
group = "com.febin.initialsetup.buildlogic"

dependencies {


    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)

}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "initialsetup.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose") {
            id = "initialsetup.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("androidLibrary") {
            id = "initialsetup.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "initialsetup.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("androidFeatureUi") {
            id = "initialsetup.android.feature.ui"
            implementationClass = "AndroidFeatureUiConventionPlugin"
        }
        register("androidRoom") {
            id = "initialsetup.android.room"
            implementationClass = "AndroidRoomConventionPlugin"
        }
        register("jvmLibrary") {
            id = "initialsetup.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }
        register("jvmKtor") {
            id = "initialsetup.jvm.ktor"
            implementationClass = "JvmKtorConventionPlugin"
        }
    }
}
