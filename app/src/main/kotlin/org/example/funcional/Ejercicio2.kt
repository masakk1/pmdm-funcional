package org.example.funcional

fun main() {
    val predicadoIgualdad: (String, String) -> Boolean = { a, b -> a == b }

    val buscaCoincidencia: (List<String>, String) -> String? = { lista, palabra ->
        lista.first { predicadoIgualdad(it, palabra) }
    }

    // ejemplo
    val nombres = listOf("Ana", "Juan", "Pedro")
    val encontrado = buscaCoincidencia(nombres, "Juan")

    println(encontrado)
}