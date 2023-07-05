package com.kotlin.practice.member.model

import java.time.LocalDateTime

/**
 *  @author zino kim
 *  @created 2023. 7. 3. mon
 */
data class Member(
    val memberId: Long = 0,
    val email: String,
    val password: String,
    val memberName: String,
    val hometown: String,
    val profileImage: String = "",
    val clubInfo: ClubInfo = ClubInfo(
        clubId = 0,
        isBoard = false,
        isCoach = false
    ),
    val createdAt: LocalDateTime = LocalDateTime.now()
) {
    data class ClubInfo(
        val clubId: Long = 0,
        val isBoard: Boolean = false,
        val isCoach: Boolean = false
    )
}