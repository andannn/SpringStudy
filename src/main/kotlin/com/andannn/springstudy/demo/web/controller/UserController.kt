package com.andannn.springstudy.demo.web.controller

import com.andannn.springstudy.demo.data.dto.UserDto
import com.andannn.springstudy.demo.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(
    val userService: UserService
) {
    @PostMapping
    fun addUser(@RequestBody userDto: UserDto) = userService.addUser(userDto)

    @GetMapping("/{id}")
    fun queryUserById(@PathVariable id: Long) = userService.queryUserByID(id)

    @PutMapping
    fun modifyUser(@RequestBody userDto: UserDto) = userService.modifyUser(userDto)

    @DeleteMapping("/{id}")
    fun removeUserById(@PathVariable id: Long) = userService.removeUserById(id)
}