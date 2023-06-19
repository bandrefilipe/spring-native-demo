package io.bandrefilipe.nativedemo.infrastructure

import io.bandrefilipe.nativedemo.application.DemoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/demo"])
class DemoController(
    private val service: DemoService,
) {

    @GetMapping
    fun endpoint() = service.serve()
}
