package com.example.first_aid_guide_for_tram_drivers.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.first_aid_guide_for_tram_drivers.R
import com.example.first_aid_guide_for_tram_drivers.models.Section

class SectionsAdapter(private val context: Context, private val sections: List<Section>) : BaseAdapter() {

    override fun getCount(): Int {
        return sections.size
    }

    override fun getItem(position: Int): Any {
        return sections[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        if (view == null) {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.item_section, parent, false)
        }

        val textViewTitle = view?.findViewById<TextView>(R.id.text_view_title)
        val imageViewIcon = view?.findViewById<ImageView>(R.id.image_view_icon)

        val section = sections[position]
        textViewTitle?.text = section.title.toString()
        imageViewIcon?.setImageResource(section.iconResId)

        return view ?: View(context)
    }
}