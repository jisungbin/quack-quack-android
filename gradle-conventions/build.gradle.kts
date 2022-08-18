/*
 * Designed and developed by 2022 SungbinLand, Team Duckie
 *
 * [build.gradle.kts] created by Ji Sungbin on 22. 8. 14. 오전 12:51
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/sungbinland/quack-quack/blob/main/LICENSE
 */

plugins {
    `kotlin-dsl`
}

group = "team.duckie.quackquack.convention"

dependencies {
    implementation(libs.build.gradle)
    implementation(libs.build.kotlin)
}

gradlePlugin {
    val prefix = "quackquack"
    plugins {
        register("androidLintPlugin") {
            id = "$prefix.android.lint"
            implementationClass = "AndroidLintPlugin"
        }
        register("androidBenchmarkPlugin") {
            id = "$prefix.android.benchmark"
            implementationClass = "AndroidBenchmarkPlugin"
        }
        register("androidApplicationPlugin") {
            id = "$prefix.android.application"
            implementationClass = "AndroidApplicationPlugin"
        }
        register("androidApplicationComposePlugin") {
            id = "$prefix.android.application.compose"
            implementationClass = "AndroidApplicationComposePlugin"
        }
        register("androidLibraryPlugin") {
            id = "$prefix.android.library"
            implementationClass = "AndroidLibraryPlugin"
        }
        register("androidLibraryComposePlugin") {
            id = "$prefix.android.library.compose"
            implementationClass = "AndroidLibraryComposePlugin"
        }
        register("androidLibraryComposeUiTestPlugin") {
            id = "$prefix.android.library.compose.uitest"
            implementationClass = "AndroidLibraryComposeUiTestPlugin"
        }
        register("projectJacocoPlugin") {
            id = "$prefix.project.jacoco"
            implementationClass = "ProjectJacocoPlugin"
        }
        register("moduleJacocoPlugin") {
            id = "$prefix.module.jacoco"
            implementationClass = "ModuleJacocoPlugin"
        }
        register("jvmLibraryPlugin") {
            id = "$prefix.jvm.library"
            implementationClass = "JvmLibraryPlugin"
        }
    }
}