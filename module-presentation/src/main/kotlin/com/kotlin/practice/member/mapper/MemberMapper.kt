package com.kotlin.practice.member.mapper

import com.kotlin.practice.member.dto.MemberSignUpRequestDto
import com.kotlin.practice.member.request.MemberSignUpRequest

class MemberMapper {
    fun fromRequest(
        memberSignUpRequest: MemberSignUpRequest
    ): MemberSignUpRequestDto {
        return MemberSignUpRequestDto(
            email = memberSignUpRequest.email,
            password = memberSignUpRequest.password,
            memberName = memberSignUpRequest.memberName,
            hometown = memberSignUpRequest.hometown
        )
    }
}