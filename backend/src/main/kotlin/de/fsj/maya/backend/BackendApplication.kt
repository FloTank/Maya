package de.fsj.maya.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class BackendApplication {

	@GetMapping("/hello")
	fun hello(name: String? = null): String = "Hello, $name!"
}

fun main() {
	runApplication<BackendApplication>()
}