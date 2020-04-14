package ben.upsilon

import io.ktor.application.ApplicationCall
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText

object Service {
    suspend fun home(call: ApplicationCall): Unit {
        call.respondText("HELLO WORLD!", contentType = ContentType.Text.Plain)
    }
}