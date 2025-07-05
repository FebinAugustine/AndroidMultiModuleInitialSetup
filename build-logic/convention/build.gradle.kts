plugins {
    `kotlin-dsl`
}
group = "com.febin.initialsetup.buildlogic"

dependencies {

    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
//    compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "initialsetup.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
    }
}
