# Tuneify 🎵

<div align="center">

**Tuneify** is an elegant, modern, and open-source Android music streaming and local audio playback application crafted with Jetpack Compose and Material 3.

Styled in a signature **Premium Burgundy Rose** visual aesthetic with fluid glassmorphism and acoustic tuning.

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-C82A4C.svg)](LICENSE)
[![Platform](https://img.shields.io/badge/Platform-Android%207.0%2B%20(API%2024%2B)-2B0710.svg)](https://developer.android.com)
[![Design](https://img.shields.io/badge/Theme-Burgundy%20Rose-921733.svg)](#brand-identity)

</div>

---

## ✨ Features

- **High-Fidelity Audio Streaming & Offline Playback**
  - Seamless streaming powered by ExoPlayer / Media3.
  - Download tracks and playlists for complete offline listening.
  - Audio cache management with customizable storage quotas.

- **Audio Lab & TuneifyEqualizer**
  - Professional acoustic engine with 10-band / parametric equalizer.
  - Headphone correction profiles powered by the AutoEq database.
  - Spatial audio, Reverb, Bass Boost, and ReplayGain loudness normalization.

- **Synchronized Lyrics Experience**
  - Time-synced, word-by-word animated lyrics (Fluid, Glow, Slide, Karaoke).
  - Multi-provider lyrics fetching via LRCLIB, SimpMusic, and LyricsPlus.
  - Export customizable, high-resolution lyric snapshot cards directly to your gallery (`Pictures/Tuneify`).

- **Unified Library & Seamless Multi-Platform Import**
  - Instant discovery and synchronization of local device audio files.
  - Two-way playlist, likes, and history synchronization with YouTube Music.
  - Import playlists and libraries from Spotify, Apple Music, Tidal, and CSV backups.

- **Rich Integrations**
  - Native Discord Rich Presence integration (live album artwork, spinning vinyl animation, and interactive track buttons).
  - Last.fm and Libre.fm real-time scrobbling and like synchronizations.
  - Android Auto, Lockscreen Media Controls, and Home Screen Widgets.

- **Privacy & Ownership**
  - Completely tracker-free and ad-free.
  - All account credentials, tokens, and listening history remain strictly encrypted on your device.

---

## 🎨 Brand Identity: Premium Burgundy Rose

Tuneify features a luxury dark palette designed for late-night listening:

| Color Role | Hex Code | Visual Preview | Description |
|:---|:---|:---:|:---|
| **Deep Black** | `#090909` | ⬛ | Midnight foundation for AMOLED screens |
| **Deep Wine** | `#2B0710` | 🍷 | Atmospheric ambient surfaces |
| **Dark Burgundy** | `#5C0F21` | 🟫 | Elevated sheets and containers |
| **Burgundy** | `#921733` | 🟥 | Selected items and interactive states |
| **Crimson Rose** | `#C82A4C` | 🌹 | **Primary Brand Accent**, active toggles, sliders |
| **Rose Pink** | `#E4677F` | 🌸 | Secondary highlights and subtle emphasis |
| **Soft Pink** | `#F2A9B7` | 🩰 | Secondary text and high-contrast badges |
| **Blush White** | `#FCE3E8` | 🤍 | Primary readable typography |

---

## 🏗️ Architecture & Tech Stack

- **UI Framework:** 100% Jetpack Compose with Material 3 and custom AGSL runtime shaders.
- **Media Engine:** AndroidX Media3 (ExoPlayer `1.4.1`) with custom audio processors.
- **Dependency Injection:** Hilt / Dagger.
- **Local Persistence:** Room Database with SQLCipher and AndroidX DataStore preferences.
- **Image Pipeline:** Coil 3 with custom blur and color-extraction transformations.
- **Network Stack:** Ktor Client & OkHttp with Kotlinx Serialization.

---

## 🚀 Building & Developing

### Prerequisites
- Android Studio Ladybug / Meerkat or newer.
- Android SDK 36 (compileSdk 36, minSdk 24).
- JDK 17 or JDK 21.

### Build Commands
```bash
# Build Universal FOSS Debug APK
./gradlew :app:assembleUniversalFossDebug

# Build Universal FOSS Release APK
./gradlew :app:assembleUniversalFossRelease
```

---

## 📄 License

Tuneify is free and open-source software distributed under the terms of the **GNU General Public License v3.0**. See the [LICENSE](LICENSE) file for more information.
 
