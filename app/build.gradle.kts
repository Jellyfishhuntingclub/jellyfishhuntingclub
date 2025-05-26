plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
<<<<<<< HEAD
    namespace = "com.example.jellyfish"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.jellyfish"
        minSdk = 24
        targetSdk = 35
=======
<<<<<<< HEAD
    namespace = "com.example.jellyfish2"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.jellyfish2"
        minSdk = 24
        targetSdk = 35
=======
    namespace = "com.example.capst"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.capst"
        minSdk = 24
        targetSdk = 34
>>>>>>> 0301be40b6985c0e55677ccaee1876f113d3acb8
>>>>>>> dd0af85421a73ccb1e84fcb647c597e3f682c419
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> dd0af85421a73ccb1e84fcb647c597e3f682c419
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
<<<<<<< HEAD
=======
=======
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
>>>>>>> 0301be40b6985c0e55677ccaee1876f113d3acb8
>>>>>>> dd0af85421a73ccb1e84fcb647c597e3f682c419
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
    implementation("com.journeyapps:zxing-android-embedded:4.3.0")
>>>>>>> 0301be40b6985c0e55677ccaee1876f113d3acb8
>>>>>>> dd0af85421a73ccb1e84fcb647c597e3f682c419
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}