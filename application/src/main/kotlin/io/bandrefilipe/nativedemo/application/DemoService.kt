package io.bandrefilipe.nativedemo.application

class DemoService(
    private val port: DemoPort,
) {
    fun serve(): Any {
        return port.handle()
    }
}
