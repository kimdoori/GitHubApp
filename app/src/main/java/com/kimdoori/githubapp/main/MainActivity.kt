package com.kimdoori.githubapp.main

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import com.kimdoori.githubapp.BR
import com.kimdoori.githubapp.R
import com.kimdoori.githubapp.databinding.ActivityMainBinding
import com.kimdoori.githubapp.detail.RepoDetailActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupBinding()
        setupRecyclerView()
        setupListener()
    }

    private fun setupBinding() {
        binding = DataBindingUtil
            .setContentView<ActivityMainBinding>(this, R.layout.activity_main)
            .apply {
                lifecycleOwner = this@MainActivity
                viewModel = this@MainActivity.viewModel
            }
    }

    private fun setupRecyclerView() {
        binding.mainRepoRecyclerview.adapter = GitHubRepoAdapter(
            layoutResourceId = R.layout.item_repo,
            bindingVariableId = BR.item,
            onClick = { repoName ->
                startActivity(
                    Intent(this@MainActivity, RepoDetailActivity::class.java).apply {
                        putExtras(
                            bundleOf(
                                RepoDetailActivity.EXTRA_USER_NAME to binding.mainRepoSearchview.query.toString(),
                                RepoDetailActivity.EXTRA_REPO_NAME to repoName
                            )
                        )
                    }
                )
            }
        )
    }

    private fun setupListener() {
        binding.mainRepoSearchview.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {
                    viewModel.fetchGitHubRepoList(userName = query)
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }
        })
    }
}
