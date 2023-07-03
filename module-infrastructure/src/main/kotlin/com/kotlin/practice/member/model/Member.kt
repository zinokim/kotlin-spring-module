package com.kotlin.practice.member.model

import java.time.LocalDateTime

/**
 *  @author zino kim
 *  @created 2023. 7. 3. mon
 */
data class Member(
    val memberId: Long,
    val email: String,
    val password: String,
    val memberName: String,
    val profileImage: String,
    val hometown: String,
    val clubInfo: ClubInfo,
    val createdAt: LocalDateTime
) {
    data class ClubInfo(
        val clubId: Long,
        val isBoard: Boolean,
        val isCoach: Boolean
    )
}