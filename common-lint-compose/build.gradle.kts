/*
 * Designed and developed by 2022 SungbinLand, Team Duckie
 *
 * [build.gradle.kts] created by Ji Sungbin on 22. 8. 18. 오후 7:43
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/sungbinland/quack-quack/blob/main/LICENSE
 */

plugins {
    id(PluginEnum.JvmLibrary)
    id(PluginEnum.AndroidCommonLintPlugin)
}

dependencies {
    apis(
        "org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.5.0",
    )
}
