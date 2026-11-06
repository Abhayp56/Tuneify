# TUNEIFY
### A refined music experience. Engineered for listeners.

<p align="center">
  <strong>Discover. Listen. Customize. Experience.</strong>
</p>

<p align="center">
  An open-source Android music application bringing streaming, local playback, advanced audio processing, and a unified music library into one cohesive experience.
</p>

<p align="center">
  <a href="https://github.com/Abhayp56/Tuneify/releases">
    <strong>Download Tuneify</strong>
  </a>
  &nbsp;·&nbsp;
  <a href="https://github.com/Abhayp56/Tuneify/issues">Report an Issue</a>
  &nbsp;·&nbsp;
  <a href="https://github.com/Abhayp56/Tuneify">Source Code</a>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Platform-Android-921733?style=for-the-badge&logo=android&logoColor=white" alt="Android">
  <img src="https://img.shields.io/badge/Language-Kotlin-C82A4C?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin">
  <img src="https://img.shields.io/badge/UI-Jetpack%20Compose-E4677F?style=for-the-badge&logo=jetpackcompose&logoColor=white" alt="Jetpack Compose">
  <img src="https://img.shields.io/badge/License-GPL--3.0-5C0F21?style=for-the-badge" alt="GPL-3.0">
</p>

---

## Overview

Tuneify is a modern, open-source Android music application designed to bring multiple music experiences together under a single interface.

Built with Kotlin and Jetpack Compose, it combines online music sources, local audio playback, library management, synchronized lyrics, and advanced audio customization.

Its design philosophy is centered around three principles:

- **Control:** Give listeners meaningful control over their music and audio experience.
- **Continuity:** Bring different music sources and personal libraries together.
- **Craft:** Deliver a cohesive interface with attention to visual detail and interaction design.

Tuneify features a distinctive **Premium Burgundy Rose** design language, combining dark surfaces, rich burgundy tones, subtle glass-inspired elements, and refined typography.

---

## Product Capabilities

### 01 — Music Discovery & Playback

A unified listening experience designed around online streaming and personal music collections.

- Music streaming through supported online providers.
- Local device audio discovery and playback.
- Background playback powered by AndroidX Media3.
- Queue management and playback controls.
- Offline downloads for supported content.
- Audio cache management with configurable storage quotas.
- Lock screen and notification media controls.

### 02 — Audio Lab

A dedicated audio customization environment for listeners who want greater control over sound reproduction.

- 10-band and parametric equalizer capabilities.
- Headphone correction profiles using AutoEq data.
- Bass Boost and Reverb processing.
- Spatial audio controls.
- ReplayGain loudness normalization.
- Custom audio processing components.

### 03 — Synchronized Lyrics

An integrated lyrics experience designed to complement music playback.

- Time-synchronized lyrics.
- Word-by-word lyric highlighting where supported.
- Multiple visual presentation styles, including Karaoke, Glow, Slide, and Fluid.
- Multi-provider lyrics retrieval through LRCLIB, SimpMusic, and LyricsPlus.
- Customizable lyric snapshot exports.
- High-resolution lyric cards saved to `Pictures/Tuneify`.

### 04 — Unified Music Library

Tools for managing personal music collections and supported external libraries.

- Automatic local audio discovery.
- Playlist creation and management.
- Favorites, likes, and listening history.
- Supported YouTube Music synchronization.
- Playlist and library import from supported Spotify, Apple Music, and Tidal sources.
- CSV-based library import and backup workflows.

### 05 — Connected Listening

Tuneify integrates with supported services and Android experiences.

| Integration | Capability |
|---|---|
| Discord | Rich Presence and playback activity |
| Last.fm | Listening scrobbling and supported interactions |
| Libre.fm | Listening scrobbling |
| Android Auto | Compatible in-car media experience |
| Google Cast | Supported casting functionality |
| Shazam | Music recognition integration |
| Home Screen Widgets | Playback access and controls |

*Integration availability and functionality may depend on provider APIs, account permissions, device capabilities, and application configuration.*

---

## Design System

### Premium Burgundy Rose

Tuneify uses a custom dark visual identity designed to create a consistent experience across its interface.

| Design Token | Color | Hex |
|---|---|---|
| Deep Black | <img src="https://placehold.co/18x18/090909/090909.png" alt="Deep Black"> | `#090909` |
| Deep Wine | <img src="https://placehold.co/18x18/2B0710/2B0710.png" alt="Deep Wine"> | `#2B0710` |
| Dark Burgundy | <img src="https://placehold.co/18x18/5C0F21/5C0F21.png" alt="Dark Burgundy"> | `#5C0F21` |
| Burgundy | <img src="https://placehold.co/18x18/921733/921733.png" alt="Burgundy"> | `#921733` |
| Crimson Rose | <img src="https://placehold.co/18x18/C82A4C/C82A4C.png" alt="Crimson Rose"> | `#C82A4C` |
| Rose Pink | <img src="https://placehold.co/18x18/E4677F/E4677F.png" alt="Rose Pink"> | `#E4677F` |
| Soft Pink | <img src="https://placehold.co/18x18/F2A9B7/F2A9B7.png" alt="Soft Pink"> | `#F2A9B7` |
| Blush White | <img src="https://placehold.co/18x18/FCE3E8/FCE3E8.png" alt="Blush White"> | `#FCE3E8` |

The design system emphasizes:

- Consistent surface hierarchy.
- High-contrast typography.
- Restrained gradients and visual effects.
- Cohesive interactive states.
- Carefully balanced accent colors.

---

## Technology Stack

Tuneify is developed using modern Android development technologies.

| Component | Technology |
|---|---|
| Programming Language | Kotlin |
| UI Framework | Jetpack Compose |
| Design System | Material 3 |
| Media Playback | AndroidX Media3 / ExoPlayer |
| Dependency Injection | Hilt / Dagger |
| Local Database | Room |
| Database Encryption | SQLCipher |
| Preferences | AndroidX DataStore |
| Image Loading | Coil 3 |
| Networking | Ktor Client / OkHttp |
| Serialization | Kotlinx Serialization |
| Audio Processing | Custom audio processors |
| Runtime Visual Effects | AGSL shaders |

### Architecture Principles

The project is structured around modular Android components and separation of responsibilities.

- Declarative UI development with Jetpack Compose.
- Dependency injection for application services.
- Persistent local storage through Room.
- Asynchronous operations using Kotlin coroutines and Flow.
- Dedicated media playback infrastructure.
- Network communication through configured HTTP clients.

---

## Getting Started

### Requirements

| Requirement | Version |
|---|---|
| Android Version | Android 7.0+ |
| Minimum SDK | API 24 |
| Compile SDK | API 36 |
| JDK | 17 or 21 |
| Android Studio | Ladybug / Meerkat or newer |

### Clone the Repository

```bash
git clone https://github.com/Abhayp56/Tuneify.git

cd Tuneify
```

### Build the Debug APK

**Linux / macOS**

```bash
./gradlew :app:assembleUniversalFossDebug
```

**Windows PowerShell**

```powershell
.\gradlew.bat :app:assembleUniversalFossDebug
```

### Build the Release Variant

```bash
./gradlew :app:assembleUniversalFossRelease
```

The generated APKs are located under:

```text
app/build/outputs/apk/
```

*Release builds may require appropriate signing configuration before distribution.*

---

## Download

Get the latest published version of Tuneify from the official GitHub Releases page.

<p align="center">
  <a href="https://github.com/Abhayp56/Tuneify/releases">
    <img src="https://img.shields.io/badge/GET_TUNEIFY-DOWNLOAD_LATEST_RELEASE-C82A4C?style=for-the-badge&logo=android&logoColor=white" alt="Download Tuneify">
  </a>
</p>

**Compatibility:** Android 7.0 and above.

---

## Project Structure

The application is organized into an Android Gradle project with application modules and supporting resources.

```text
Tuneify/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   ├── res/
│   │   │   └── AndroidManifest.xml
│   │   ├── universalFoss/
│   │   └── test/
│   └── build.gradle.kts
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── LICENSE
└── README.md
```

*The structure above is a simplified overview; actual source directories and build variants may differ.*

---

## Open Source & Licensing

Tuneify is distributed under the **GNU General Public License v3.0 (GPL-3.0)**.

The project builds upon existing open-source software and libraries. Their respective licenses and attribution requirements must be respected.

Contributions, modifications, and redistribution must comply with the applicable licenses, including the project's GPL-3.0 obligations.

See the [LICENSE](LICENSE) file for complete licensing information.

---

## Contributing

Contributions are welcome.

If you encounter a bug, have an improvement in mind, or want to contribute to development:

1. Fork the repository.
2. Create a dedicated feature branch.
3. Implement and test your changes.
4. Submit a pull request describing your contribution.

For bugs and feature requests, use the [GitHub Issues](https://github.com/Abhayp56/Tuneify/issues) page.

Please include sufficient information to reproduce reported issues.

---

## Acknowledgements

Tuneify is made possible by the work of the open-source community.

Special appreciation goes to the developers, maintainers, and contributors behind the libraries, frameworks, APIs, and services that make this project possible.

All third-party trademarks and service names belong to their respective owners.

---

<p align="center">
  <strong>TUNEIFY</strong>
  <br>
  <sub>A different perspective on listening.</sub>
  <br><br>
  <a href="https://github.com/Abhayp56/Tuneify">GitHub Repository</a>
  &nbsp;·&nbsp;
  <a href="https://github.com/Abhayp56/Tuneify/releases">Releases</a>
  &nbsp;·&nbsp;
  <a href="https://github.com/Abhayp56/Tuneify/issues">Support</a>
</p>
