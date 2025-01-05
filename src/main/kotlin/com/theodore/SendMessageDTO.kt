package com.theodore

import com.google.firebase.messaging.Message
import com.google.firebase.messaging.Notification
import kotlinx.serialization.Serializable

@Serializable
data class SendMessageDTO(
    val to: String?,
    val notification: NotificationBody
    )

@Serializable
data class NotificationBody(
    val title: String,
    val body: String
)

fun SendMessageDTO.toMessage():Message{
    return Message.builder()
        .setNotification(
            Notification.builder().setTitle(notification.title)
                .setBody(notification.body)
                .build()
        )
        .apply {
            if (to.isNullOrEmpty()){
                setTopic("Billboard_Available")
            }else{
                setToken(to)
            }
        }.build()
}
