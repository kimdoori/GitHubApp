package com.kimdoori.githubapp.detail

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import com.kimdoori.githubapp.BR
import com.kimdoori.githubapp.R
import com.kimdoori.githubapp.databinding.ActivityRepoDetailBinding
import com.kimdoori.githubapp.pullrequest.PullRequestActivity
import com.kimdoori.githubapp.pullrequest.PullRequestActivity.Companion.EXTRA_PULL_REQUEST_URL
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RepoDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRepoDetailBinding
    private val viewModel: RepoDetailViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupBinding()
        setupRecyclerView()
        showContent()
    }

    private fun setupBinding() {
        binding = DataBindingUtil
            .setContentView<ActivityRepoDetailBinding>(this, R.layout.activity_repo_detail)
            .apply {
                lifecycleOwner = this@RepoDetailActivity
                viewModel = this@RepoDetailActivity.viewModel
            }
    }

    private fun setupRecyclerView() {
        binding.repoDetailPullrequestRecyclerview.adapter = PullRequestAdapter(
            layoutResourceId = R.layout.item_pullrequest,
            bindingVariableId = BR.item,
            onClick = { pullRequestUrl ->
                startActivity(
                    Intent(
                        this@RepoDetailActivity,
                        PullRequestActivity::class.java
                    ).apply {
                        putExtras(bundleOf(EXTRA_PULL_REQUEST_URL to pullRequestUrl))
                    }
                )
            }
        )
    }

    private fun showContent() {
        val userName = intent.getStringExtra(EXTRA_USER_NAME) ?: return
        val repoName = intent.getStringExtra(EXTRA_REPO_NAME) ?: return
        viewModel.fetchPullRequestList(userName = userName, repoName = repoName)
    }

    companion object {
        const val EXTRA_USER_NAME = "userName"
        const val EXTRA_REPO_NAME = "repoName"
    }
}
