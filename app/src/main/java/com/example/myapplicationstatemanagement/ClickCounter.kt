package com.example.myapplicationstatemanagement

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ClickDemo() {
     SimpleColumn()

    }



@Composable
fun SimpleColumn (){
    var ScrollState= rememberScrollState()

    Column (
      modifier = Modifier.verticalScroll(ScrollState)

    ){
      for (i in 1..100)
          Text(text="Item$i", modifier = Modifier.fillMaxWidth().padding(20.dp),
              textAlign = TextAlign.Center, fontSize = 20.sp
              )
    }


}