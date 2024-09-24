package com.nawaf.latihan_list_view.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nawaf.latihan_list_view.DetailCustomImage
import com.nawaf.latihan_list_view.R
import com.nawaf.latihan_list_view.model.ModelBuah

class BuahAdapter(private val context: Context, private val images: Array<Int>,
                  private val judulnya: Array<String> ): BaseAdapter(){
    override fun getCount(): Int {
        return images.size
        return judulnya.size
    }

    override fun getItem(position: Int): Any {
        return images[position]
        return judulnya[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int,  convertView: View?, parent: ViewGroup?): View {
        val view: View
        val imageView: ImageView
        val judul : TextView
        if (convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_buah, parent, false)
            imageView = view.findViewById(R.id.gambar)
            judul = view.findViewById(R.id.nama)
        } else{
            view = convertView
            imageView = view.findViewById(R.id.gambar)
            judul = view.findViewById(R.id.nama)
        }
        imageView.setImageResource(images[position])
        judul.setText(judulnya[position])
        return view
    }

}