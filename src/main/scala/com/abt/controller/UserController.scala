package com.abt.controller

import javax.sql.DataSource

import com.abt.entity.User
import com.abt.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.{HttpStatus, ResponseEntity}
import org.springframework.web.bind.annotation.{PostMapping, _}
import org.springframework.web.servlet.support.ServletUriComponentsBuilder

/**
  * Created by jabt on 1/27/19.
  */
@RestController
@RequestMapping(path = Array("/api"))
class UserController(@Autowired val userService: UserService, @Autowired val dataSource: DataSource) {

  @GetMapping(path = Array("/users"))
  def getAllUsers(): Iterable[User] = {
    userService.listUsers
  }

  @GetMapping(path = Array("/users/{id}"))
  def getUser(@PathVariable id: Long): Option[User] = {
    userService.getUser(id)
  }

  @PostMapping(path = Array("/user"))
  def createUser(@RequestBody user: User): ResponseEntity[String] = {
    val id = userService.createUser(user)
    val uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").build(s"$id")
    new ResponseEntity(uri.getPath, HttpStatus.CREATED)

  }

  @PutMapping(path = Array("/user/{id}"))
  def updateUser(@RequestBody user: User): ResponseEntity[String] = {
    val uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri
    new ResponseEntity(uri.getPath, HttpStatus.OK)
  }
}