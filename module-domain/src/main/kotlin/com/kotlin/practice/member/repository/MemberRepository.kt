package com.kotlin.practice.member.repository

import com.kotlin.practice.member.model.Member

interface MemberRepository {

    fun memberSignUp(memberSignUpRequest: Member): Member
}