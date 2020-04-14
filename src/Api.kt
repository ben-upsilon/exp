package ben.upsilon

import io.ktor.application.ApplicationCall
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.*
import java.nio.file.FileSystems
import java.nio.file.Files

fun Routing.api() = route("api"){
    route("v1") {
        get("/home") {
            Q.init()
            call.respond(R(0,"ok", mapOf("hello" to "world")))
        }
        get("/files"){
            val files = Files.list(FileSystems.getDefault().getPath("/"))
            call.respond(files)
        }
        post(""){

        }

    }
}