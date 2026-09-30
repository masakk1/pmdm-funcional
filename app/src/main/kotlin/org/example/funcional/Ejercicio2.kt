package org.example.funcional

fun main() {
    val cadenaContieneCadena: (String, String) -> Boolean = { a, b -> a.contains(b) }

    val buscaCoincidencia: (List<String>, String) -> List<String> = { lista, palabra ->
        lista.filter { cadenaContieneCadena(it, palabra) }
    }

    // ejemplo
    val nombres = listOf("Alvaro", "Aaron", "Juanjo", "Juanjo", "Xusa")
    val encontrado = buscaCoincidencia(nombres, "jo")

    encontrado.forEach { println(it) }
}