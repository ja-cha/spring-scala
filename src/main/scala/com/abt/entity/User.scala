package com.abt.entity

import java.util.Date
import javax.persistence.{Entity, GeneratedValue, GenerationType, Id}

import scala.beans.BeanProperty


/**
  * Created by jabt on 1/27/19.
  */
@Entity
case class User(
                 @BeanProperty
                 var name: String,

                 @BeanProperty
                 var birthDate: Date

               ) {



  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var id: Long = _


}




