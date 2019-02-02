package com.abt

import com.abt.repository.UserRepositoryImpl
import org.springframework.context.annotation.{Bean, Configuration}

/**
  * Created by jabt on 1/27/19.
  */

@Configuration
class ApplicationConfiguration {

  @Bean
  def initUserRepositoryBean() = UserRepositoryImpl.init

}
