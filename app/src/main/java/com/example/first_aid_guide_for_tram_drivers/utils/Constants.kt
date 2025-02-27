package com.example.first_aid_guide_for_tram_drivers.utils

object Constants {
    const val BASE_URL = "https://example.com/api/"

    enum class Sections {
        FIRST_AID("first-aid"),
        DOCUMENTS("documents"),
        RULES("rules");

        val titleResId: Int
            get() = when(this) {
                FIRST_AID -> R.string.section_first_aid
                DOCUMENTS -> R.string.section_documents
                RULES -> R.string.section_rules
            }

        companion object {
            fun fromTitle(title: String): Sections? {
                return values().firstOrNull { it.name.equals(title, ignoreCase = true) }
            }
        }
    }
}
