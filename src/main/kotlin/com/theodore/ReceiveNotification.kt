package com.theodore

import io.ktor.server.routing.*

fun Route.receiveNotification(){

    /*post("/sendNotification") {
        try {
            val request = call.receive<NotificationRequest>()
            val adminToken = request.adminToken
            val title = request.title
            val body = request.body

            println("Received notification request: adminToken=$adminToken, title=$title, body=$body")

            // Initialize Firebase Admin SDK
            val serviceAccount = FileInputStream("serviceAccountKey.json") // Replace with your service account key file
            val options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build()
            FirebaseApp.initializeApp(options)

            val message = Message.builder()
                .setToken(adminToken)
                .setNotification(com.google.firebase.messaging.Notification(title, body))
                .build()

            val response = FirebaseMessaging.getInstance().send(message)
            println("Successfully sent message: $response")
            call.respond("Notification sent successfully")

        } catch (e: Exception) {
            println("Error processing request: $e")
            call.respond(500, "Error sending notification")
        }
    }.start(wait = true)*/



}