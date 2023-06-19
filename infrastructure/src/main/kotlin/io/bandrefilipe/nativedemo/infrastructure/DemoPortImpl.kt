package io.bandrefilipe.nativedemo.infrastructure

import io.bandrefilipe.nativedemo.application.DemoPort
import mu.KotlinLogging
import org.springframework.stereotype.Component

private val log = KotlinLogging.logger {}

@Component
class DemoPortImpl : DemoPort {
    override fun handle(): String {
        log.info { "Handling request" }
        return "Hello, World!"
    }
}
