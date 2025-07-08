//import org.jetbrains.kotlin.gradle.dsl.JvmTarget
plugins {
//    alias(libs.plugins.android.application)
//    alias(libs.plugins.kotlin.android)
//    alias(libs.plugins.initialsetup.android.application)
    alias(libs.plugins.initialsetup.android.application.compose)
    alias(libs.plugins.initialsetup.jvm.ktor)


}

android {
    namespace = "com.febin.initialsetup"
//    compileSdk = 35

    defaultConfig {
//        applicationId = "com.febin.initialsetup"
//        minSdk = 24
//        targetSdk = 35
//        versionCode = 1
//        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_11
//        targetCompatibility = JavaVersion.VERSION_11
//    }

//    buildFeatures {
//        compose = true
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
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // compose specific dependencies moved to build logic convention plugin
//    implementation(platform(libs.androidx.compose.bom))
//    androidTestImplementation(platform(libs.androidx.compose.bom))
//    implementation(libs.androidx.ui)
//    implementation(libs.androidx.ui.graphics)
//    implementation(libs.androidx.ui.tooling.preview)
//    debugImplementation(libs.androidx.ui.tooling)
//    implementation(libs.androidx.material3)
//    androidTestImplementation(libs.androidx.ui.test.junit4)
//    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(projects.core.presentation.designsystem)
    implementation(projects.core.presentation.ui)
    implementation(projects.core.domain)
    implementation(projects.core.data)
    implementation(projects.core.database)

    implementation(projects.auth.presentation)
    implementation(projects.auth.domain)
    implementation(projects.auth.data)
}