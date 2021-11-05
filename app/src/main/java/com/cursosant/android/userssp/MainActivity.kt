package com.cursosant.android.userssp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cursosant.android.userssp.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManager : RecyclerView.LayoutManager

    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val preferences = getPreferences(Context.MODE_PRIVATE)

        val isFirstTime = preferences.getBoolean(getString(R.string.sp_first_time), true)
        Log.i("SP", "${getString(R.string.sp_first_time)} = $isFirstTime")

        if (isFirstTime) {
            MaterialAlertDialogBuilder(this)
                .setTitle(R.string.dialog_title)
                .setPositiveButton(R.string.dialog_confirm, { dialogInterface, i ->
                    preferences.edit().putBoolean(getString(R.string.sp_first_time), false).commit()
                })
                .setNegativeButton("Cancelar", null)
                .show()

        }

        userAdapter = UserAdapter(getUsers(), this)
        linearLayoutManager = LinearLayoutManager(this)

        binding.recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }
    }

    private fun getUsers(): MutableList<User>{
        val users = mutableListOf<User>()

        val daniel = User(1, "Daniel", "Fernandez", "https://scontent.fpbc3-1.fna.fbcdn.net/v/t1.6435-9/165595539_2008014026005877_4737015574878561084_n.jpg?_nc_cat=103&ccb=1-5&_nc_sid=174925&_nc_eui2=AeF_-5imhVfv55cB0jQKYJ4O1jpg-L9OtgjWOmD4v062CBY-BqAvLEjUXAW0rbN06-PQVfI3Rws-KP5DA4jZ98cc&_nc_ohc=KPeCdA0I8yoAX8m8iEO&_nc_oc=AQlHPRB8WKC0VqlOcvKfS-2eWYltuOTyrWGXbHRkdBDjURgUpFFre5q_Rvt4ggLTaZg&_nc_ht=scontent.fpbc3-1.fna&oh=091102027acdd60f3677651b41b276d0&oe=61A9F498")
        val samanta = User(2, "Samanta", "Meza", "https://upload.wikimedia.org/wikipedia/commons/b/b2/Samanta_villar.jpg")
        val javier = User(3, "Javier", "Gómez", "https://live.staticflickr.com/974/42098804942_b9ce35b1c8_b.jpg")
        val emma = User(4, "Emma", "Cruz", "https://upload.wikimedia.org/wikipedia/commons/d/d9/Emma_Wortelboer_%282018%29.jpg")

        users.add(daniel)
        users.add(samanta)
        users.add(javier)
        users.add(emma)
        users.add(daniel)
        users.add(samanta)
        users.add(javier)
        users.add(emma)
        users.add(daniel)
        users.add(samanta)
        users.add(javier)
        users.add(emma)
        users.add(daniel)
        users.add(samanta)
        users.add(javier)
        users.add(emma)

        return users
    }

    override fun onClick(user: User, position: Int) {
        Toast.makeText(this, "$position: ${user.getFullName()}" , Toast.LENGTH_SHORT).show()
    }
}