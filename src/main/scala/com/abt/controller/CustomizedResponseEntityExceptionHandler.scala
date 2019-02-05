package com.abt.controller

import org.springframework.http.{HttpStatus, ResponseEntity}
import org.springframework.web.bind.annotation.{ExceptionHandler, RestController, ControllerAdvice}
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.util.Date

/**
  * Created by jabt on 2/4/19.
  */

@ControllerAdvice
@RestController
class CustomizedResponseEntityExceptionHandler extends  ResponseEntityExceptionHandler {

  @ExceptionHandler(value = Array(classOf[Exception]))
  final def handleAllExceptions(ex: Exception, request: WebRequest)= {
    val response: ExceptionResponse = new ExceptionResponse(new Date(), ex.getMessage, request.getDescription(false))
    new ResponseEntity[ExceptionResponse](response, HttpStatus.INTERNAL_SERVER_ERROR)
  }

  @ExceptionHandler(value = Array(classOf[UserNotFoundException]))
  final def handleUserNotFoundException(ex: UserNotFoundException, request: WebRequest) ={
    val response: ExceptionResponse = new ExceptionResponse(new Date(), ex.getMessage, request.getDescription(false))
    new ResponseEntity[ExceptionResponse](response, HttpStatus.NOT_FOUND)
  }
}
