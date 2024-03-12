package com.andannn.springstudy.demo.web.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("hello")
    fun sayHello(@RequestParam name: String) = "Hello $name"
}