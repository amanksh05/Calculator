package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNum1 = findViewById<EditText>(R.id.etNum1)
        val etNum2 = findViewById<EditText>(R.id.etNum2)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        val btnModulus = findViewById<Button>(R.id.btnModulus)



        btnAdd.setOnClickListener{
            val firstNumber = etNum1.text.toString().toInt()
            val secondNumber = etNum2.text.toString().toInt()

            val result = firstNumber+secondNumber
            tvResult.text=result.toString()
        }

        btnSubtract.setOnClickListener{
            val firstNumber = etNum1.text.toString().toInt()
            val secondNumber = etNum2.text.toString().toInt()

            val result = firstNumber-secondNumber
            tvResult.text=result.toString()
        }

        btnMultiply.setOnClickListener{
            val firstNumber = etNum1.text.toString().toInt()
            val secondNumber = etNum2.text.toString().toInt()

            val result = firstNumber*secondNumber
            tvResult.text=result.toString()
        }

        btnDivide.setOnClickListener{
            val firstNumber = etNum1.text.toString().toInt()
            val secondNumber = etNum2.text.toString().toInt()

            val result = firstNumber/secondNumber
            tvResult.text=result.toString()
        }

        btnModulus.setOnClickListener{
            val firstNumber = etNum1.text.toString().toInt()
            val secondNumber = etNum2.text.toString().toInt()

            val result = firstNumber % secondNumber
            tvResult.text=result.toString()
        }

    }
}