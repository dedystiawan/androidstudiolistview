package com.example.listviewdedy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<tipe>()

        list.add(tipe("Presiden Pertama", "Ir.Soekarno", R.drawable.sukarno))
        list.add(tipe("Presiden Kedua", "Jend. TNI Purn. H.M. Soeharto", R.drawable.soeharto))
        list.add(tipe("Preside Ketiga", "Bj Habibie", R.drawable.habibi))
        list.add(tipe("Presiden Keempat", "Abdurahman Wahid", R.drawable.gusdur))
        list.add(tipe("Presiden Kelima", "Megawati Soekarno Puteri", R.drawable.megawati))
        list.add(tipe("Presiden Keenam", "Susilo Bambang Yudhoyono", R.drawable.sby))
        list.add(tipe("Presiden Ketujuh", "Joko Widodo", R.drawable.jokowi))

        listview.adapter = listadapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent, view, position, id ->

            if (position == 0) {
                val intent= Intent(this, soekarno::class.java)
                startActivity(intent)
            }
            if (position == 1) {
                val intent= Intent(this, soeharto::class.java)
                startActivity(intent)
            }
            if (position == 2) {
                val intent= Intent(this, habibi::class.java)
                startActivity(intent)
            }
            if (position == 3) {
                val intent= Intent(this, gusdur::class.java)
                startActivity(intent)
            }
            if (position == 4) {
                val intent= Intent(this, megawati::class.java)
                startActivity(intent)

            }
            if (position == 5) {
                val intent= Intent(this, sby::class.java)
                startActivity(intent)
            }
            if (position == 6) {
                val intent= Intent(this, jokowi::class.java)
                startActivity(intent)
            }
        }
    }
}
