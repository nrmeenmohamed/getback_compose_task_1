package com.example.githuprepoapp.presentation.screens.repos_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.githuprepoapp.R

@Composable
fun RepoItem(
     repoUiModel: GitHupRepoUiModel
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Color.White,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(bottom = 15.dp)
    ) {
        Image(
            painter = rememberImagePainter(data = repoUiModel.avatar),
            contentDescription = stringResource(R.string.repositry_screen_avatar_image_description),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
        )

        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = repoUiModel.name,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    color = Color.Gray,
                    modifier = Modifier.weight(1f)
                )

                Text(
                    text = repoUiModel.stars.toString(),
                    color = Color.Gray,
                    modifier = Modifier.padding(horizontal = 6.dp)
                )

                Image(
                    painter = painterResource(id = androidx.core.R.drawable.ic_call_answer_video),
                    contentDescription = stringResource(R.string.repositry_screen_star_image_description),
                    contentScale = ContentScale.Crop,
                    colorFilter = ColorFilter.tint(Color.Yellow),
                    modifier = Modifier
                        .size(30.dp)
                        .padding(start = 8.dp, top = 8.dp, end = 8.dp)
                        .clip(RoundedCornerShape(50.dp))
                )
            }

            Text(
                text = repoUiModel.owner,
                color = Color.Gray
            )

            Text(
                text = repoUiModel.description,
                color = Color.Gray,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(top = 6.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRepoItem() {
    RepoItem(
        repoUiModel = GitHupRepoUiModel(
            id = 1,
            name = "AwesomeRepo",
            avatar = "https://www12.0zz0.com/2024/08/06/20/373075236.pngttps://example.com/avatar1.jpg",
            description = "This is an awesome repository.",
            stars = 123,
            owner = "JohnDoe"
        )
    )
}
