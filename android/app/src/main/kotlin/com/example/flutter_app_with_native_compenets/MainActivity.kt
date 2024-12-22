package com.example.flutter_app_with_native_compenets

import android.app.Activity
import android.content.Intent
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel

class MainActivity : FlutterActivity() {
    private val authChannel = "auth_channel"
    private lateinit var channel: MethodChannel
    private var result: MethodChannel.Result? = null
    private val REQUEST_CODE_AUTH = 123

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        channel = MethodChannel(flutterEngine.dartExecutor.binaryMessenger, authChannel)
        channel.setMethodCallHandler { call, result ->
            when (call.method) {
                "startNewActivity" -> {
                    this.result = result
                    startNewActivity()

                }
                else -> {
                    result.notImplemented()
                }
            }
        }
    }

    private fun startNewActivity() {
        val intent = Intent(this, AuthActivity::class.java)
        intent.putExtra("extraData", "Some Data") // Pass data to the new activity if needed
        startActivityForResult(intent, REQUEST_CODE_AUTH)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_AUTH) {
            if (resultCode == Activity.RESULT_OK) {
                val authResult = data?.getStringExtra("authResult") ?: "No Result"
                result?.success(authResult) // Send the result back to Flutter
            } else {
                result?.success("Activity Cancelled")
            }
        }
    }
}
