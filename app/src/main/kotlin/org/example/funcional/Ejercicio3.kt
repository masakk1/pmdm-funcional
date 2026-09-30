package org.example.funcional

import java.io.StringWriter
import kotlin.math.floor

fun main() {
    val reales = listOf(0.5, 1.6, 2.8, 3.9, 4.1, 5.2, 6.3, 7.4, 8.1, 9.2)

    val encadenado = StringWriter()
    reales.forEach { encadenado.append(" $it") }
    println(encadenado)

    println(
        reales.map { it - floor(it) }
            .count { it > 0.5 }
    )

    println(reales.count { it.toInt() % 3 == 0 })

    println(
        reales.map {
            object {
                val original = it
                val decimal = it - floor(it)
            }
        }
            .filter { it.decimal > 0.5 }
            .maxByOrNull { it.original }
            ?.original
    )
}