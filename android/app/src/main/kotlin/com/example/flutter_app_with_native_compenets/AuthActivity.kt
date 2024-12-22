package com.example.flutter_app_with_native_compenets

import LoginScreen
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.auth.jet.ui.theme.MyApplicationTheme
import com.google.firebase.FirebaseApp

class AuthActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            MyApplicationTheme(darkTheme = false, content = {
                LoginScreen(op = {
                    val resultIntent = Intent()
                    resultIntent.putExtra("authResult", it)
                    setResult(RESULT_OK, resultIntent)
                    finish();

                })
            })
        }
    }
}
