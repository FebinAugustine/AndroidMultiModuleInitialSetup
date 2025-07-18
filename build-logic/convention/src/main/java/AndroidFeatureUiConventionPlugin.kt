import com.android.build.api.dsl.BaseFlavor
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import com.android.build.api.dsl.LibraryVariantDimension
import com.febin.convention.ExtensionType
import com.febin.convention.addUiLayerDependencies
import com.febin.convention.configureAndroidCompose
import com.febin.convention.configureBuildTypes
import com.febin.convention.configureKotlinAndroid
import com.febin.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.kotlin
import kotlin.run

class AndroidFeatureUiConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("initialsetup.android.library.compose")

            }
//            extensions.configure<LibraryExtension> {
//                configureKotlinAndroid(this)
//                configureAndroidCompose(this)
//
//                configureBuildTypes(
//                    commonExtension = this,
//                    extensionType = ExtensionType.LIBRARY
//                )
//
//                    defaultConfig {
//                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//                  consumerProguardFiles("consumer-rules.pro")
//                }
//            }

            dependencies {
                addUiLayerDependencies(target)
            }




        }
    }
}