package dev.ladibells.burgersrestaurantapp.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import dev.ladibells.burgersrestaurantapp.ui.theme.ButtonDisabled
import dev.ladibells.burgersrestaurantapp.ui.theme.ButtonPrimary
import dev.ladibells.burgersrestaurantapp.ui.theme.ButtonSecondary
import dev.ladibells.burgersrestaurantapp.ui.theme.FontSize
import dev.ladibells.burgersrestaurantapp.ui.theme.TextPrimary

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    text: String,
    icon: Painter? = null,
    enabled: Boolean = true,
    secondary: Boolean = false,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
        enabled = enabled,
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (secondary) ButtonSecondary else ButtonPrimary,
            contentColor = TextPrimary,
            disabledContentColor = TextPrimary.copy(0.6f),
            disabledContainerColor = ButtonDisabled
        ),
        contentPadding = PaddingValues(20.dp)
    ) {
        Text(
            text = text,
            fontSize = FontSize.REGULAR,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.size(14.dp))
        if (icon != null) {
            Icon(
                modifier = Modifier.size(14.dp),
                painter = icon,
                contentDescription = "Button Icon"
            )
        }
    }
}