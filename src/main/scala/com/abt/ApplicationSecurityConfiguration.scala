package com.abt

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

/**
  * Created by jabt on 2/3/19.
  */
@Configuration
class ApplicationSecurityConfiguration  extends WebSecurityConfigurerAdapter{
    override
    def configure(web: WebSecurity)={
      web
        .ignoring()
        .antMatchers("/**");
    }

}