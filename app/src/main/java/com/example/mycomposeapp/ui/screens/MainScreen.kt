package com.example.mycomposeapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ScrollableTabRow
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
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

    Box {
        Column {
    TopAppBar(
        title = {  Column {
            Text(
                text = "Welcome to",
             //   textAlign = TextAlign.Center
            )
            Text(
                text = "Grocery User",
               // textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
        } },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            item {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 16.dp, top = 16.dp, end = 16.dp),
                ) {

                    // Search bar
                    OutlinedTextField(
                        value = textSearch.value, onValueChange = {
                            textSearch.value = it
                        },
                        leadingIcon = {
                            Icon(Icons.Default.Search, contentDescription = "search")
                        },
                        label = {
                            Text(text = "Search")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(0.dp, 0.dp, 0.dp, 0.dp)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

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
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        modifier = Modifier
                            // .fillMaxSize()
                            .horizontalScroll(rememberScrollState())
                    ) {
                        ImageItem("Image1", R.drawable.ic_launcher_foreground)
                        // Spacer(modifier = Modifier.width(16.dp))
                        ImageItem("Image2", R.drawable.ic_launcher_foreground)
                        //    Spacer(modifier = Modifier.width(16.dp))
                        ImageItem("Image3", R.drawable.ic_launcher_foreground)
                        //    Spacer(modifier = Modifier.width(16.dp))
                        ImageItem("Image4", R.drawable.ic_launcher_foreground)

                    }
                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Trending",
                        modifier = Modifier
                        //     .clip(shape = MaterialTheme.shapes.medium)
                        ,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        style = MaterialTheme.typography.titleLarge
                    )

//        val paddingModifier  = Modifier.padding(10.dp)
                    Row(
                        modifier = Modifier
                            // .fillMaxSize()
                            .horizontalScroll(rememberScrollState())
                    ) {
                        Card(
                            shape = RoundedCornerShape(8.dp),
//            elevation = 4.dp,
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxWidth()
                        ) {

                            Column(
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = null, // Add appropriate content description
                                    modifier = Modifier
                                        .height(150.dp)
                                        .fillMaxWidth()
                                        .clip(shape = RoundedCornerShape(8.dp)),
                                    contentScale = ContentScale.Crop
                                )
                                Spacer(modifier = Modifier.height(16.dp))
                                Text(
                                    text = "Apple",
                                    style = MaterialTheme.typography.titleSmall,
                                    textAlign = TextAlign.Center,
                                    //   modifier = Modifier.fillMaxWidth()
                                )
                                Spacer(modifier = Modifier.height(16.dp))
                                Text(
                                    text = "$50",
                                    style = MaterialTheme.typography.titleSmall,
                                    textAlign = TextAlign.Center,
                                    //   modifier = Modifier.fillMaxWidth()
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Recommended",
                        modifier = Modifier
                        //     .clip(shape = MaterialTheme.shapes.medium)
                        ,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        style = MaterialTheme.typography.titleLarge
                    )

                    Row(
                        modifier = Modifier
                            // .fillMaxSize()
                            .horizontalScroll(rememberScrollState())
                    ) {
                        Card(
                            shape = RoundedCornerShape(8.dp),
//            elevation = 4.dp,
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxWidth()
                        ) {

                            Column(
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = null, // Add appropriate content description
                                    modifier = Modifier
                                        .height(150.dp)
                                        .fillMaxWidth()
                                        .clip(shape = RoundedCornerShape(8.dp)),
                                    contentScale = ContentScale.Crop
                                )
                                Spacer(modifier = Modifier.height(16.dp))
                                Text(
                                    text = "Apple",
                                    style = MaterialTheme.typography.titleSmall,
                                    textAlign = TextAlign.Center,
                                    //   modifier = Modifier.fillMaxWidth()
                                )
                                Spacer(modifier = Modifier.height(16.dp))
                                Text(
                                    text = "$50",
                                    style = MaterialTheme.typography.titleSmall,
                                    textAlign = TextAlign.Center,
                                    //   modifier = Modifier.fillMaxWidth()
                                )
                            }
                        }
                    }

                }}}
            }
        }
    }
}

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
            //.padding(8.dp)
            .width(160.dp) // Adjust the width as needed
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
        Text(
            text = description,
            style = MaterialTheme.typography.titleSmall,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth() // Ensure text is centered horizontally
        )
        }
}
@Preview(showBackground = true)
@Composable
fun PreviewTextWithIconExample() {
    MainScreen()
}