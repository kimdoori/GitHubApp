package com.kimdoori.githubapp.domain.model

import com.kimdoori.githubapp.data.entity.UserResponse

data class UserModel(
    val id: Int,
    val login: String,
) {
    companion object {
        fun mapFromEntity(userReponse: UserResponse) = UserModel(
            id = userReponse.id,
            login = userReponse.login,
        )
    }
}
