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
        viewBinding = true
    }
}


dependencies {

    implementation(Dep.Coroutine.core)
    implementation(Dep.Coroutine.android)
    testImplementation(Dep.Coroutine.test)

    implementation(Dep.Android.core)
    implementation(Dep.Android.appcompat)
    implementation(Dep.Android.material)
    implementation(Dep.Android.constraintLayout)
    implementation(Dep.Android.fragment)
    implementation(Dep.Android.flexbox)
    implementation(Dep.Android.splashscreen)
    implementation(Dep.Android.webkit)

    implementation(Dep.Navigation.fragmentKtx)
    implementation(Dep.Navigation.uiKtx)

    implementation(Dep.CustomLibrary.keyboardListener)
    implementation(Dep.CustomLibrary.lottie)

    implementation(Dep.Lifecycle.viewModel)
    implementation(Dep.Lifecycle.runtime)
    implementation(Dep.Lifecycle.savedState)
    implementation(Dep.Lifecycle.livedata)

    implementation(Dep.Dagger.hiltAndroid)
    kapt(Dep.Dagger.hiltCompiler)

    implementation(Dep.OkHttp.core)
    implementation(Dep.OkHttp.loggingInterceptor)
    implementation(Dep.OkHttp.mockWebServer)
    implementation(Dep.Retrofit.core)
    implementation(Dep.Retrofit.converterMoshi)
    implementation(Dep.Moshi.core)
    implementation(Dep.Moshi.kotlin)


    implementation(Dep.timber)
    implementation(Dep.glide)
    kapt(Dep.glide_compiler)

    implementation(Dep.stickyScrollView)
    implementation(Dep.circleimageview)

    testImplementation(Dep.Test.junit)
    androidTestImplementation(Dep.AndroidTest.core)
    androidTestImplementation(Dep.AndroidTest.rules)
    androidTestImplementation(Dep.AndroidTest.runner)
    androidTestImplementation(Dep.AndroidTest.junitExt)


    implementation(Dep.XmlParser.tickaroo)
    implementation(Dep.XmlParser.tickaroo_core)
    implementation(Dep.XmlParser.tickaroo_retrofit)
    kapt(Dep.XmlParser.tickaroo_processor)

    implementation(Dep.rxjava.rxjava2)
    implementation(Dep.rxjava.rxjava2_android)
    implementation(Dep.rxjava.rxjava2_adpater)
    implementation(Dep.Retrofit.converterGson)

    implementation(Dep.Security.core)

    testImplementation(Dep.Kotest.junitRunner)
    testImplementation(Dep.Kotest.assertionsCore)
    testImplementation(Dep.Kotest.property)

    testImplementation(Dep.CashApp.turbine)
}
