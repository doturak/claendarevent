plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.testapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.testapplication"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    packagingOptions {
        exclude ("META-INF/DEPENDENCIES")
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation ("com.google.android.gms:play-services-auth:18.0.0")
    implementation ("pub.devrel:easypermissions:3.0.0")
    implementation("com.google.api-client:google-api-client-android:1.22.0") {
        exclude (group= "org.apache.httpcomponents")
    }
    implementation("com.google.apis:google-api-services-calendar:v3-rev235-1.22.0") {
        exclude (group= "org.apache.httpcomponents")
    }

    //링크대로 넣고 이거 추가로 넣어줘야 함
    configurations.all {
        exclude (group= "com.google.guava", module= "listenablefuture")
    }

    implementation ("com.google.api-client:google-api-client:1.31.5")
    implementation ("com.google.oauth-client:google-oauth-client-jetty:1.31.5")
    implementation ("com.google.http-client:google-http-client-jackson2:1.40.1")
}
