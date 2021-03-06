package org.muellners.finscale.identity.config

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class RestTemplateConfiguration {
    @Bean
    @Qualifier("restTemplate")
    fun restTemplate() = RestTemplate()
}
