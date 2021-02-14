package com.kimdoori.githubapp.domain.model

import com.kimdoori.githubapp.data.entity.UserResponse

data class UserModel(
    val id: Int,
    val login: String,
) {
    companion object {
        fun mapFromEntity(userResponse: UserResponse) = UserModel(
            id = userResponse.id,
            login = userResponse.login,
        )
    }
}
