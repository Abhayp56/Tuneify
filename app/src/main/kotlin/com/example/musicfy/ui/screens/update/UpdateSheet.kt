package com.example.musicfy.ui.screens.update

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.layout
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.drawable.toBitmap
import com.example.musicfy.BuildConfig
import com.example.musicfy.R
import com.example.musicfy.core.updater.GithubRelease
import com.example.musicfy.core.updater.UpdateState
import com.example.musicfy.core.updater.apkFileFor
import com.example.musicfy.core.updater.downloadApk
import com.example.musicfy.core.updater.formatBytes
import com.example.musicfy.core.updater.getLatestRelease
import com.example.musicfy.core.updater.getPreviousRelease
import com.example.musicfy.core.updater.installApk
import com.example.musicfy.core.updater.isDownloaded
import com.example.musicfy.core.updater.isNewerThanInstalled
import com.example.musicfy.core.updater.parseFullVersion
import com.example.musicfy.ui.component.PopupSheetState
import com.example.musicfy.ui.component.pressBounce
import com.example.musicfy.ui.player.menu.MenuRowSurface
import com.example.musicfy.ui.player.menu.MenuSurface
import kotlinx.coroutines.launch

@Composable
fun rememberUpdateState(): androidx.compose.runtime.State<UpdateState> {
    val state = remember { mutableStateOf<UpdateState>(UpdateState.Checking) }
    LaunchedEffect(Unit) { state.value = checkUpdate(force = false) }
    return state
}

/** asks github (or the shared copy, unless force is set) whether a newer release is out */
private suspend fun checkUpdate(force: Boolean): UpdateState =
    getLatestRelease(force).fold(
        onSuccess = { release ->
            when {
                release == null -> UpdateState.UpToDate
                isNewerThanInstalled(release.version) -> UpdateState.Available(release)
                else -> UpdateState.UpToDate
            }
        },
        onFailure = { UpdateState.Failed(it.message ?: "Couldn't reach GitHub") },
    )

/** In-app updater is permanently disabled */
fun PopupSheetState.showUpdateSheet(updateState: UpdateState = UpdateState.UpToDate, onOpenDevSpace: (Int) -> Unit = {}) {
    // In-app updater is permanently disabled
}

private fun PopupSheetState.showUpdateDetailSheet(release: GithubRelease) {
    // In-app updater is permanently disabled
}

@Composable
internal fun SheetPrimaryButton(text: String, onClick: () -> Unit) {
    val interaction = remember { MutableInteractionSource() }
    Box(
        modifier = Modifier
            .pressBounce(interaction, pressedScale = 0.97f)
            .fillMaxWidth()
            .height(50.dp)
            .clip(CircleShape)
            .background(Color.White.copy(alpha = 0.26f))
            .clickable(interactionSource = interaction, indication = null, onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = text, fontSize = 17.sp, fontWeight = FontWeight.Bold, letterSpacing = (-0.4).sp)
    }
}

private val StableGreen = Color(0xFF9CF58A)
private val BetaYellow = Color(0xFFF5E27A)

/** "8.1.0 build#1165" -> "8.1.0", "8.0.2 (1100)" -> "8.0.2" */
internal fun shortVersion(version: String): String = version.substringBefore(' ')

/** In-app updater is permanently disabled */
@Composable
private fun ColumnScope.UpdateSheetContent(
    initialState: UpdateState,
    popup: PopupSheetState,
    onOpenDevSpace: (Int) -> Unit,
) {
}

@Composable
private fun ColumnScope.UpdateDetailContent(
    release: GithubRelease,
    onBack: () -> Unit,
    onLocked: (Boolean) -> Unit,
) {
}

internal fun android.content.Context.openUrl(url: String) {
    runCatching {
        startActivity(
            android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(url))
                .addFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK)
        )
    }
}

@Composable
internal fun AppIconImage(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val icon = remember(context) {
        runCatching {
            context.packageManager
                .getApplicationIcon(context.packageName)
                .toBitmap(width = 192, height = 192)
                .asImageBitmap()
        }.getOrNull()
    }

    if (icon != null) {
        Image(bitmap = icon, contentDescription = null, modifier = modifier)
    } else {
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier.background(MenuSurface),
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_tuneify_logo),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.fillMaxSize(0.6f),
            )
        }
    }
}
