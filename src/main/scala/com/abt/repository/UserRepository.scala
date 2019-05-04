package com.abt.repository

import com.abt.controller.User
import org.springframework.data.repository.{CrudRepository, RepositoryDefinition}

import scala.collection.JavaConverters._

/**
  * Created by jabt on 1/27/19.
  */
trait UserRepository {

  def findAll:Iterable[User]
  def findByUserId(userId: Long): Option[User]
  def findUserByUsername(username: String): Option[User]
  def save(user: User): Long
  def update(user: User): Long

}