package com.abt.entity

import java.util.Date
import javax.persistence.{Entity, GeneratedValue, GenerationType, Id}

import scala.beans.BeanProperty


/**
  * Created by jabt on 1/27/19.
  */
@Entity
case class User(name: String, birthDate: Date) {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty //generate getter and setter method according to Java standard
  var id: Long = _


}




