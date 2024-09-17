
group = "org.example"
version = "1.0.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

plugins {
    kotlin("jvm") version "1.9.10"
    kotlin("plugin.spring") version "1.9.25"
    kotlin("plugin.jpa") version "1.9.25"
    kotlin("kapt") version "1.9.25" // Add this line
    id("org.springframework.boot") version "3.3.3"
    id("io.spring.dependency-management") version "1.1.6"
//    id("org.jlleitschuh.gradle.ktlint") version "11.4.0"
}

kapt {
    arguments {
        arg("querydsl.entityAccessors", "true")
        arg("querydsl.useKotlinSerialization", "true")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    runtimeOnly ("com.mysql:mysql-connector-j")
    implementation("com.querydsl:querydsl-jpa")
    kapt("com.querydsl:querydsl-apt")
    kapt("org.hibernate.javax.persistence:hibernate-jpa-2.1-api:1.0.0.Final")

}

tasks.jar {
    archiveBaseName.set("todo")
    archiveVersion.set("")
}

//ktlint {
//    // ktlint 설정
//    android.set(false)
//    outputToConsole.set(true)
//    ignoreFailures.set(false)
//    debug.set(true)
//    verbose.set(true)
//}


//tasks.named("ktlint") {
//    doLast {
//        println("Formatting code with ktlint...")
//    }
//}

tasks.withType<Test> {
    useJUnitPlatform()
}
