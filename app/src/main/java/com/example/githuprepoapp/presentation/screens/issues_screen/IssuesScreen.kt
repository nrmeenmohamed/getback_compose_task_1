package com.example.githuprepoapp.presentation.screens.issues_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.githuprepoapp.R
import com.example.githuprepoapp.presentation.screens.repos_details_screen.DetailItem
import com.example.githuprepoapp.presentation.screens.repos_screen.RepoItem
import com.example.githuprepoapp.presentation.share_items.RepoAppBar
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
        RepoAppBar(title = "Issues")

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

