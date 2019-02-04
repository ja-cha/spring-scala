package com.abt.entity

import java.util.Date
import javax.persistence.{Entity, GeneratedValue, GenerationType, Id}

import scala.beans.BeanProperty


/**
  * Created by jabt on 1/27/19.
  */
@Entity
case class User(name: String, birthDate: Date) {

  /**
    * The JPA framework is interacting with this class via it's id property.
    * It expects a bean structured in accordance to the Java Bean convention i.e., with getter and setter methods.
    * For this reason we annotate the id field with {@link scala.beans.BeanProperty}.
    *
    */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var id: Long = _


}




