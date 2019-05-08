package com.example.adogtame

import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.cardview_pet.view.*
import org.jetbrains.anko.image


class Adapter(val data: List<Pet>): RecyclerView.Adapter<Adapter.Holder>() {
    /*
    * Funcion que infla nuestra vista
    * */
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder = Holder(p0?.inflate(R.layout.cardview_pet))

    /*
    * Función que regresa el tamaño de nuestro lista
    * */
    override fun getItemCount(): Int {
        return data.size
    }

    /*
    * Método que bindea nuestra nuestra data
    * */
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindView(data[position])
    }

    class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindView(pet:Pet){
            with(pet){
                itemView.tvNamePet.text = name
                itemView.tvSexPet.text = description

            }
        }
    }

}