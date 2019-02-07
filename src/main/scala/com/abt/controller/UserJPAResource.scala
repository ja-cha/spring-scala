package com.abt.controller

import javax.sql.DataSource

import com.abt.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.{HttpStatus, ResponseEntity}
import org.springframework.web.bind.annotation.{PostMapping, _}
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import java.lang.Iterable


/**
  * Created by jabt on 1/27/19.
  */
@RestController
@RequestMapping(path = Array("/jpa"))
class UserJPAResource(@Autowired val userRepository: UserRepository,
                      @Autowired val dataSource: DataSource) {

  @GetMapping(path = Array("/users"))
  def getAllUsers(): Iterable[User] = {
    userRepository.findAll()
  }

  @GetMapping(path = Array("/users/{id}"))
  def getUser(@PathVariable id: Long): User = {
    userRepository.findById(id) match {
      case user if (user.isPresent) => user.get()
      case _ => throw UserNotFoundException(s"id-$id")
    }
  }

  //  @PutMapping(path = Array("/user/{id}"))
  //  def updateUser(@RequestBody user: User): ResponseEntity[String] = {
  //    val uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri
  //    new ResponseEntity(uri.getPath, HttpStatus.OK)
  //  }
  //
  //  @PostMapping(path = Array("/user"))
  //  def createUser(@RequestBody user: User): ResponseEntity[String] = {
  //    val id = userRepository.save(user)
  //    val uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").build(s"$id")
  //    new ResponseEntity(uri.getPath, HttpStatus.CREATED)
  //  }

  @DeleteMapping(path = Array("/users/{id}"))
  def deleteUser(@PathVariable id: Long) = {
    userRepository.deleteById(id)
  }
}