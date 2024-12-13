package com.example.myvizit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myvizit.ui.theme.MyVizitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyVizitTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = Color(0xff008f00)
                ) {
                    Greeting(
                        name = "Кануркин Максим",
                        title = "Android Developer Extraordinaire",
                        phone = "+77777777777",
                        social = "@msxon_0",
                        email = "maxwellsshop0@gmail.com"
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(
    name: String,
    title: String,
    phone: String,
    social: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        GreetingImageOne(
            name = name,
            title = title,
        )

        GreetingIcon(
            phone = phone,
            social = social,
            email = email
        )
    }
}

@Composable
fun GreetingImageOne(name: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable._24299)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.None,
                modifier = Modifier
                    .padding(4.dp)
            )
        }

        GreetingTextOne(
            name = name,
            title = title,
            modifier = Modifier
                .fillMaxSize()
        )
    }
}

@Composable
fun GreetingTextOne(name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = name,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(4.dp)
            )

        Text(
            text = title,
            fontSize = 16.sp,
            color = Color(0xFF3ddc84),
            modifier = Modifier
                .padding(4.dp)
        )
    }
}

@Composable
fun GreetingIcon(phone: String, social: String, email: String, modifier: Modifier = Modifier) {
    Box() {
        Column() {
            Box(
                modifier = Modifier
                    .padding(4.dp)
            ) {
                Row {
                    Icon(
                        Icons.Rounded.Call,
                        contentDescription = null,
                        tint = Color(0xFF3ddc84),
                        modifier = Modifier
                            .padding(4.dp)
                    )
                    Text(
                        text = phone,
                        color = Color(0xFF3ddc84),
                        modifier = Modifier
                            .padding(
                                start = 20.dp,
                                end = 4.dp,
                                top = 4.dp,
                                bottom = 4.dp
                            )
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(4.dp)
            ) {
                Row {
                    Icon(
                        Icons.Rounded.Share,
                        contentDescription = null,
                        tint = Color(0xFF3ddc84),
                        modifier = Modifier
                            .padding(4.dp)
                    )
                    Text(
                        text = social,
                        color = Color(0xFF3ddc84),
                        modifier = Modifier
                            .padding(
                                start = 20.dp,
                                end = 4.dp,
                                top = 4.dp,
                                bottom = 4.dp
                            )
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(4.dp)
            ) {
                Row {
                    Icon(
                        Icons.Rounded.Email,
                        contentDescription = null,
                        tint = Color(0xFF3ddc84),
                        modifier = Modifier
                            .padding(4.dp)
                    )
                    Text(
                        text = email,
                        color = Color(0xFF3ddc84),
                        modifier = Modifier
                            .padding(
                                start = 20.dp,
                                end = 4.dp,
                                top = 4.dp,
                                bottom = 4.dp
                            )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyVizitTheme {
        Greeting(
            name = "Кануркин Максим",
            title = "Android Developer Extraordinaire",
            phone = "+77777777777",
            social = "@msxon_0",
            email = "maxwellsshop0@gmail.com"
        )
    }
}