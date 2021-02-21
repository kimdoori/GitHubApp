package com.kimdoori.githubapp.pullrequest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.kimdoori.githubapp.R
import com.kimdoori.githubapp.databinding.ActivityPullrequestBinding

class PullRequestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPullrequestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupBinding()
        setupWebView()
    }

    private fun setupBinding() {
        binding = DataBindingUtil
            .setContentView<ActivityPullrequestBinding>(this, R.layout.activity_pull_request)
            .apply {
                lifecycleOwner = this@PullRequestActivity
            }
    }

    private fun setupWebView() {
        intent
            .getStringExtra(EXTRA_PULL_REQUEST_URL)
            ?.let {
                binding.pullRequestWebview.loadUrl(it)
            }
    }

    companion object {
        const val EXTRA_PULL_REQUEST_URL = "pullRequestUrl"
    }
}
