dependencies {
    implementation(project(":application"))

    implementation("org.springframework.boot:spring-boot-starter-web") // this dep needs to be duplicated
                                                                       // in the root script as well

    implementation("io.github.microutils:kotlin-logging:3.0.5") // now, this seems okay to exist just here
}
