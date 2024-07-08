package com.example.mywaterbottle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mywaterbottle.ui.theme.MyWaterBottleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyWaterBottleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var usedAmount by remember {
                        mutableStateOf(400)
                    }
                    val totalWaterAmount = remember{
                        2400
                    }
                     Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        WaterBottle(totalWaterAmount = totalWaterAmount, unit = "ml", useWaterAmount = usedAmount, modifier = Modifier.width(250.dp))
                         Spacer(modifier = Modifier.height(20.dp))
                         Text(text = "Total Air Minum : $$totalWaterAmount")
                         Spacer(modifier = Modifier.height(20.dp))
                         Button(onClick = { usedAmount += 200}){
                             Text(text = "Minum")
                         }
                    }
                }
            }
        }
    }
}

