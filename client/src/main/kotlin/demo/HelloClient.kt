package demo

import com.airwallex.grpc.annotations.GrpcClient
import kotlinx.coroutines.runBlocking
import org.slf4j.LoggerFactory
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class HelloClient(@GrpcClient("hello") private val service: HelloRpc) {

    private val logger = LoggerFactory.getLogger(javaClass)

    @EventListener
    fun welcome(e: ApplicationReadyEvent) = runBlocking {
        logger.info("sending request to server")

        println(service.greet("World"))

        logger.info("server responded")
    }
}
