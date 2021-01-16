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
    const val APPCOMPAT = "androidx.appcompat:appcompat:1.2.0"
    const val CORE_KTX = "androidx.core:core-ktx:1.3.2"
}

object JacksonDependency {
    private const val VERSION = "2.11.2"

    const val JACKSON_CORE = "com.fasterxml.jackson.core:jackson-core:$VERSION"
    const val JACKSON_ANNOTATIONS = "com.fasterxml.jackson.core:jackson-annotations:$VERSION"
}

object RetrofitDependency {
    const val RETROFIT = "com.squareup.retrofit2:retrofit:2.9.0"
}

object RxJavaDependency {
    const val RXJAVA = "io.reactivex.rxjava3:rxjava:3.0.9"
}

object TestDependency {
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.3.0"
    const val EXT_JUNIT = "androidx.test.ext:junit:1.1.2"
    const val JUNIT = "junit:junit:4.13.1"
}