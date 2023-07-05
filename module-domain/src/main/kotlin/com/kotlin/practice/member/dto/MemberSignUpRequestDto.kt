package com.kotlin.practice.member.dto

data class MemberSignUpRequestDto(
    val email: String,
    val password: String,
    val memberName: String,
    val hometown: String
) {
}