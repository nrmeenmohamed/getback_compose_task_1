package com.example.githuprepoapp.presentation.screens.repos_details_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ){
        Text(
            text = "1525",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium
        )
        //Spacer(modifier = Modifier.width(5.dp))

        Box(
            modifier = Modifier
                .size(25.dp)
                .background(color = Color.Yellow, shape = CircleShape)
        )



        Text(
            text = "Python",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium
        )
        //Spacer(modifier = Modifier.width(5.dp))

        Box(
            modifier = Modifier
                .size(25.dp)
                .background(color = Color.Blue, shape = CircleShape)
        )



        Text(
            text = "347",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium
        )
        //Spacer(modifier = Modifier.width(5.dp))

        Icon(
            imageVector = Icons.Filled.Share,
            contentDescription = "icon")

    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewDetailItem() {
    DetailItem()
}