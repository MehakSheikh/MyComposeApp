package com.example.mycomposeapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.mycomposeapp.viewmodel.SignUpViewModel

//@Preview(backgroundColor = 0xFFFFFF, showBackground = true, showSystemUi = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen() {
    val signUpViewModel: SignUpViewModel = hiltViewModel()
    // State variables to store user input
    val email = remember {
        mutableStateOf("")
    }
    val userName = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    val confirmPassword = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 8.dp, top = 24.dp, end = 8.dp),
    ) {
        Text(
            text = "Sign Up",
            modifier = Modifier
            //     .clip(shape = MaterialTheme.shapes.medium)
            ,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = "Sign Up to your account", modifier = Modifier
                // .clip(shape = MaterialTheme.shapes.medium)
                .padding(0.dp, 20.dp, 0.dp, 0.dp), fontSize = 24.sp,
            color = Color.Black,
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.width(16.dp))
        // Email input field
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
        // Username input field
        OutlinedTextField(
            value = userName.value, onValueChange = {
                userName.value = it
            },
            label = {
                Text(text = "User Name")
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
        OutlinedTextField(
            value = confirmPassword.value, onValueChange = {
                confirmPassword.value = it
            },
            trailingIcon = {
                Icon(Icons.Default.Person, contentDescription = "password")
            },
            label = {
                Text(text = "Confirm Password")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp, 0.dp, 0.dp)
        )

        Text(
            text = "already have an account?",
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp, 0.dp, 0.dp)
                .wrapContentWidth(Alignment.End),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            style = MaterialTheme.typography.titleLarge
        )

        Button(
            onClick = {signUpViewModel.signUpUser(email.value, userName.value, password.value,confirmPassword.value) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp, 0.dp, 0.dp)
                .height(54.dp), // Set the desired height,
            shape = MaterialTheme.shapes.extraSmall
        ) {
            Text("Sign Up")
        }
    }

}
