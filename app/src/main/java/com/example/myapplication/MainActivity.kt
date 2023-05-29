package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import java.util.logging.Level
import java.util.logging.Logger

class MainActivity : ComponentActivity() {

    var logger = Logger.getLogger("MainActivity")

    lateinit var editText:TextView
    lateinit var emailTextView:TextView
    lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById<TextView>(R.id.editTextText)

        emailTextView = findViewById<TextView>(R.id.editTextTextEmailAddress)
        button = findViewById(R.id.button)

        button.setOnClickListener({ view ->  logger.log(Level.INFO,"EditText" + editText?.text + "  email = " + emailTextView?.text) })
    }

    override fun onStop() {
        super.onStop()
        logger.log(Level.INFO,"on stop method")
    }

    override fun onResume() {
        super.onResume()
    }
}