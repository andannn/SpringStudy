package com.andannn.springstudy.demo.data.dao

import com.andannn.springstudy.demo.data.`do`.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface UserDao : JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}