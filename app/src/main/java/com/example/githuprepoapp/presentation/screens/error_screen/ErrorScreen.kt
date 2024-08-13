package com.example.githubreposapp.presentation.screens.error_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githuprepoapp.R
import com.example.githuprepoapp.presentation.share_items.AppBar

@ExperimentalMaterial3Api
@Composable
fun ErrorScreen() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        topBar = {
            AppBar(
                title = R.string.error_screen_title,
                showBackButton = false
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier
                    .size(300.dp),
                painter = painterResource(id = R.drawable.error_image),
                contentDescription = stringResource(R.string.error_screen_description),
                alignment = Alignment.Center,
                contentScale = ContentScale.Fit
            )

            Text(
                text = stringResource(R.string.error_message),
                style = MaterialTheme.typography.titleLarge,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = stringResource(R.string.error_message_type),
                style = MaterialTheme.typography.bodySmall.copy(
                    color = Color.Gray
                ),
            )

            Spacer(modifier = Modifier.height(40.dp))

            ButtonItem(
                text = R.string.text_button,
                backgroundColor = Color.White,
                borderColor = Color.Green,
                textColor = Color.Green
            )
        }
    }
}

@ExperimentalMaterial3Api
@Preview(showSystemUi = true)
@Composable
fun PreviewErrorScreen() {
        ErrorScreen()

    
}