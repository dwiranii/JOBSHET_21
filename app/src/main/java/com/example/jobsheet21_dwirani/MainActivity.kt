package com.example.jobsheet21_dwirani

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "ARDIAN MUHAMMAD IQBAL",
        "BAGAS SAPUTRA",
        "CHELSIA ADITYA SUYATNO",
        "DIMAS ILHAMSYAH RAMADHAN",
        "DINA MUSTIKA",
        "DWI RANI SYARIFAH",
        "FIFIT SHOLIKHATUL MUFALAH",
        "FIKA ISMATUL HAWA",
        "FIKI ZULKARNAIN",
        "HEYDARISTO ZHAHIR RAZAQ",
        "IKHA NUR ROCHAYATIN",
    )
    lateinit var KelasView: RecyclerView
    lateinit var KelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        KelasView = findViewById(R.id.KelasView)
        KelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i]))
        }

        KelasAdapter = KelasAdapter(list)
        KelasAdapter.notifyDataSetChanged()
        KelasView.adapter = KelasAdapter
    }
}