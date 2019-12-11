package io.ktor.samples.hello

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.routing

fun Application.main() {
    routing {
        get("/") {
            call.respond("The application received this request on port: ${call.request.local.port}")
        }
    }
}
