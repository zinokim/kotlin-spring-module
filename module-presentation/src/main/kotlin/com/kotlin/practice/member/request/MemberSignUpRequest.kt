package com.kotlin.practice.member.request

data class MemberSignUpRequest(
    val email: String,
    val password: String,
    val memberName: String,
    val hometown: String
) {
    init {
        requireNotNull(email.isNotBlank())
        requireNotNull(password.isNotBlank())
        requireNotNull(memberName.isNotBlank())
        requireNotNull(hometown.isNotBlank())
    }
}
