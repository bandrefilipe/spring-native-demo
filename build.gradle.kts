import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
    id("org.springframework.boot") version "3.1.0"
    id("io.spring.dependency-management") version "1.1.0"
    id("org.graalvm.buildtools.native") version "0.9.20"
    kotlin("jvm") version "1.8.21"
    kotlin("plugin.spring") version "1.8.21"
}

dependencies {
    // Project Modules
    implementation(project(":application"))
    implementation(project(":infrastructure"))

    // Spring Starter
//    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web") // cant have this dep declared only in the
                                                                       // 'infrastructure' build script
}

/***********************************************************************************************************************
 * All Projects
 */
allprojects {
    apply {
        plugin("io.spring.dependency-management")
        plugin("org.jetbrains.kotlin.jvm")
        plugin("org.jetbrains.kotlin.plugin.spring")
    }

    group = "io.bandrefilipe"
    version = "0.0.1-SNAPSHOT"

    java {
        sourceCompatibility = JavaVersion.VERSION_17
    }

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib")
        implementation("org.jetbrains.kotlin:kotlin-reflect")

        implementation("io.github.microutils:kotlin-logging:3.0.5")
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs += listOf(
                "-Xjsr305=strict",
                "-Xemit-jvm-type-annotations",
            )
            jvmTarget = "17"
        }
    }
}

/***********************************************************************************************************************
 * Sub Projects
 */
subprojects {
    apply {
        plugin("java-library")
    }

    dependencyManagement {
        imports {
            mavenBom(SpringBootPlugin.BOM_COORDINATES)
        }
    }
}
