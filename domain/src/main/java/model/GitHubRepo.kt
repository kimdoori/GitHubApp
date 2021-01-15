package model

import com.kimdoori.data.source.entity.GitHubRepoResponse

data class GitHubRepo(
    val id: Int,
    val name: String,
    val fullName: String,
    val description: String,
    val url: String
) {
    companion object {
        fun mapFromEntity(gitHubRepoResponse: GitHubRepoResponse): GitHubRepo {
            return GitHubRepo(
                id = gitHubRepoResponse.id,
                name = gitHubRepoResponse.name,
                fullName = gitHubRepoResponse.fullName,
                description = gitHubRepoResponse.description,
                url = gitHubRepoResponse.url
            )
        }
    }
}
