package com.example.githuprepoapp.presentation.screens.repos_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githuprepoapp.R
import com.example.githuprepoapp.presentation.share_items.AppBar
import com.example.githuprepoapp.presentation.theme.LightBackgroundColor

@ExperimentalMaterial3Api
@Composable
fun ReposScreen() {

    val fakeRepoList = listOf(
        GitHupRepoUiModel(
            id = 1,
            name = "AwesomeRepo",
            avatar = "https://www12.0zz0.com/2024/08/06/20/373075236.pngttps://example.com/avatar1.jpg",
            description = "This is an awesome repository.",
            stars = 123,
            owner = "JohnDoe"
        ),
        GitHupRepoUiModel(
            id = 2,
            name = "CoolProject",
            avatar = "https://www12.0zz0.com/2024/08/06/20/373075236.pngttps://example.com/avatar1.jpg",
            description = "A cool project repository.",
            stars = 456,
            owner = "JaneSmith"
        ),
        GitHupRepoUiModel(
            id = 3,
            name = "FlutterExample",
            avatar = "https://www12.0zz0.com/2024/08/06/20/373075236.pngttps://example.com/avatar1.jpg",
            description = "Example of a Flutter project.",
            stars = 789,
            owner = "FlutterDev"
        ),
        GitHupRepoUiModel(
            id = 4,
            name = "ComposeDemo",
            avatar = "https://www12.0zz0.com/2024/08/06/20/373075236.pngttps://example.com/avatar1.jpg",
            description = "Jetpack Compose demo project.",
            stars = 321,
            owner = "ComposeGuru"
        ),
        GitHupRepoUiModel(
            id = 5,
            name = "KotlinCoroutines",
            avatar = "https://www12.0zz0.com/2024/08/06/20/373075236.pngttps://example.com/avatar1.jpg",
            description = "Repository for Kotlin Coroutines examples.",
            stars = 654,
            owner = "KotlinExpert"
        )
    )

    Column (
        modifier = Modifier.fillMaxWidth()
            .background(
                color = LightBackgroundColor
            )
    ){
        AppBar(
            title = R.string.title_repository_app_bar,
            showBackButton = false
        )

        LazyColumn(
            modifier =Modifier.padding(horizontal = 15.dp)
        ){
            items(fakeRepoList){ repoItems ->
                RepoItem(repoItems)

            }
        }


    }

}

@ExperimentalMaterial3Api
@Preview(showSystemUi = true)
@Composable
fun previewReposScreen() {

    AppBar(title = R.string.title_repository_app_bar,)
    
}