plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    kotlin("kapt")
    alias(libs.plugins.daggerHiltAndroid)
    alias(libs.plugins.kotlinPluginSerialization)
}

android {
    namespace = "com.mygomii.hilt.example"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mygomii.hilt.example"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        debug {
            isDebuggable = true
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

}

kapt {
    correctErrorTypes = true
}

dependencies {
    with(libs.androidx) {
        implementation(core.ktx)
        implementation(lifecycle.runtime.ktx)
        implementation(activity.compose)
        implementation(platform(compose.bom))
        implementation(ui)
        implementation(ui.graphics)
        implementation(ui.tooling.preview)
        implementation(material3)
        androidTestImplementation(junit)
        androidTestImplementation(espresso.core)
        androidTestImplementation(platform(compose.bom))
        androidTestImplementation(ui.test.junit4)
        debugImplementation(ui.tooling)
        debugImplementation(ui.test.manifest)
        implementation(hilt.navigation)
    }

    testImplementation(libs.junit)

    with(libs.hilt) {
        implementation(android)
        kapt(android.compiler)
    }


    implementation(libs.bundles.ktor)
    implementation(libs.bundles.coroutine)

    implementation(libs.logger)

    implementation(libs.google.json)


}