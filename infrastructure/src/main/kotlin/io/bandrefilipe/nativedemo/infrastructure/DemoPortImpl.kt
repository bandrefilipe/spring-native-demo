package io.bandrefilipe.nativedemo.infrastructure

import io.bandrefilipe.nativedemo.application.DemoPort
import org.springframework.stereotype.Component

@Component
class DemoPortImpl : DemoPort {
    override fun handle() = "Hello, World!"
}
