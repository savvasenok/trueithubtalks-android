package xyz.savvamirzoyan.trueithubtalks.repository.websockets.jsonserializable

import kotlinx.serialization.Serializable

@Serializable
data class Chat(
    val id: Int,
    val title: String,
    val textPreview: String,
    val pictureUrl: String
)
