package com.example.githuprepoapp.presentation.screens.repos_screen

data class GitHupRepoUiModel(
    val id:Int,
    val name: String,
    val avatar: String,
    val description: String,
    val stars: Int,
    val owner: String
)
