package com.example.mycomposeapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.mycomposeapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    // var text by remember { mutableStateOf("") }
    //  var textSearch by remember { mutableStateOf(TextFieldValue("")) }
    val textSearch = remember {
        mutableStateOf("")
    }
    TopAppBar(
        title = { Text(text = "Welcome to Grocery User") },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 8.dp, top = 64.dp, end = 8.dp),
    ) {

                // Email input field
                OutlinedTextField(
                    value = textSearch.value, onValueChange = {
                        textSearch.value = it
                    },
                    leadingIcon = {
                        Icon(Icons.Default.Person, contentDescription = "search")
                    },
                    label = {
                        Text(text = "Search")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 20.dp, 0.dp, 0.dp)
                )

                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = "Categories",
                    modifier = Modifier
                    //     .clip(shape = MaterialTheme.shapes.medium)
                    ,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    style = MaterialTheme.typography.titleLarge
                )

                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .horizontalScroll(rememberScrollState())
                ) {
                    item {
                        ImageItem("Image1", R.drawable.ic_launcher_foreground)
                        Spacer(modifier = Modifier.width(16.dp))
                        ImageItem("Image2", R.drawable.ic_launcher_foreground)
                        Spacer(modifier = Modifier.width(16.dp))
                        ImageItem("Image3", R.drawable.ic_launcher_foreground)
                        Spacer(modifier = Modifier.width(16.dp))
                        ImageItem("Image4", R.drawable.ic_launcher_foreground)
                    }
                }
    }}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField() {
    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
        // .padding(0.dp,24.dp,0.dp,0.dp)
    ) {
        TextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            label = { Text("Search") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
    }
}

@Composable
fun TextWithIconExample() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Icon from material3 library
        Icon(imageVector = Icons.Default.Person, contentDescription = null)


        // Text with icon
        Text("User Profile")
    }
}
@Composable
fun ImageItem(description: String, imageRes: Int) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .width(200.dp) // Adjust the width as needed
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = description,
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
                .background(Color.Gray), // Add a background if needed
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(description, style = MaterialTheme.typography.bodyMedium)
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewTextWithIconExample() {
    MainScreen()
}