<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&height=230&color=0:2B0710,50:921733,100:C82A4C&text=Tuneify&fontSize=76&fontColor=FCE3E8&fontAlignY=38&desc=Your%20music.%20Your%20device.%20Your%20rules.&descSize=20&descAlignY=60&animation=fadeIn" alt="Tuneify banner" width="100%"/>

<!-- TODO: drop your app icon at docs/assets/icon.png, then uncomment
<img src="docs/assets/icon.png" width="110" alt="Tuneify icon"/>
-->

<a href="https://github.com/Abhayp56/Tuneify">
  <img src="https://readme-typing-svg.demolab.com?font=JetBrains+Mono&weight=500&size=18&pause=1200&color=E4677F&center=true&vCenter=true&width=620&lines=Stream+%C2%B7+Download+%C2%B7+Play+local+files;10-band+EQ+with+AutoEq+headphone+profiles;Word-by-word+synced+lyrics;Zero+trackers.+Zero+ads.+100%25+open+source." alt="Typing animation" />
</a>

<br/>

<a href="https://github.com/Abhayp56/Tuneify/releases/latest"><img src="https://img.shields.io/github/v/release/Abhayp56/Tuneify?style=for-the-badge&color=C82A4C&labelColor=2B0710&label=Release" alt="Latest release"/></a>
<img src="https://img.shields.io/badge/Android-7.0%2B-C82A4C?style=for-the-badge&logo=android&logoColor=FCE3E8&labelColor=2B0710" alt="Android 7.0+"/>
<img src="https://img.shields.io/badge/Jetpack%20Compose-Material%203-C82A4C?style=for-the-badge&logo=jetpackcompose&logoColor=FCE3E8&labelColor=2B0710" alt="Jetpack Compose"/>
<a href="LICENSE"><img src="https://img.shields.io/badge/License-GPLv3-C82A4C?style=for-the-badge&labelColor=2B0710" alt="GPLv3"/></a>

<br/><br/>

**[⬇️ Download](https://github.com/Abhayp56/Tuneify/releases/latest)** &nbsp;•&nbsp; **[✨ Features](#-features)** &nbsp;•&nbsp; **[🛠️ Build](#%EF%B8%8F-build-from-source)** &nbsp;•&nbsp; **[🎨 Design](#-design-system)** &nbsp;•&nbsp; **[🤝 Contribute](#-contributing)**

</div>

<br/>

> **Tuneify** is a modern, open-source Android music player that does it all: stream, download, and play your local library in one place, wrapped in a dark **Burgundy Rose** UI with glassmorphism, a proper audio lab, and lyrics that actually move with the song.

<br/>

## 📸 Screenshots

<!--
  TODO: add 4 screenshots to docs/screenshots/ (1080x2400 works well):
  home.png, player.png, lyrics.png, equalizer.png
-->

<div align="center">
<table>
  <tr>
    <td align="center"><img src="docs/screenshots/home.png" width="190" alt="Home"/><br/><sub><b>Home</b></sub></td>
    <td align="center"><img src="docs/screenshots/player.png" width="190" alt="Player"/><br/><sub><b>Now Playing</b></sub></td>
    <td align="center"><img src="docs/screenshots/lyrics.png" width="190" alt="Lyrics"/><br/><sub><b>Synced Lyrics</b></sub></td>
    <td align="center"><img src="docs/screenshots/equalizer.png" width="190" alt="Audio Lab"/><br/><sub><b>Audio Lab</b></sub></td>
  </tr>
</table>
</div>

<br/>

## ✨ Features

<table>
  <tr>
    <td width="50%" valign="top">
      <h3>🎧 Stream & Offline</h3>
      Seamless streaming on ExoPlayer / Media3. Download tracks and playlists for offline listening, with a cache you can cap to your own storage quota.
    </td>
    <td width="50%" valign="top">
      <h3>🎚️ Audio Lab</h3>
      10-band and parametric EQ, AutoEq headphone correction profiles, spatial audio, reverb, bass boost, and ReplayGain loudness normalization.
    </td>
  </tr>
  <tr>
    <td width="50%" valign="top">
      <h3>🎤 Living Lyrics</h3>
      Time-synced, word-by-word lyrics in four animation styles: <b>Fluid</b>, <b>Glow</b>, <b>Slide</b>, and <b>Karaoke</b>. Pulled from LRCLIB, SimpMusic, and LyricsPlus.
    </td>
    <td width="50%" valign="top">
      <h3>📚 One Unified Library</h3>
      Local files and streamed music live side by side. Two-way sync with YouTube Music, plus import from Spotify, Apple Music, Tidal, or a CSV backup.
    </td>
  </tr>
  <tr>
    <td width="50%" valign="top">
      <h3>🔌 Integrations</h3>
      Discord Rich Presence with live artwork and a spinning vinyl, Last.fm / Libre.fm scrobbling, Android Auto, lockscreen controls, and home-screen widgets.
    </td>
    <td width="50%" valign="top">
      <h3>🔒 Private by Design</h3>
      No trackers. No ads. Credentials, tokens, and listening history stay encrypted on your device.
    </td>
  </tr>
</table>

<details>
<summary><b>More details</b></summary>

<br/>

**Lyric cards**
Export customizable, high-resolution lyric snapshot cards straight to your gallery (`Pictures/Tuneify`).

**Library sync**
Likes, playlists, and history sync both ways with YouTube Music, and local device audio is discovered automatically.

**Playback everywhere**
Android Auto support, lockscreen media controls, and home-screen widgets keep playback one tap away.

</details>

<br/>

## ⬇️ Install

Grab the latest APK from the **[Releases page](https://github.com/Abhayp56/Tuneify/releases/latest)** and install it. Requires **Android 7.0 (API 24)** or newer.

<br/>

## 🛠️ Build from Source

**Prerequisites**

- Android Studio Ladybug / Meerkat or newer
- Android SDK 36 (`compileSdk 36`, `minSdk 24`)
- JDK 17 or 21

```bash
# Clone
git clone https://github.com/Abhayp56/Tuneify.git
cd Tuneify

# Universal FOSS debug APK
./gradlew :app:assembleUniversalFossDebug

# Universal FOSS release APK
./gradlew :app:assembleUniversalFossRelease
```

<br/>

## 🧱 Tech Stack

<div align="center">

<img src="https://img.shields.io/badge/Kotlin-2B0710?style=for-the-badge&logo=kotlin&logoColor=E4677F"/>
<img src="https://img.shields.io/badge/Jetpack%20Compose-2B0710?style=for-the-badge&logo=jetpackcompose&logoColor=E4677F"/>
<img src="https://img.shields.io/badge/Material%203-2B0710?style=for-the-badge&logo=materialdesign&logoColor=E4677F"/>
<img src="https://img.shields.io/badge/Media3%20ExoPlayer-2B0710?style=for-the-badge&logo=android&logoColor=E4677F"/>
<img src="https://img.shields.io/badge/Hilt%20%2F%20Dagger-2B0710?style=for-the-badge&logo=google&logoColor=E4677F"/>
<img src="https://img.shields.io/badge/Room%20%2B%20SQLCipher-2B0710?style=for-the-badge&logo=sqlite&logoColor=E4677F"/>
<img src="https://img.shields.io/badge/Ktor%20%2F%20OkHttp-2B0710?style=for-the-badge&logo=ktor&logoColor=E4677F"/>
<img src="https://img.shields.io/badge/Coil%203-2B0710?style=for-the-badge&logoColor=E4677F"/>

</div>

| Layer | Choice |
|:--|:--|
| **UI** | 100% Jetpack Compose, Material 3, custom AGSL runtime shaders |
| **Media engine** | AndroidX Media3 (ExoPlayer `1.4.1`) with custom audio processors |
| **DI** | Hilt / Dagger |
| **Persistence** | Room with SQLCipher, AndroidX DataStore |
| **Images** | Coil 3 with custom blur and color-extraction transformations |
| **Networking** | Ktor Client and OkHttp with Kotlinx Serialization |

<br/>

## 🎨 Design System

Tuneify's **Premium Burgundy Rose** palette is built for late-night listening on AMOLED screens.

| | Role | Hex | Used for |
|:-:|:--|:--|:--|
| <img src="https://placehold.co/28x28/090909/090909.png" alt=""/> | **Deep Black** | `#090909` | AMOLED-black foundation |
| <img src="https://placehold.co/28x28/2B0710/2B0710.png" alt=""/> | **Deep Wine** | `#2B0710` | Ambient surfaces |
| <img src="https://placehold.co/28x28/5C0F21/5C0F21.png" alt=""/> | **Dark Burgundy** | `#5C0F21` | Sheets and containers |
| <img src="https://placehold.co/28x28/921733/921733.png" alt=""/> | **Burgundy** | `#921733` | Selected items, interactive states |
| <img src="https://placehold.co/28x28/C82A4C/C82A4C.png" alt=""/> | **Crimson Rose** ⭐ | `#C82A4C` | Primary brand accent, toggles, sliders |
| <img src="https://placehold.co/28x28/E4677F/E4677F.png" alt=""/> | **Rose Pink** | `#E4677F` | Secondary highlights |
| <img src="https://placehold.co/28x28/F2A9B7/F2A9B7.png" alt=""/> | **Soft Pink** | `#F2A9B7` | Secondary text, badges |
| <img src="https://placehold.co/28x28/FCE3E8/FCE3E8.png" alt=""/> | **Blush White** | `#FCE3E8` | Primary readable text |

<br/>

## 🤝 Contributing

Issues and pull requests are welcome. If you're planning something big, open an issue first so we can talk it through.

1. Fork the repo
2. Create a branch: `git checkout -b feature/your-idea`
3. Commit and push your changes
4. Open a pull request

<br/>

## 📄 License

Tuneify is free software released under the **[GNU General Public License v3.0](LICENSE)**.

<div align="center">

<br/>

<sub>Built with Kotlin, Compose, and a lot of late-night listening. 🌹</sub>

<img src="https://capsule-render.vercel.app/api?type=waving&height=110&color=0:C82A4C,50:921733,100:2B0710&section=footer" width="100%" alt=""/>

</div>
