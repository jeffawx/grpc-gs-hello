package demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClientApp

fun main(args: Array<String>) {
    runApplication<ClientApp>(*args)
}
