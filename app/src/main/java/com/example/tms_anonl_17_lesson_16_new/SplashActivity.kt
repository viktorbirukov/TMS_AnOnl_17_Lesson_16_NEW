package com.example.tms_anonl_17_lesson_16_new

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Переход к следующей активити через некоторое время (2 секунды)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, OnboardingActivity::class.java))
        }, 2000)

        // Переход к активити входа через некоторое время (4 секунды)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
        }, 4000)

        // Переход к активити регистрации через некоторое время (6 секунд)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, RegistrationActivity::class.java))
            finish() // Закрываем текущую активити после запуска регистрации
        }, 6000)
    }
}