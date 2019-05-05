package com.abt.controller

import java.util.Date
import javax.persistence.{ManyToOne, _}


import scala.beans.BeanProperty


/**
  * Created by jabt on 1/27/19.
  */
@Entity
//interacting with JPA requires a bean according to the Java Bean convention
case class Post(@BeanProperty description: String) {

  //interacting with JPA requires an explicit default constructor
  def this() {
    this("")
  }

  /**
    * The JPA framework is interacting with this class via it's id property.
    * It expects a bean structured in accordance to the Java Bean convention i.e., with getter and setter methods.
    * For this reason we annotate the id field with {@link scala.beans.BeanProperty}.
    *
    */
  @Id
  @GeneratedValue(generator="post_seq")
  @SequenceGenerator(name="post_seq",sequenceName="post_seq", allocationSize=1)
  @BeanProperty
  var id: Long = _

  @BeanProperty
  @ManyToOne(fetch=FetchType.LAZY)
  var user: User = _




}




