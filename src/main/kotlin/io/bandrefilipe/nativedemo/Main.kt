package io.bandrefilipe.nativedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringNativeDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringNativeDemoApplication>(*args)
}
