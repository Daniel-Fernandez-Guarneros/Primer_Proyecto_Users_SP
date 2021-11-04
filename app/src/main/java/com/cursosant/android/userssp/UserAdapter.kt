package com.cursosant.android.userssp

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cursosant.android.userssp.databinding.ItemUserBinding

/****
 * Proyecto: Fundamentos Kotlin
 *
 * Daniel Fernandez Guarneros
 *
 * 4°A Desarrollo de Software Multiplataforma
 *
 * Diseño para Apps
 *
 ***/
class UserAdapter(private val users: List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ItemUserBinding.bind(view)
    }
}