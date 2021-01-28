package com.kimdoori.githubapp.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.kimdoori.githubapp.BR
import com.kimdoori.githubapp.R
import com.kimdoori.githubapp.databinding.ActivityMainBinding
import com.kimdoori.githubapp.domain.model.GitHubRepoModel
import com.kimdoori.githubapp.viewcommon.BaseAdapter
import com.kimdoori.githubapp.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupBinding()
        setupRecyclerView()
        showContent()
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
        binding.mainRepoRecyclerview.adapter = BaseAdapter<GitHubRepoModel>(
            layoutResourceId = R.layout.item_repo,
            bindingVariableId = BR.item,
        )
    }

    private fun showContent() {
        viewModel.fetchGitHubRepoList(userName = "kimdoori")
    }
}
