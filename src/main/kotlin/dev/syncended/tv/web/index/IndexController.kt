package dev.syncended.tv.web.index

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

    @GetMapping("/")
    fun getIndex(): String {
        return indexPage()
    }
}