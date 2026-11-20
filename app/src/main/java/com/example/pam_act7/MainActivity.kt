package com.example.pam_act7 // Pastikan package ini sesuai dengan nama proyekmu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.pam_act7.ui.theme.PAM_Act7Theme
import com.example.pam_act7.uicontroller.SiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PAM_Act7Theme {
                // Aplikasi dibungkus dengan Surface agar background-nya rapi
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Memanggil navigasi utama aplikasi
                    SiswaApp()
                }
            }
        }
    }
}