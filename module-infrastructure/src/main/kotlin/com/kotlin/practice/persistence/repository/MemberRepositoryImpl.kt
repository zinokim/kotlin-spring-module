package com.kotlin.practice.persistence.repository

import com.kotlin.practice.member.model.Member
import com.kotlin.practice.member.repository.MemberRepository
import com.kotlin.practice.persistence.mapper.MemberMapper

class MemberRepositoryImpl(
    private val memberMapper: MemberMapper,
    private val memberJpaRepository: MemberJpaRepository
): MemberRepository {
    override fun memberSignUp(
        memberSignUpRequest: Member
    ): Member {
        val memberEntity = memberMapper.toEntity(memberSignUpRequest)
        val memberId = memberJpaRepository.save(memberEntity)
            .memberId

        return memberSignUpRequest.copy(
            memberId = checkNotNull(memberId)
        )
    }
}