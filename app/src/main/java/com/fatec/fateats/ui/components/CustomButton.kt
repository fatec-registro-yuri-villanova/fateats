package com.fatec.fateats.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fatec.fateats.R
import com.fatec.fateats.ui.theme.FateatsTheme
import com.fatec.fateats.ui.theme.GreenBase
import com.fatec.fateats.ui.theme.Typography
import java.util.Locale

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    @DrawableRes iconRes: Int? = null,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .heightIn(56.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = GreenBase
        ),
        contentPadding = if (text == null && iconRes != null) PaddingValues(0.dp) else ButtonDefaults.ContentPadding,
        onClick = onClick
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            iconRes?.let {
                Icon(
                    painter = painterResource(iconRes),
                    contentDescription = "Icone do botão"
                )
            }
            text?.let {
                Text(
                    text = text.uppercase(Locale.getDefault()),
                    style = Typography.labelLarge
                )
            }
        }
    }
}


@Preview
@Composable
private fun CustomButtonPreview() {
    FateatsTheme {
        CustomButton(
            text = "Confirmar",
            iconRes = R.drawable.ic_scan,
            onClick = {}
        )
    }
}

@Preview
@Composable
private fun CustomButtonTextPreview() {
    FateatsTheme {
        CustomButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Confirmar",
            onClick = {}
        )
    }
}

@Preview
@Composable
private fun CustomButtonIconPreview() {
    FateatsTheme {
        CustomButton(
            iconRes = R.drawable.ic_scan,
            onClick = {}
        )
    }
}




