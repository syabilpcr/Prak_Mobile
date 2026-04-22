package com.example.pertemuan3

fun main() {
    for (n in 1..10) {
        println("Sebelum break, nilai: $n")
        if (n == 5) {
            println("Proses loop berhenti karena break")
            break
        }
    }

    for (ch in 'A'..'C') {
        for (n in 1..4){
            println("$ch and $n")
            if (n == 2)
                break
        }
    }

    println()

    contohLoop@ for (nilai in 1..10) {
        if (nilai == 5) {
            println("Nilai ini berada pada block If " + nilai + "\n-- Jadi program akan berhenti")
            break@contohLoop
        } else {
            println("Nilai ini berada pada block Else " + nilai)
            continue@contohLoop
        }
    }
}