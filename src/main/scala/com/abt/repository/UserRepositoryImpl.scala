package com.abt.repository

import com.abt.entity.User

import scala.collection.mutable.ArrayBuffer

/**
  * Created by jabt on 1/27/19.
  */
class UserRepositoryImpl extends UserRepository {

  var users = ArrayBuffer[User]()

  override def findAll: Iterable[User] = users

  override def findByUserId(id: Long): Option[User] = {
    users.find(u => u.id == id)
  }

  override def findUserByUsername(name: String): Option[User] = {
    users.find(u => u.name == name)

  }

  override def save(user: User): Long = {

    val u =  User(user.name, user.birthDate)
    users += u
    u.id
  }

  override def update(user: User): Long = {
    val u = User(user.name, user.birthDate)
    users += u
    u.id
  }
}

object UserRepositoryImpl {
  def apply: UserRepositoryImpl = {
    new UserRepositoryImpl()
  }

  def init = apply
}
