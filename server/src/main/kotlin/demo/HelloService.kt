package demo

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class HelloService : HelloRpc {

    private val logger = LoggerFactory.getLogger(javaClass)

    override suspend fun greet(request: String): String {
        logger.info("greet request received: {}", request)

        return "Hello, $request"
    }
}
