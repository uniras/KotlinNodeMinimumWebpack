plugins {
    id("org.jetbrains.kotlin.js") version "1.7.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.7")
    implementation(npm("webpack-node-externals", "2.5.1"))
    //使用するNodeモジュールがある場合はこのようにして追加
    //implementation(npm("express", "4.18.2"))
}

kotlin {
    js {
        browser {
            webpackTask {
                outputFileName = "main.js"  //出力ファイル名
                output.libraryTarget = "commonjs2"
            }
        }

        nodejs {
        }
    }
}