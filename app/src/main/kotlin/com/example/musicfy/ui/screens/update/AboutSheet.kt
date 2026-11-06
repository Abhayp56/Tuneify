// about app, upstream credits and license sheets pushed from the version sheet or the musicfy page

package com.example.musicfy.ui.screens.update

import androidx.annotation.DrawableRes
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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicfy.BuildConfig
import com.example.musicfy.R
import com.example.musicfy.ui.component.PopupSheetState
import com.example.musicfy.ui.component.pressBounce
import com.example.musicfy.ui.player.menu.MenuRowSurface

fun PopupSheetState.showAboutSheet(onOpenDevSpace: (Int) -> Unit = {}) {
    val popup = this
    show(buttonBar = { SheetPrimaryButton(text = "Done", onClick = popup::dismiss) }) {
        AboutSheetContent()
    }
}

@Composable
private fun ColumnScope.AboutSheetContent() {
    val installed = shortVersion(BuildConfig.VERSION_NAME)
    val scrollState = rememberScrollState()
    val ringScrollRangePx = with(LocalDensity.current) { 180.dp.toPx() }

    Box(Modifier.fillMaxWidth()) {
        // zero-size layout places the spinning ring behind the top icon without pushing the column down
        VersionRing(
            text = "TUNEIFY $installed",
            scrollProgress = { scrollState.value / ringScrollRangePx },
            modifier = Modifier
                .align(Alignment.TopCenter)
                .layout { measurable, constraints ->
                    val placeable = measurable.measure(
                        constraints.copy(
                            minWidth = 0,
                            minHeight = 0,
                            maxWidth = Constraints.Infinity,
                            maxHeight = Constraints.Infinity,
                        ),
                    )
                    layout(0, 0) {
                        placeable.place(x = -placeable.width / 2, y = (-166).dp.roundToPx())
                    }
                },
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(scrollState),
        ) {
            Spacer(Modifier.height(18.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .clip(RoundedCornerShape(24.dp))
                        .background(Color(0xFF2B0710))
                        .border(1.dp, Color(0xFF5C0F21), RoundedCornerShape(24.dp)),
                    contentAlignment = Alignment.Center,
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_tuneify_icon),
                        contentDescription = "Tuneify",
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(24.dp)),
                        contentScale = ContentScale.Fit,
                    )
                }
                Spacer(Modifier.height(14.dp))
                Text(
                    text = "About Tuneify",
                    fontSize = 32.sp,
                    lineHeight = 36.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = (-1.2).sp,
                    color = Color(0xFFFCE3E8),
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = "Tuneify | $installed",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    letterSpacing = (-0.3).sp,
                    color = Color(0xFFF2A9B7),
                )
            }

            Spacer(Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(22.dp))
                    .background(Color(0xFF2B0710))
                    .border(1.dp, Color(0xFF5C0F21).copy(alpha = 0.6f), RoundedCornerShape(22.dp))
                    .padding(horizontal = 20.dp, vertical = 18.dp),
            ) {
                Text(
                    text = "Tuneify is a music application built with a focus on simplicity, personalization and a better listening experience.",
                    fontSize = 15.sp,
                    lineHeight = 22.sp,
                    fontWeight = FontWeight.Medium,
                    letterSpacing = (-0.3).sp,
                    color = Color(0xFFFCE3E8),
                )
            }

            Spacer(Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(22.dp))
                    .background(Color(0xFF2B0710))
                    .border(1.dp, Color(0xFF5C0F21), RoundedCornerShape(22.dp))
                    .padding(horizontal = 20.dp, vertical = 20.dp),
            ) {
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFC82A4C)),
                        )
                        Text(
                            text = "CREATED & DEVELOPED BY",
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 0.8.sp,
                            color = Color(0xFFE4677F),
                        )
                    }
                    Spacer(Modifier.height(10.dp))
                    Text(
                        text = "Abhay",
                        fontSize = 26.sp,
                        lineHeight = 30.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = (-0.8).sp,
                        color = Color(0xFFFCE3E8),
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = "Creator and Developer of Tuneify",
                        fontSize = 13.5.sp,
                        fontWeight = FontWeight.Medium,
                        letterSpacing = (-0.2).sp,
                        color = Color(0xFFF2A9B7),
                    )
                }
            }

            Spacer(Modifier.height(24.dp))
        }
    }
}
