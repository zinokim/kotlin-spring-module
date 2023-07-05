package com.kotlin.practice.member.service

import com.kotlin.practice.member.dto.MemberSignUpRequestDto
import com.kotlin.practice.member.dto.MemberSignUpResponseDto
import com.kotlin.practice.member.model.Member
import com.kotlin.practice.member.repository.MemberRepository

class MemberService(
    private val memberRepository: MemberRepository
) {
    fun signUpMember(
        memberSignUpRequestDto: MemberSignUpRequestDto
    ): MemberSignUpResponseDto {
        val memberSignUpRequest = Member(
            email = memberSignUpRequestDto.email,
            password = memberSignUpRequestDto.password,
            memberName = memberSignUpRequestDto.memberName,
            hometown = memberSignUpRequestDto.hometown,
        )

        val member = memberRepository.memberSignUp(memberSignUpRequest)

        return MemberSignUpResponseDto(
            memberId = member.memberId,
            email = member.email,
            memberName = member.memberName,
            hometown = member.hometown
        )
    }
}