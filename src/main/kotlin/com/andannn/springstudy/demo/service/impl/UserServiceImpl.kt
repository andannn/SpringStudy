package com.andannn.springstudy.demo.service.impl

import com.andannn.springstudy.demo.data.dao.UserDao
import com.andannn.springstudy.demo.data.`do`.toDto
import com.andannn.springstudy.demo.data.dto.UserDto
import com.andannn.springstudy.demo.data.dto.toEntity
import com.andannn.springstudy.demo.service.UserService
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class UserServiceImpl(
    val userDao: UserDao
) : UserService {
    override fun addUser(userDto: UserDto) = userDao.save(userDto.toEntity()).toDto()

    override fun queryUserByID(id: Long): UserDto =
        userDao.findById(id)
            .map { it.toDto() }
            .orElseThrow { RuntimeException() }

    override fun modifyUser(userDto: UserDto) =
        userDao.findById(userDto.id!!)
            .orElseThrow { RuntimeException() }
            .run {
                userDao.save(userDto.toEntity()).toDto()
            }

    override fun removeUserById(id: Long) = userDao.deleteById(id)
}
