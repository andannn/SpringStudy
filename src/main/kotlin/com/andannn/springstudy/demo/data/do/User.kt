package com.andannn.springstudy.demo.data.`do`

import jakarta.persistence.*

@Entity
@Table
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,

    @Column
    var firstName: String,

    @Column
    var lastName: String,

    @Column
    var age: Int,
)