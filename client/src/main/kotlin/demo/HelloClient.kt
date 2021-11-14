package demo

import com.airwallex.grpc.annotations.GrpcClient
import kotlinx.coroutines.runBlocking
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class HelloClient(@GrpcClient(channel = "hello") private val service: HelloRpc) {

    @EventListener
    fun welcome(e: ApplicationReadyEvent) = runBlocking {
        println(service.greet("World"))
    }
}
