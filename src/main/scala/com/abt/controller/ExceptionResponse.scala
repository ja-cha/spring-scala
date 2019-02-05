package com.abt.controller

import java.util.Date

import scala.beans.BeanProperty
/**
  * Created by jabt on 2/4/19.
  */
case class ExceptionResponse(@BeanProperty timestamp:Date,  @BeanProperty messaage:String,  @BeanProperty details:String)
