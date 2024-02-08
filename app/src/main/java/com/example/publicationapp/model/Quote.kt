package com.example.publicationapp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Quote(
    @SerialName(value = "_id")
    val id: String,
    @SerialName(value = "content")
    val quote: String,
    @SerialName(value = "author")
    val quotedBy: String,
    val authorSlug: String = "",
    val dateAdded: String = "",
    val dateModified: String = "",
    val length: Int = 0,
    val tags: List<String> = emptyList()
)
