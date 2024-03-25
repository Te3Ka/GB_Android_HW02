package ru.te3ka.homework02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.te3ka.homework02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.customView02.setTopText("Настройка верхней строки из кода программы")
        binding.customView02.setBottomText("Настройка нижней строки из кода программы")
    }
}