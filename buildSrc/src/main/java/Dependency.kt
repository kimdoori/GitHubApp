object Version {
    const val KOTLIN = "1.4.21"
}

object ProjectConfig {
    const val APP_ID = "com.kimdoori.githubapp"
    const val COMPILE_TARGET_SDK_VERSION = 30
    const val MIN_SDK_VERSION = 23
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"

    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"

    const val GRADLE = "com.android.tools.build:gradle:4.1.1"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.KOTLIN}"
}

object KotlinDependency {
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Version.KOTLIN}"
}

object AndroidXDependency {
    const val CORE_KTX = "androidx.core:core-ktx:1.3.2"
    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:1.2.0-beta01"
    const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:2.2.0"
    const val MATERIAL = "com.google.android.material:material:1.3.0-rc01"
}

object HiltDependency {
    private const val VERSION = "1.0.0-alpha02"
    private const val ANDROID_VERSION = "2.31.1-alpha"

    const val LIFECYCLE_VIEWMODEL = "androidx.hilt:hilt-lifecycle-viewmodel:$VERSION"
    const val COMPILER = "androidx.hilt:hilt-compiler:$VERSION"

    const val ANDROID = "com.google.dagger:hilt-android:$ANDROID_VERSION"
    const val ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:$ANDROID_VERSION"

    const val GRADLE_PLUGIN = "com.google.dagger:hilt-android-gradle-plugin:$ANDROID_VERSION"
}

object MoshiDependency {
    const val MOSHI_KOTLIN = "com.squareup.moshi:moshi-kotlin:1.11.0"
}

object RetrofitDependency {
    private const val VERSION = "2.9.0"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:$VERSION"
    const val CONVERTER_MOSHI = "com.squareup.retrofit2:converter-moshi:$VERSION"
    const val ADAPTER_RXJAVA3 = "com.squareup.retrofit2:adapter-rxjava3:$VERSION"
}

object RxJavaDependency {
    const val RX_ANDROID = "io.reactivex.rxjava3:rxandroid:3.0.0"
}

object TestDependency {
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.3.0"
    const val EXT_JUNIT = "androidx.test.ext:junit:1.1.2"
    const val JUNIT = "junit:junit:4.13.1"
}
