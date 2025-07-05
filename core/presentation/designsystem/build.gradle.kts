import org.jetbrains.kotlin.gradle.dsl.JvmTarget
plugins {
//    alias(libs.plugins.android.library)
//    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.initialsetup.android.library.compose)
}

android {
    namespace = "com.febin.core.presentation.designsystem"
//    compileSdk = 35
//
//    defaultConfig {
//        minSdk = 24
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        consumerProguardFiles("consumer-rules.pro")
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_11
//        targetCompatibility = JavaVersion.VERSION_11
//    }

}
// Add or modify the kotlin block like this:
//kotlin {
//    compilerOptions {
//        jvmTarget.set(JvmTarget.fromTarget(libs.versions.kotlinJvmTarget.get()))
//        // You might have other compiler options here as well
//        // freeCompilerArgs.add("-Xcontext-receivers") // Example
//    }
//}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}