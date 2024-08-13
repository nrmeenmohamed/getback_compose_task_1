package com.example.githubreposapp.presentation.screens.error_screen

import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githuprepoapp.R

@Composable
fun ButtonItem(
    @StringRes text: Int,
    textColor : Color,
    backgroundColor : Color,
    borderColor : Color,
    onButtonClicked: () -> Unit = {},
) {
    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = onButtonClicked,
        colors = ButtonDefaults.buttonColors(
            containerColor =  backgroundColor,
        ),
        shape = RoundedCornerShape(5.dp),
        border =  BorderStroke(2.dp, borderColor),
        elevation = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 8.dp,
            pressedElevation = 12.dp
        ),
        contentPadding = PaddingValues(all = 13.dp)
    ) {
        Text(
            text = stringResource(text),
            style = MaterialTheme.typography.bodyLarge.copy(
                color = textColor,
            ),
        )
    }

}


@Preview
@Composable
fun PreviewButtonItem() {

        ButtonItem(
            text = R.string.text_button,
            backgroundColor = Color.White,
            borderColor = Color.Green,
            textColor = Color.Green
            )

}