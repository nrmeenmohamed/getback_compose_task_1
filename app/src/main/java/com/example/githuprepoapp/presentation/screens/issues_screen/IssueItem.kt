package com.example.githuprepoapp.presentation.screens.issues_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.githuprepoapp.R
import com.example.githuprepoapp.presentation.theme.LightBackgroundColor

@Composable
fun IssueItem() {
    Column (
        modifier = Modifier.padding(bottom = 8.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Color.White,
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(all = 10.dp),
        ) {
            Icon(
                imageVector = Icons.Rounded.Info,
                contentDescription = stringResource(R.string.issue_icon),
                modifier = Modifier
                    .width(30.dp)
                    .height(30.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp) // Additional padding to ensure spacing from the button
            ) {
                Text(
                    text = stringResource(R.string.issue_title),
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    text = stringResource(R.string.issue_body),
                    fontSize = 20.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(10.dp))

                Row {
                    Text(
                        text = "Created At: ",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                    )
                    Text(
                        text = stringResource(R.string.issue_date),
                        fontSize = 16.sp,
                    )
                    Text(
                        text = ", ",
                        fontSize = 16.sp,
                    )
                    Text(
                        text = stringResource(R.string.issue_time),
                        fontSize = 16.sp,
                    )
                }
            }

            TextButton(onClick = { }) {
                Text(
                    text = "Open",
                    fontSize = 20.sp,
                    color = Color.Black
                )
            }
        }

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun previewIssueItem() {
    IssueItem()
}
