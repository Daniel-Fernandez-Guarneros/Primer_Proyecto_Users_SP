package com.cursosant.android.userssp

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
interface OnClickListener {
    fun onClick(user: User, position: Int)
}