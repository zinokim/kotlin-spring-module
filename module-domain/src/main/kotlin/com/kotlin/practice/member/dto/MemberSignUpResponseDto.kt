package com.kotlin.practice.member.dto

data class MemberSignUpResponseDto(
    val memberId: Long,
    val email: String,
    val memberName: String,
    val hometown: String
)