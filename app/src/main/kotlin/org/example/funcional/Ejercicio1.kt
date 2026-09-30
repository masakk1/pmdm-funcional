package org.example.funcional

fun main() {
    print("Introduce numero: ")
    val entrada = readln().toInt()

    val tacaClausura: (IntArray) -> Unit = { arr ->
        arr.filter { n -> n % entrada == 0 }
            .forEach { println(it) }
    }

    val tacaNoClausura: (IntArray, Int) -> Unit = { arr, div ->
        arr.filter { n -> n % div == 0 }
            .forEach { println(it) }
    }

    println("Sin clausura")
    tacaClausura(intArrayOf(1, 2, 3, 4, 5, 6))

    println("Con clausura")
    tacaNoClausura(intArrayOf(1, 2, 3, 4, 5, 6), entrada)
}