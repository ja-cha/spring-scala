package com.abt.controller

import java.util.Date
import javax.persistence._

import scala.beans.BeanProperty


/**
  * Created by jabt on 1/27/19.
  */
@Entity
//interacting with JPA requires a bean according to the Java Bean convention
case class User(
             //@OneToMany(mappedBy="user") posts:List[Post],
                @BeanProperty birthDate: Date,
                @BeanProperty name: String) {

  //interacting with JPA requires an explicit default constructor
  def this() {
    this(new Date(), "")
  }

  /**
    * The JPA framework is interacting with this class via it's id property.
    * It expects a bean structured in accordance to the Java Bean convention i.e., with getter and setter methods.
    * For this reason we annotate the id field with {@link scala.beans.BeanProperty}.
    *
    */
  @Id
  @GeneratedValue(generator="user_seq_gen")
  @SequenceGenerator(name="user_seq_gen",sequenceName="user_seq", initialValue = 10, allocationSize = 100)
  @BeanProperty
  var id: Long = _



}




