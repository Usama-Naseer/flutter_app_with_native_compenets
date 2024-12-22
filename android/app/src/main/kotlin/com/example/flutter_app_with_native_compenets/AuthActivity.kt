package com.example.flutter_app_with_native_compenets

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class AuthActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AuthScreen()
        }
    }

    @Composable
    fun AuthScreen() {
        Button(onClick = {
            // Pass data back to MainActivity
            val resultIntent = Intent()
            resultIntent.putExtra("authResult", "User Authenticated Successfully!")
            setResult(Activity.RESULT_OK, resultIntent)
            finish() // Close the activity
        }) {
            Text("Send Result and Close")
        }
    }
}
