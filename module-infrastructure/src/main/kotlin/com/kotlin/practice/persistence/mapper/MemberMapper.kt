package com.kotlin.practice.persistence.mapper

import com.kotlin.practice.member.model.Member
import com.kotlin.practice.persistence.entity.MemberEntity

class MemberMapper {
    fun toEntity(
        memberSignUpRequest: Member
    ): MemberEntity {
        return MemberEntity(
            email = memberSignUpRequest.email,
            password = memberSignUpRequest.password,
            memberName =  memberSignUpRequest.memberName,
            hometown = memberSignUpRequest.hometown
        )
    }
}