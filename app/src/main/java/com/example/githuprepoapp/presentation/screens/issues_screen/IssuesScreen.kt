package com.example.githuprepoapp.presentation.screens.issues_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githuprepoapp.R
import com.example.githuprepoapp.presentation.share_items.AppBar
import com.example.githuprepoapp.presentation.theme.LightBackgroundColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IssuesScreen() {

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = LightBackgroundColor
            )
    ){
        AppBar(title = R.string.issues)

        LazyColumn(
            modifier =Modifier.padding(
                horizontal = 8.dp,
                vertical = 8.dp
            ),
            contentPadding = PaddingValues(bottom = 50.dp)
        ){
            items(10){
                index ->  IssueItem()
            }
        }

    }
    
    
    





//    Scaffold(
//        topBar = {
//            RepoAppBar(
//                title = "Issues",
//            )
//        },
//        content = {it
//            Column (
//                modifier = Modifier.padding(it)
//                    .background(color = LightBackgroundColor) // Apply background color here
//
//            ){
//                IssueItem()
//                IssueItem()
//                IssueItem()
//
//            }
//        }
//    )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun previewIssuesScreen() {
    IssuesScreen()
}

