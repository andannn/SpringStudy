package com.andannn.springstudy.demo.data.dto

import com.andannn.springstudy.demo.data.`do`.User

data class UserDto(
    val id: Long?,
    var name: String,
    var age: Int,
)

fun UserDto.toEntity() = User(
    id = id,
    firstName =  name.split(",")[1].trim(),
    lastName =  name.split(",")[0].trim(),
    age = age
)