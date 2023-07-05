package com.kotlin.practice.persistence.repository

import com.kotlin.practice.persistence.entity.MemberEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MemberJpaRepository : JpaRepository<MemberEntity, Long> {
}