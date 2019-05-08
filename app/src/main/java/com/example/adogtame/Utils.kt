package com.example.adogtame

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast


/*
* Extension function for show toast
* */
fun Activity.showToastShort(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT ).show()
}

/*
* Extension function for show ToastLong
* */
fun Activity.showToastLong(message: String){
    Toast.makeText(this, message,Toast.LENGTH_LONG).show()
}

/*
* Extension function for inflate layout
* */
fun ViewGroup.inflate(resourceId : Int) : View {
   return LayoutInflater.from(context).inflate(resourceId,this,false)
}


