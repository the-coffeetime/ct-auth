package com.coffeetime.ctauth.infrastructure.persistent.rdbms

import com.coffeetime.ctauth.domain.model.UserCommentProjection
import com.coffeetime.ctauth.domain.model.UserPostProjection
import com.coffeetime.ctauth.infrastructure.entity.UserInfo
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<UserInfo, Long> {
    fun findBySocialIDGoogle(socialIDGoogle: String): UserInfo?
    fun findBySocialIDNaver(socialIDNaver: String): UserInfo?
    fun findBySocialIDKakao(socialIDKakao: String): UserInfo?
    fun findPostUserByUserID(userID: Long): UserPostProjection
    fun findCommentUserByUserID(userID: Long): UserCommentProjection
}
