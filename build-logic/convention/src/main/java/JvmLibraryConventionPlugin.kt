import com.android.build.api.dsl.LibraryExtension
import com.febin.convention.ExtensionType
import com.febin.convention.configureBuildTypes
import com.febin.convention.configureKotlinAndroid
import com.febin.convention.configureKotlinJvm
import com.febin.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

class JvmLibraryConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("org.jetbrains.kotlin.jvm")

            configureKotlinJvm()

        }
    }
}