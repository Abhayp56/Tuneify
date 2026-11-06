// Update notifications disabled permanently for Tuneify

package com.example.musicfy.ui.screens.update

import android.content.Context
import androidx.compose.runtime.Composable
import com.example.musicfy.core.updater.GithubRelease

/** intent action the notification opens MainActivity with, retained for backward compatibility */
const val ActionOpenUpdate = "com.example.musicfy.action.OPEN_UPDATE"

/** In-app update notifications are permanently disabled */
fun maybeNotifyUpdate(context: Context, release: GithubRelease, now: Long = System.currentTimeMillis()) {
    // No-op: in-app update checks and notifications are disabled
}

/** UpdateNotificationOpener is permanently disabled */
@Composable
fun UpdateNotificationOpener(requests: Int = 0, onOpenDevSpace: (Int) -> Unit = {}) {
    // No-op: in-app update opener is disabled
}
