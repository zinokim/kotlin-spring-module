package com.kotlin.practice.member.config

import com.kotlin.practice.member.mapper.MemberMapper
import com.kotlin.practice.member.service.MemberService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MemberConfig {

    @Bean
    fun memberService(): MemberService {
        return memberService()
    }

    @Bean
    fun memberMapper(): MemberMapper {
        return memberMapper()
    }
}