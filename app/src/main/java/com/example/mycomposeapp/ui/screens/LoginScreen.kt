package com.example.mycomposeapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.mycomposeapp.viewmodel.LoginViewModel


//@Preview(backgroundColor = 0xFFFFFF, showBackground = true, showSystemUi = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {

    val loginViewModel: LoginViewModel = hiltViewModel()
    // State variables to store user input
    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    //  var passwordVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 8.dp, top = 24.dp, end = 8.dp),
    ) {
        Text(
            text = "Login",
            modifier = Modifier
            //     .clip(shape = MaterialTheme.shapes.medium)
            ,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = "Sign in to your account", modifier = Modifier
                // .clip(shape = MaterialTheme.shapes.medium)
                .padding(0.dp, 20.dp, 0.dp, 0.dp), fontSize = 24.sp,
            color = Color.Black,
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.width(16.dp))
        // Username input field
        OutlinedTextField(
            value = email.value, onValueChange = {
                email.value = it
            },
            label = {
                Text(text = "Email")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp, 0.dp, 0.dp)
        )
        // Password input field
        OutlinedTextField(
            value = password.value, onValueChange = {
                password.value = it
            },
            trailingIcon = {
                Icon(Icons.Default.Person, contentDescription = "password")
            },
            label = {
                Text(text = "Password")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp, 0.dp, 0.dp)
        )
        /*   var password by remember { mutableStateOf("") }
           var passwordVisible by remember { mutableStateOf(false) }

           OutlinedTextFieldWithPasswordVisibilityToggle(
               value = password,
               onValueChange = { password = it },
               label = { Text("Password") },
               passwordVisible = passwordVisible,
               onPasswordToggleClick = { passwordVisible = !passwordVisible },
               modifier = Modifier.fillMaxWidth()
           )*/
        Text(
            text = "Forgot Password?",
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp, 0.dp, 0.dp)
                .align(Alignment.End),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            style = MaterialTheme.typography.titleLarge
        )

        Button(
            onClick = {loginViewModel.loginUser(email.value, password.value)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp, 0.dp, 0.dp)
                .height(54.dp), // Set the desired height,
            shape = MaterialTheme.shapes.extraSmall
        ) {
            Text("Login")
        }
    }

}
