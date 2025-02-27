package com.example.first_aid_guide_for_tram_drivers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.first_aid_guide_for_tram_drivers.R

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        // Загрузка текста справки из ресурсов
        val helpText = getString(R.string.help_text)
        val textViewHelp = findViewById<TextView>(R.id.text_view_help)
        textViewHelp.text = helpText
    }
}