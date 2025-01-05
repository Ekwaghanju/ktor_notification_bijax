package com.theodore

import com.google.firebase.messaging.FirebaseMessaging
import io.ktor.http.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.sendNotification(){
    route("/send"){
        post {
            val body = call.receiveNullable<SendMessageDTO>()?: kotlin.run {
                call.respond(HttpStatusCode.BadRequest)
                return@post
            }

            FirebaseMessaging.getInstance().send(body.toMessage())

            call.respond(HttpStatusCode.OK)
        }
    }

    route("/broadcast"){
        post {
            val body = call.receiveNullable<SendMessageDTO>()?: kotlin.run {
                call.respond(HttpStatusCode.BadRequest)
                return@post
            }

            FirebaseMessaging.getInstance().send(body.toMessage())

            call.respond(HttpStatusCode.OK)
        }
    }

}