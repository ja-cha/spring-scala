package com.abt

import com.abt.repository.UserRepositoryImpl
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.{Bean, Configuration}
import org.springframework.jdbc.datasource.DriverManagerDataSource

/**
  * Created by jabt on 1/27/19.
  */

@Configuration
class ApplicationConfiguration(@Value("${spring.datasource.url}") url:String,
                               @Value("${spring.datasource.driverClassName}") driverClassName:String,
                               @Value("${spring.datasource.username}") username:String,
                               @Value("${spring.datasource.password}") password:String) {

  @Bean
  def initUserRepositoryBean() =  new UserRepositoryImpl()

  @Bean
  def initDataSource()= {

    val ds = new DriverManagerDataSource()
    ds.setUrl(url)
    ds.setDriverClassName(driverClassName)
    ds.setUsername(username)
    ds.setPassword(password)
    ds
 }


}
