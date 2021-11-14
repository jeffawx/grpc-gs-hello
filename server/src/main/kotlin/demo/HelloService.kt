package demo

import org.springframework.stereotype.Service

@Service
class HelloService : HelloRpc {

    override suspend fun greet(request: String): String {
        return "Hello, $request"
    }
}
