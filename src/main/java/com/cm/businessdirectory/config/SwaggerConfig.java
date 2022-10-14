package com.cm.businessdirectory.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SwaggerConfig {

    @Bean
    OpenAPI icwDirectoryOpenApi() {
        return new OpenAPI()
                .info((new Info()
                        .title("Business Directory"))
                        .description("Application for managing a business directory in International Creative Woman")
                        .version("1.0"));
    }

}
