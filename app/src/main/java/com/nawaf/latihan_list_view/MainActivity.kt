package com.nawaf.latihan_list_view

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.nawaf.latihan_list_view.adapter.BuahAdapter

class MainActivity : AppCompatActivity() {

    private val imageList = arrayOf(
        R.drawable.movie1,
        R.drawable.movie2,
        R.drawable.movie3,
        R.drawable.movie4,
        R.drawable.movie5
    )

    private val title = arrayOf("Captain Amerika", "Ironman", "Spiderman", "Fast n Forious", "OppenHeimer")
    private val tgl = arrayOf(
        "Tanggal Release : 20 November 2000",
        "Tanggal Release : 10 Januari 2005",
        "Tanggal Release : 5 Maret 2007",
        "Tanggal Release : 17 Agustus 2024",
        "Tanggal Release : 1 Juni 2004"
    )

    private val des = arrayOf(
        "Captain America, yang diciptakan oleh Joe Simon dan Jack Kirby, pertama kali muncul di #1 pada tahun 1941. Karakter ini adalah alter ego Steve Rogers, seorang pemuda yang lemah dan ditolak oleh militer, namun setelah menerima serum super-soldier, ia menjadi prajurit yang sangat kuat. Dia menjadi simbol harapan dan keberanian selama Perang Dunia II, melawan Nazi dan berbagai ancaman lainnya",
        "Iron Man, atau Tony Stark, adalah karakter fiksi dari Marvel Comics. Dia adalah seorang miliarder, jenius, dan pencipta baju besi canggih yang memberinya kekuatan super. Dalam film, dia diperankan oleh Robert Downey Jr. dan dikenal sebagai anggota inti Avengers.",
        "Spider-Man, atau Peter Parker, adalah karakter fiksi dari Marvel Comics. Dia adalah remaja yang mendapatkan kekuatan super setelah digigit laba-laba radioaktif, dan dia menggunakan kemampuannya untuk melindungi kota New York sebagai pahlawan.",
        "Film Fast & Furious adalah seri film aksi yang berfokus pada balapan mobil, pencurian, dan petualangan. Cerita biasanya mengikuti karakter utama seperti Dominic Toretto dan Brian O'Conner, yang terlibat dalam berbagai misi yang melibatkan kecepatan tinggi, aksi spektakuler, dan ikatan keluarga.",
        "Film Oppenheimer mengisahkan kehidupan J. Robert Oppenheimer, ilmuwan yang dikenal sebagai bapak bom atom. Cerita ini mengeksplorasi perjalanan hidupnya, perannya dalam Proyek Manhattan, dan dilema moral yang dihadapi saat menciptakan senjata pemusnah massal. "
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView = findViewById<ListView>(R.id.rv_data)
        val adapter = BuahAdapter(this, imageList, title)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetailCustomImage::class.java)
            intent.putExtra("data", imageList[position])
            intent.putExtra("data1", title[position])
            intent.putExtra("data3", tgl[position])
            intent.putExtra("data4", des[position])
            startActivity(intent)
        }

    }
}