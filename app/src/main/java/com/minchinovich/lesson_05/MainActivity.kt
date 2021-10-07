package com.minchinovich.lesson_05

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.minchinovich.lesson_05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var toastText: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        toastText = getString(R.string.exception_toast_message)

        binding.sumButton.setOnClickListener {
            val arg1 = binding.firstNumberEdit.text.toString().toIntOrNull()
            val arg2 = binding.secondNumberEdit.text.toString().toIntOrNull()
            if (arg1 != null && arg2 != null) {
                binding.sumResultView.text = (arg1 + arg2).toString()
            } else {
                Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show()
            }
        }
    }
}