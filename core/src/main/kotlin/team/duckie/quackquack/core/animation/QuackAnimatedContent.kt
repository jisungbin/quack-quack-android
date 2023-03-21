/*
 * Designed and developed by Duckie Team, 2022~2023
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/duckie-team/quack-quack-android/blob/master/LICENSE
 */

package team.duckie.quackquack.core.animation

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.with
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import team.duckie.quackquack.core.material.QuackAnimationSpec
import team.duckie.quackquack.sugar.material.NoSugar

// TODO: `animatedTargetState` 사용 린트 제공
/**
 * 컴포저블의 상태에 변화가 있을 때 자동으로 해당 상태에 맞춰
 * 애니메이션을 적용하는 컨테이너 입니다.
 *
 * @param targetState 변화를 감지할 컴포저블의 상태값
 * @param content 상태 변화를 감지할 컴포저블 컨텐츠.
 * 인자로는 애니메이션이 적용되고 있는 [targetState] 의 값이 들어옵니다.
 * **애니메이션이 적용되기 위해선 필수로 이 값을 상태로 적용해야 합니다.**
 */
@OptIn(ExperimentalAnimationApi::class)
@NoSugar
@Composable
public fun <T> QuackAnimatedContent(
    modifier: Modifier = Modifier,
    targetState: T,
    content: @Composable AnimatedVisibilityScope.(animatedTargetState: T) -> Unit,
) {
    AnimatedContent(
        modifier = modifier,
        targetState = targetState,
        transitionSpec = {
            fadeIn(
                animationSpec = QuackAnimationSpec(),
            ) with fadeOut(
                animationSpec = QuackAnimationSpec(),
            ) using SizeTransform(
                clip = false,
                sizeAnimationSpec = { _, _ ->
                    QuackAnimationSpec()
                },
            )
        },
        content = content,
    )
}
