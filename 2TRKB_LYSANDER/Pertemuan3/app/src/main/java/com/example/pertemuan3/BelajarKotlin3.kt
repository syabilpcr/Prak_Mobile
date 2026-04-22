package com.example.pertemuan3

import kotlin.math.cos

fun main() {
    val kataMutable : MutableList<String> = mutableListOf("Hai", "Halo", "Aloha")
    println("List yang menggunakan kata mutable " + kataMutable)

    kataMutable.add("Hi")
    println("List mutable setelah ditambah " + kataMutable)

    kataMutable.removeAt(0)
    println("List mutable setelah dihapus " + kataMutable)

    kataMutable.shuffle()
    println("List mutable setelah shuffle " + kataMutable)

    val kataImmutable : List<String> = kataMutable
    println(kataImmutable)

    println("Kata pertama dari mutable : " + kataImmutable.first())

    val cobaSet = setOf("Belajar", "Pemrograman", "Mobile")
    println("Set : " + cobaSet)

    val cobaMap = mapOf(1 to "Shumaya", 2 to "Resty", 3 to "Ramadhani")
    println("Map : " + cobaMap.values)
}