package com.abt.service

import com.abt.controller.User
import com.abt.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component


/**
  * Created by jabt on 1/27/19.
  */
@Component
class UserService(@Autowired private val userRepository: UserRepository) {

  def listUsers(): Iterable[User] = {

    userRepository.findAll
  }
  def getUser(id: Long): Option[User] = {
    userRepository.findByUserId(id)
  }
  def createUser(user: User): Long = {
    userRepository.save(user)
  }
  def updateUser(user: User): Long = {
    userRepository.update(user)
  }
}