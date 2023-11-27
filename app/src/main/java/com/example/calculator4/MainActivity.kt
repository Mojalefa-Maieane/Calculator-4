package com.example.calculator4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculatorFunctions()
    }
    private fun calculatorFunctions(){
        var number1 = findViewById<EditText>(R.id.editTextNumber1)
        var number2 = findViewById<EditText>(R.id.editTextNumber2)

        var addButton1 = findViewById<Button>(R.id.AdditionButton)
        var substract = findViewById<Button>(R.id.SubtractButton)
        var clear = findViewById<Button>(R.id.clearButton)
        var multiply = findViewById<Button>(R.id.multiplyButton)
        var divide = findViewById<Button>(R.id.divideButton)

        substract.setOnClickListener{
            var addNumber1 = number1.text.toString().toInt()
            var addNumber2 = number2.text.toString().toInt()
            var result = addNumber1 - addNumber2
            Toast.makeText(this,"$result", Toast.LENGTH_SHORT).show()
        }
        addButton1.setOnClickListener{
            var addNumber1 = number1.text.toString().toInt()
            var addNumber2 = number2.text.toString().toInt()
            var result = addNumber1 + addNumber2
            Toast.makeText(this,"$result", Toast.LENGTH_SHORT).show()
        }
        clear.setOnClickListener{
            number1.setText("")
            number2.setText("")
        }
        multiply.setOnClickListener {
            var addNumber1 = number1.text.toString().toInt()
            var addNumber2 = number2.text.toString().toInt()
            var result = addNumber1 * addNumber2
            Toast.makeText(this,"$result", Toast.LENGTH_SHORT).show()
        }
        divide.setOnClickListener {
            var addNumber1 = number1.text.toString().toInt()
            var addNumber2 = number2.text.toString().toInt()
            var result = addNumber1 / addNumber2
            Toast.makeText(this,"$result", Toast.LENGTH_SHORT).show()
        }
    }
}