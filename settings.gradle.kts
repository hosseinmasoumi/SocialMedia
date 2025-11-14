pluginManagement {
    repositories {
        // گوگل فقط برای پلاگین‌های اندروید/اندرویدX/گوگل
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }

        // میرورها
        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://gradle.jamko.ir") }
        maven { url = uri("https://en-mirror.ir") }
        maven { url = uri("https://google403.ir") }
        maven { url = uri("https://maven.myket.ir") }

        // منابع رسمی (Fallback)
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        // منابع رسمی (اولویت پایداری)
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }

        // میرورها (برای دسترسی سریع‌تر و دور زدن تحریم‌ها)
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri("https://maven.aliyun.com/repository/central") }
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://gradle.jamko.ir") }
        maven { url = uri("https://en-mirror.ir") }
        maven { url = uri("https://google403.ir") }
        maven { url = uri("https://maven.myket.ir") }
        // اختیاری: مخزن ملی ایران
        // maven { url = uri("https://repo.iranrepo.ir/repository/maven-public/") }
        maven { url =uri("https://jitpack.io") }

        // اختیاری: مخزن Snapshot (برای لایبرری‌هایی که نسخه Snapshot دارند)
        // maven { url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/") }
    }
}

rootProject.name = "socialtest"
include(":app")