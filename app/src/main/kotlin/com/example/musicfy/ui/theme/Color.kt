package com.example.musicfy.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

/**
 * ============================================================================
 * PREMIUM BURGUNDY ROSE BRAND PALETTE
 * ============================================================================
 *
 * Core brand colors:
 * - Deep Wine:      #2B0710 (Secondary surfaces, cards, backdrop glow)
 * - Dark Burgundy:  #5C0F21 (Elevated cards, borders, secondary containers)
 * - Burgundy:       #921733 (Selected surfaces, active badges, highlights)
 * - Crimson Rose:   #C82A4C (Primary interactive elements, buttons, active tracks)
 * - Rose Pink:      #E4677F (Secondary interactive elements, indicators)
 * - Soft Pink:      #F2A9B7 (Secondary typography, subtitle accents, highlights)
 * - Blush White:    #FCE3E8 (Primary typography, high-contrast labels, icons)
 * - Deep Black:     #090909 (Main application background, root foundations)
 */

val DeepWine = Color(0xFF2B0710)
val DarkBurgundy = Color(0xFF5C0F21)
val Burgundy = Color(0xFF921733)
val CrimsonRose = Color(0xFFC82A4C)
val RosePink = Color(0xFFE4677F)
val SoftPink = Color(0xFFF2A9B7)
val BlushWhite = Color(0xFFFCE3E8)
val DeepBlack = Color(0xFF090909)

// Helper shades & accents
val BurgundyRoseGlow = Color(0xFF7B1939)
val MutedPinkGray = Color(0xFF9E707B)
val BurgundyNavSurface = Color(0xFF140508)
val DarkWineSurface = Color(0xFF1D060D)

// Subtle Brand Gradients
val BurgundyRoseGradient1 = Brush.verticalGradient(
    listOf(DeepBlack, BurgundyRoseGlow)
)
val BurgundyRoseGradient2 = Brush.verticalGradient(
    listOf(DeepWine, DarkBurgundy)
)
val BurgundyRoseGradient3 = Brush.verticalGradient(
    listOf(DarkBurgundy, Burgundy)
)
val BottomSheetBurgundyGradient = Brush.verticalGradient(
    listOf(DeepWine, DarkBurgundy, DeepBlack)
)
val PlayerDarkGradient = Brush.verticalGradient(
    0f to DarkBurgundy,
    0.55f to DeepWine,
    1f to DeepBlack,
)

