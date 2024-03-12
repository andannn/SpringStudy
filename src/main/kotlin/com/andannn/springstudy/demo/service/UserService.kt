package com.andannn.springstudy.demo.service

import com.andannn.springstudy.demo.data.dto.UserDto

interface UserService {
    fun addUser(userDto: UserDto): UserDto

    fun queryUserByID(id: Long): UserDto

    fun modifyUser(userDto: UserDto): UserDto

    fun removeUserById(id: Long)
}