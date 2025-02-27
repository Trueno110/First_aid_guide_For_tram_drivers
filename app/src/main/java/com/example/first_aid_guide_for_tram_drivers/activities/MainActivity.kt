package com.example.first_aid_guide_for_tram_drivers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.first_aid_guide_for_tram_drivers.R
import com.example.first_aid_guide_for_tram_drivers.adapters.SectionsAdapter
import com.example.first_aid_guide_for_tram_drivers.models.Section
import com.example.first_aid_guide_for_tram_drivers.utils.Constants

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Создание списка разделов справочника
        val sections = listOf(
            Section(1, Constants.Sections.FIRST_AID.titleResId, "Описание первой помощи", R.drawable.ic_first_aid),
            Section(2, Constants.Sections.DOCUMENTS.titleResId, "Список необходимых документов", R.drawable.ic_documents),
            Section(3, Constants.Sections.RULES.titleResId, "Основные правила поведения", R.drawable.ic_rules)
        )

        // Настройка адаптера для списка разделов
        val listView = findViewById<ListView>(R.id.list_view_sections)
        val adapter = SectionsAdapter(this, sections)
        listView.adapter = adapter
    }
}