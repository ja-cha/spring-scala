package com.abt

import com.abt.repository.UserRepositoryImpl
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.{Bean, Configuration}
import org.springframework.jdbc.datasource.DriverManagerDataSource

/**
  * Created by jabt on 1/27/19.
  */

@Configuration
class ApplicationConfiguration {

  @Bean
  def initUserRepositoryBean() = UserRepositoryImpl.init

//  @Value("${spring.datasource.url}")
//  var url:String= _
//  @Value("${spring.datasource.driverClassName}")
//  var driverClassName:String= _
//  @Value("${spring.datasource.username}")
//  var username:String= _
//  @Value("${spring.datasource.password}")
//  var password:String= _
//
//  @Bean
//  def initDataSource()= {
//
//    val ds = new DriverManagerDataSource()
//    ds.setUrl(url)
//    ds.setDriverClassName(driverClassName)
//    ds.setUsername(username)
//    ds.setPassword(password)
//    ds
//  }


}
