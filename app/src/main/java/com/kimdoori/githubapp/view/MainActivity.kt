package com.kimdoori.githubapp.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import com.kimdoori.githubapp.BR
import com.kimdoori.githubapp.R
import com.kimdoori.githubapp.databinding.ActivityMainBinding
import com.kimdoori.githubapp.domain.model.GitHubRepoModel
import com.kimdoori.githubapp.viewcommon.BaseAdapter
import com.kimdoori.githubapp.viewmodel.MainViewModelImpl
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModelImpl by viewModels()

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
        binding.mainRepoRecyclerview.adapter = BaseAdapter<GitHubRepoModel>(
            layoutResourceId = R.layout.item_repo,
            bindingVariableId = BR.item,
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
