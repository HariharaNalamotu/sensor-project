plugins {
    id 'com.android.application'
    id 'kotlin-android'
}

android {
    compileSdkVersion 34

    defaultConfig {
        applicationId "com.example.test"
        minSdkVersion 24
        targetSdkVersion 34
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = '1.8'
    }

    buildFeatures {
        viewBinding true
    }
}

dependencies {
    implementation 'androidx.core:core-ktx'
    implementation 'androidx.appcompat:appcompat'
    implementation 'com.google.android.material:material'
    implementation 'androidx.constraintlayout:constraintlayout'
    implementation 'androidx.navigation:navigation-fragment-ktx'
    implementation 'androidx.navigation:navigation-ui-ktx'

    testImplementation 'junit:junit'
    androidTestImplementation 'androidx.test.ext:junit'
    androidTestImplementation 'androidx.test.espresso:espresso-core'
}
plugins {
    id 'com.android.application'
    id 'kotlin-android'
}

android {
    compileSdkVersion 34

    defaultConfig {
        applicationId "com.example.test"
        minSdkVersion 24
        targetSdkVersion 34
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = '1.8'
    }

    buildFeatures {
        viewBinding true
    }
}

dependencies {
    implementation 'androidx.core:core-ktx'
    implementation 'androidx.appcompat:appcompat'
    implementation 'com.google.android.material:material'
    implementation 'androidx.constraintlayout:constraintlayout'
    implementation 'androidx.navigation:navigation-fragment-ktx'
    implementation 'androidx.navigation:navigation-ui-ktx'

    testImplementation 'junit:junit'
    androidTestImplementation 'androidx.test.ext:junit'
    androidTestImplementation 'androidx.test.espresso:espresso-core'
}
