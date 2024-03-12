package com.andannn.springstudy.demo.data.dao

import com.andannn.springstudy.demo.data.`do`.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserDao : JpaRepository<User, Long> {

}