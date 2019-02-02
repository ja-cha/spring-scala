package com.abt.repository

import com.abt.entity.User

import scala.collection.mutable.ArrayBuffer

/**
  * Created by jabt on 1/27/19.
  */
class UserRepositoryImpl extends UserRepository {

  val users = ArrayBuffer.empty

  override def findAll: Iterable[User] = users

  override def findByUserId(userId: Long): Option[User] = None

  override def findUserByUsername(username: String): Option[User] = None

  override def save(user: User): Long = {

    val u = new User(users.size, user.username, user.password, user.enabled)
    users :+ u
    u.id
  }

  override def update(user: User): Long = {
    val u = new User(users.size, user.username, user.password, user.enabled)
    users :+ u
    u.id
  }
}

object UserRepositoryImpl {
  def apply: UserRepositoryImpl = {
    new UserRepositoryImpl()
  }

  def init = apply
}
