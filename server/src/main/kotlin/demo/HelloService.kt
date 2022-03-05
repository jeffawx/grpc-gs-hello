package demo

import com.airwallex.grpc.error.Error
import com.github.michaelbull.result.Ok
import com.github.michaelbull.result.Result
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class HelloService : HelloRpc {

    private val logger = LoggerFactory.getLogger(javaClass)

    override suspend fun greet(request: String): Result<String, Error> {
        logger.info("greet request received: {}", request)

        return Ok("Hello, $request")
    }
}
