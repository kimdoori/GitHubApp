package com.kimdoori.githubapp.domain.model

import com.kimdoori.githubapp.data.entity.GitHubRepoResponse

data class GitHubRepoModel(
    val id: Int,
    val name: String,
    val fullName: String,
    val description: String?,
    val url: String
) {
    companion object {
        fun mapFromEntity(gitHubRepoResponse: GitHubRepoResponse) = GitHubRepoModel(
            id = gitHubRepoResponse.id,
            name = gitHubRepoResponse.name,
            fullName = gitHubRepoResponse.fullName,
            description = gitHubRepoResponse.description,
            url = gitHubRepoResponse.url
        )
    }
}
