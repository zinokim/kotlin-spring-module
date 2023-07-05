package com.kotlin.practice.persistence.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Table(name = "members")
@Entity
class MemberEntity(
    @Column(name = "email", unique = true)
    var email: String,

    @Column(name = "password")
    var password: String,

    @Column(name = "member_name")
    var memberName: String,

    @Column(name = "hometown")
    var hometown: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    var memberId: Long = 0

    @Column(name = "profile_image")
    var profileImage: String? = ""

    @Column(name = "club_id")
    var clubId: Long = 0

    @Column(name = "is_board")
    var isBoard: Boolean = false

    @Column(name = "is_coach")
    var isCoach: Boolean = false

    @Column(name = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now()
}