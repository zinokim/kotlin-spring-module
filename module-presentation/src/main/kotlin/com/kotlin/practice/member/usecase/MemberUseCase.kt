package com.kotlin.practice.member.usecase

import com.kotlin.practice.member.mapper.MemberMapper
import com.kotlin.practice.member.request.MemberSignUpRequest
import com.kotlin.practice.member.service.MemberService
import org.springframework.stereotype.Service

@Service
class MemberUseCase(
    private val memberMapper: MemberMapper,
    private val memberService: MemberService
) {
    fun signUpMember(
        memberSignUpRequest: MemberSignUpRequest
    ) {
        val memberSignUpRequestDto = memberMapper.fromRequest(memberSignUpRequest)
        val memberSignUpResponseDto = memberService.signUpMember(memberSignUpRequestDto)

    }
}