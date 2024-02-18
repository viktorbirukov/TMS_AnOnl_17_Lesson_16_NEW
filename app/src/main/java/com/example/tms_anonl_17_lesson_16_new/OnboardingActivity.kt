package com.example.tms_anonl_17_lesson_16_new

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity : AppCompatActivity() {

    private val numScreens = 3 // Количество экранов онбординга
    private var currentScreen = 0 // Текущий индекс экрана

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        // Запуск таймера для автоматического перехода к следующему экрану каждые 3 секунды
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            navigateToNextScreen()
        }, 3000)
    }

    private fun navigateToNextScreen() {
        // Увеличиваем текущий индекс экрана
        currentScreen++

        if (currentScreen < numScreens) {
            // Если есть следующий экран, открываем его
            val intent = Intent(this, OnboardingActivity::class.java)
            startActivity(intent)
            finish() // Закрываем текущую активити
        } else {
            // Если это последний экран, переходим к следующей активити (например, LoginActivity)
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Закрываем текущую активити
        }
    }
}
