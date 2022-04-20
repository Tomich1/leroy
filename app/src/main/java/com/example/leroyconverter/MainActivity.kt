package com.example.leroyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast




open class MainActivity : AppCompatActivity() {
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val liraRadioButton: RadioButton = findViewById(R.id.liraButton)
        val inputLiraText: EditText = findViewById(R.id.liraText)
        val pesoRadioButton: RadioButton = findViewById(R.id.pessoButton)
        val inputPesoText: EditText = findViewById(R.id.pesoText)
        val buttonPs: Button = findViewById(R.id.convertPesso)
        buttonPs.setOnClickListener {
            if (inputPesoText.text.isEmpty()) {
                Toast.makeText(
                    applicationContext, "Введите цену в песо",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                
                val inputValue = inputPesoText.text.toString().toInt()
                if (pesoRadioButton.isChecked) {
                    inputPesoText.setText(convertPeso(inputValue).toString())
                }
            }
        }
        val buttonLr: Button = findViewById(R.id.convertLira)
        buttonLr.setOnClickListener {
            if (inputLiraText.text.isEmpty()) {
                Toast.makeText(
                    applicationContext, "Введите цену в лира",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                val inputValue = inputLiraText.text.toString().toInt()
                if (liraRadioButton.isChecked) {
                    inputLiraText.setText(convertLira(inputValue).toString())
                }
            }
        }
    }
    private fun convertLira(parrot: Int): Int = (parrot * 2.1218+1).toInt()
    private fun convertPeso(parrot: Int): Int = (parrot * 0.2782+1).toInt()
}


        


            
            



