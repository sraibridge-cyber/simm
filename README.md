# SIMM

SIMM (System Information Metrics Monitor) is an Android app that reads the phone's own settings and sensor readings and shows them. It ships with a web monitor page packed into the app.

SIMM is the proof of concept for [Sentinel Ledger](https://github.com/sraibridge-cyber/sentinel-ledger), the third generation of Aegis-Shield.

## What it can and can't show

- It shows readings and counts. Android doesn't let an ordinary app see which app used the camera, microphone or location.
- A reading is not proof of who is watching. The app can't prove a phone isn't monitored.

## Layout

- `app/`: the Android app (package `io.aegis.monitor`).
- `csslabs-sdk/`: the SDK for the chain log, coherence measure and signals. Copied from Aegis-Shield-Core. Nothing is shared between the repos at build time.
- `monitor-assets/`: the web monitor page packed into the APK. Copied from Aegis-Shield-Core's `public/monitor`.

## Build

```
gradle :csslabs-sdk:testDebugUnitTest :app:testDebugUnitTest :app:assembleDebug
```

Release signing reads `AEGIS_KEYSTORE_PATH`, `AEGIS_KEYSTORE_PASSWORD`, `AEGIS_KEY_ALIAS` and `AEGIS_KEY_PASSWORD` from the environment. No key is stored in this repo.

## Licence

MIT. See `LICENSE`.
