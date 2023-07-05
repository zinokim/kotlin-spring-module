package com.kotlin.practice.member.request

/**
 * @author zino kim
 * @created 2023. 7. 6. thur
 */
data class MemberSignUpRequest(
    val email: String,
    val password: String,
    val memberName: String,
    val hometown: String
) {
    init {
        require(validate())
    }

    /**
     * validate member information
     *
     * @author zino kim
     * @created 2023. 7. 6. thur
     */
    private fun validate(): Boolean {
        if (email.isBlank()) return false
        if (memberName.isBlank()) return false
        if (hometown.isBlank()) return false

        return true
    }
}
