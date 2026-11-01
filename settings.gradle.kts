pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "aegis-monitor"
include(":app")
include(":csslabs-sdk")
// The SDK is copied into this repository (csslabs-sdk/), so the build needs nothing outside it.
