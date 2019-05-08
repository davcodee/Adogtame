package com.example.adogtame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        rvPets.layoutManager = GridLayoutManager(this, 2)

        val item = (0..20).map {
            Pet("Max $it", 3 + it, "Es una mascota muy tierna" )
        }
        //Setteamos nuestro adaptador
        rvPets.adapter = Adapter(item)
    }
}
