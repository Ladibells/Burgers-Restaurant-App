package dev.ladibells.burgersrestaurantapp.feature.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import dev.ladibells.burgersrestaurantapp.R
import dev.ladibells.burgersrestaurantapp.component.GoogleButton
import dev.ladibells.burgersrestaurantapp.component.PrimaryButton
import dev.ladibells.burgersrestaurantapp.ui.theme.FontSize
import dev.ladibells.burgersrestaurantapp.ui.theme.Resources
import dev.ladibells.burgersrestaurantapp.ui.theme.oswaldVariableFont

@Composable
fun AuthScreen() {
    Scaffold(

    ) { paddingValues ->
        Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .padding(24.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(0.8f)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.burgers),
                    contentDescription = "Burgers Logo",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.size(width = 220.dp, height = 130.dp)
                )

                Text(
                    text = stringResource(id = R.string.sign_in_text),
                    fontFamily = oswaldVariableFont(),
                    fontSize = FontSize.MEDIUM
                )

            }

            GoogleButton(
                onClick = {  },
                icon = painterResource(id = Resources.Image.GoogleLogo)
            )
            Spacer(modifier = Modifier.height(14.dp))
            PrimaryButton(
                text = stringResource(id = R.string.guest_text),
                icon = painterResource(id = R.drawable.log_in),
                onClick = {}
            )
        }
    }
}