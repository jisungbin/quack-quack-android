/*
 * Designed and developed by Duckie Team 2023.
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/duckie-team/quack-quack-android/blob/main/LICENSE
 */

import org.gradle.api.artifacts.ProjectDependency

// TODO: 문서화
// TODO: implementation
fun ProjectDependency.orArtifact(): Any {
    return if (useArtifact) {
        val artifact = ArtifactConfig.of(dependencyProject)
        artifact.toString()
    } else {
        this
    }
}