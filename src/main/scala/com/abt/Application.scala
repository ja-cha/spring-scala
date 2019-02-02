package com.abt

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
  * Created by jabt on 1/27/19.
  */
@SpringBootApplication
class Application {}

object Application extends App {
  SpringApplication.run(classOf[Application]);
}
