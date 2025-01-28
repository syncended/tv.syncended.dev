package dev.syncended.tv.application

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TvApplication {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            SpringApplication.run(TvApplication::class.java, *args)
        }
    }
}