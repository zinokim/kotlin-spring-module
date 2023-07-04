package com.kotlin.practice.club.model

import java.time.LocalDateTime

/**
 *  @author zino kim
 *  @created 2023. 7. 3. mon
 */
data class Club(
    val clubId: Long,
    val clubName: String,
    val profileImage: String,
    val hometown: String,
    val numberOfPlayer: Int,
    val ageGroup: AgeGroup,
    val level: String,
    val boardInfo: List<BoardInfo>,
    val foundedAt: LocalDateTime,
    val clubRecord: ClubRecord,
    val createdAt: LocalDateTime
) {
    data class AgeGroup(
        val ageOfMax: Int,
        val ageOfMin: Int,
    )

    data class BoardInfo(
        val memberId: Long,
        val memberName: String,
        val isCoach: Boolean
    )

    data class ClubRecord(
        val wins: Int,
        val draw: Int,
        val losses: Int,
        val isHiddenWinsAndLosses: Boolean,
    )
}