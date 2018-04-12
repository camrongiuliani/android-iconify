# android-iconify
## About this fork
This is a fork to keep Iconify alive for [edx-android-app](https://github.com/edx/edx-app-android),
there as many modifications from the original code from @JoanZapata that EDX team made.
I removed all font packages that isn't used and only FontAwesome is avaliable for now, I also updated builds to latest Android libraries.

## Install
If you want to use this in your project, it is avaliable from Jitpack.
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

```gradle
dependencies {
    implementation 'com.github.mgambati.android-iconify:android-iconify:3.0.0'
    implementation 'com.github.mgambati.android-iconify:android-iconify-fontawesome:3.0.0'
}
```

## Docs and attribution
Original docs and code is avaliable on [JoanZapata/android-iconify](https://github.com/JoanZapata/android-iconify).