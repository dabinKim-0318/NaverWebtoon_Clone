import org.tontonhae.App
import org.tontonhae.Dep

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}


android {
    compileSdk = App.compileSdk
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = "org.tontonhae"
        minSdk = App.minSdk
        targetSdk = App.targetSdk
        versionCode = App.versionCode
        versionName = App.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            isDebuggable = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        dataBinding = true
    }
}


dependencies {
    implementation(project(":get_cookie"))
    implementation (project(":buy_cookie"))

    // Android Core
    implementation(Dep.Coroutine.core)
    implementation(Dep.Coroutine.android)
    testImplementation(Dep.Coroutine.test)
    implementation(Dep.Android.core)
    implementation(Dep.Android.appcompat)

    // Material Design
    implementation(Dep.Android.material)

    // Jetpack Fragment
    implementation(Dep.Android.fragment)

    // Jetpack Lifecycle
    implementation(Dep.Lifecycle.viewModel)
    implementation(Dep.Lifecycle.runtime)
    implementation(Dep.Lifecycle.savedState)
    implementation(Dep.Lifecycle.livedata)

    // Jetpack Security
    implementation(Dep.Security.core)

    // Dagger-Hilt
    implementation(Dep.Dagger.hiltAndroid)
    kapt(Dep.Dagger.hiltCompiler)

    // Http Client Library
    implementation(Dep.OkHttp.core)
    implementation(Dep.OkHttp.loggingInterceptor)
    implementation(Dep.OkHttp.mockWebServer)
    implementation(Dep.Retrofit.core)

    //JsonConverterLibrary
    implementation(Dep.Retrofit.converterMoshi)
    implementation(Dep.Moshi.core)
    implementation(Dep.Moshi.kotlin)

    // Logger - Timber
    implementation(Dep.timber)

    // ImageLoading Library
    implementation(Dep.glide)
    kapt(Dep.glide_compiler)

    implementation(Dep.Android.flexbox)
    implementation(Dep.Android.splashscreen)
    implementation(Dep.Android.webkit)
    implementation(Dep.Android.constraintLayout)

    implementation(Dep.circleimageview)
    implementation(Dep.CustomLibrary.keyboardListener)
    implementation(Dep.CustomLibrary.lottie)

    implementation(Dep.XmlParser.tickaroo)
    implementation(Dep.XmlParser.tickaroo_core)
    implementation(Dep.XmlParser.tickaroo_retrofit)
    kapt(Dep.XmlParser.tickaroo_processor)

    implementation(Dep.rxjava.rxjava2)
    implementation(Dep.rxjava.rxjava2_android)
    implementation(Dep.rxjava.rxjava2_adpater)
    implementation(Dep.Retrofit.converterGson)
}
