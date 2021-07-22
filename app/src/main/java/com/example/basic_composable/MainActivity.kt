package com.example.basic_composable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.basic_composable.ui.theme.Basic_ComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(name = "Android")
        }
        testFunction(5,::testFunctionLambda)
        testFunction1(88)
    }
    fun testFunction(int:Int,myfunction : ()->Unit){
        //lambda fonksiyonun parametre olarak başka bir fonksiyonu alması diyebiliriz.
        myfunction.invoke()
    }
    fun testFunction1(int:Int){
        testFunctionLambda()
    }
    fun testFunctionLambda(){
        println("test_Lambda")
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Basic_ComposableTheme {
        Greeting("Android")
    }
}