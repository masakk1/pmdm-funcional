package org.example.funcional

fun main() {
    val predicadoIgualdad: (String, String) -> Boolean = { a, b -> a == b }

    val buscaCoincidencia: (List<String>, String) -> List<String> = { lista, palabra ->
        lista.filter { predicadoIgualdad(it, palabra) }
    }

    // ejemplo
    val nombres = listOf("Ana", "Juan", "Pedro")
    val encontrado = buscaCoincidencia(nombres, "Juan")

    println(encontrado)
}