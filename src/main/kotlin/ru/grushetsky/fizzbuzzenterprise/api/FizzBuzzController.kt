package ru.grushetsky.fizzbuzzenterprise.api

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import ru.grushetsky.fizzbuzzenterprise.domain.FizzBuzzService

@CrossOrigin
@RestController("/numbers")
class FizzBuzzController(val fizzBuzzService: FizzBuzzService) {

    @PostMapping
    fun doFizzBuzz(@RequestBody numbers: List<Int>): List<String> {
        return fizzBuzzService.doFizzBuzz(numbers)
    }
}