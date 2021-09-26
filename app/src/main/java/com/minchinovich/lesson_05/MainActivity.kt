package com.minchinovich.lesson_05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.minchinovich.lesson_05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.sumButton.setOnClickListener {
            if (binding.firstNumberEdit.text.isNotEmpty() && binding.secondNumberEdit.text.isNotEmpty()){
                var arg1 = binding.firstNumberEdit.text.toString().toIntOrNull() ?: 0
                var arg2 = binding.secondNumberEdit.text.toString().toIntOrNull() ?: 0
                binding.sumResultView.text = (arg1 + arg2).toString()
            } else {
                Toast.makeText(this, getString(R.string.exception_toast_message), Toast.LENGTH_SHORT).show()
            }
        }
    }
}