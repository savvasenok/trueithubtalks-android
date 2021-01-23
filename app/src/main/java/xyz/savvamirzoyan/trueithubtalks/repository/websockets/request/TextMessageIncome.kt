package xyz.savvamirzoyan.trueithubtalks.repository.websockets.request

import kotlinx.serialization.Serializable

@Serializable
data class TextMessageIncome(val username: String, val senderId: Int, val message: String)
