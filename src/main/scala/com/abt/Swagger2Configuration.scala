package com.abt

import com.abt.repository.UserRepositoryImpl
import org.springframework.context.annotation.{Bean, Configuration}
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

/**
  * Created by jabt on 1/27/19.
  */

@Configuration
@EnableSwagger2
class Swagger2Configuration {

  @Bean
  def api():Docket = new Docket(DocumentationType.SWAGGER_2)

}
