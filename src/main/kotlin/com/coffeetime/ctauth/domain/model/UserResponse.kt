package com.coffeetime.ctauth.domain.model

import java.time.Instant

data class UserResponse(
    val userID: Long,
    val createdAt: Instant,
    val lastLogin: Instant,
    val nickName: String,
    val socialIDGoogle: String? = null,
    val socialIDNaver: String? = null,
    val socialIDKakao: String? = null,
    val email: String? = null,
    val profilePictureURL: String? = null,
    val verified: Boolean,
    val jobs: List<String>,
    val company: String? = null,
    val introduction: String? = null,
    val status: String? = null,
)
