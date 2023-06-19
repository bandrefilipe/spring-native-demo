package io.bandrefilipe.nativedemo

import io.bandrefilipe.nativedemo.application.DemoService
import io.bandrefilipe.nativedemo.application.DemoPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeansConfiguration {

    @Bean
    fun demoService(port: DemoPort) = DemoService(port)
}
