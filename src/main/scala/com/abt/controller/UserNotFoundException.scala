package com.abt.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

/**
  * Created by jabt on 2/4/19.
  */
@ResponseStatus(HttpStatus.NOT_FOUND)
case class UserNotFoundException(message: String) extends RuntimeException(message)

object UserNotFoundException{
  def apply(msg:String)= new UserNotFoundException(msg)
}

