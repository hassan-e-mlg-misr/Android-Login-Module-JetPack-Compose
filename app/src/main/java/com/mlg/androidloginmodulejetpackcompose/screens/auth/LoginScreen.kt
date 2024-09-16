package com.mlg.androidloginmodulejetpackcompose.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mlg.androidloginmodulejetpackcompose.R
import com.mlg.androidloginmodulejetpackcompose.ui.theme.AndroidLoginModuleJetPackComposeTheme

@Composable
fun LoginScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.ic_logo),
            contentDescription = "المنصة",
            modifier = Modifier
                .height(150.dp)
                .width(250.dp)
        )
        Text(text = "Welcome Back ", fontSize = 35.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Email address")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            leadingIcon = { })

        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Password")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            leadingIcon = { })

        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
        ) {
            Text("Login")
        }
        Spacer(modifier = Modifier.height(16.dp))

        TextButton(onClick = {}) {
            //TODO Add under line on this text
            Text(text = "Forgot Password ?")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Or Sign In With")

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(R.drawable.google),
                contentDescription = "تسجيل الدخول بحساب جوجل ",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //Google Auth Clickable
                    }

            )

            Image(
                painter = painterResource(R.drawable.facebook),
                contentDescription = "تسجيل الدخول بفيس بوك",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //Face Book open Auth Clickable
                    }

            )
        }


    }

}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){

    AndroidLoginModuleJetPackComposeTheme {
       // LoginScreen()
    }
}