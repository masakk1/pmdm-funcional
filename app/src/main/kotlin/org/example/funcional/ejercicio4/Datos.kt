package org.example.funcional.ejercicio4

data class Producto(
    val codArticulo: String,
    val descripcion: String,
    val categoria: String,
    val colores: List<String>,
    val dimensiones: Dimensiones,
    val precio: Double
)

class Dimensiones(val largo: Int, val ancho: Int, val espesor: Int) {
    override fun toString(): String = "L:$largo x A:$ancho x E:$espesor"
}

object Datos {
    val productos = listOf(
        Producto(
            codArticulo = "A01",
            descripcion = "Uno",
            categoria = "C1",
            colores = listOf("blanco", "negro", "gris"),
            dimensiones = Dimensiones(
                largo = 4,
                ancho = 4,
                espesor = 3
            ),
            precio = 15.05
        ),

        Producto(
            codArticulo = "A02",
            descripcion = "Dos",
            categoria = "C1",
            colores = listOf("blanco", "gris", "rojo"),
            dimensiones = Dimensiones(

                largo = 4,
                ancho = 10,
                espesor = 2
            ),
            precio = 25.95
        ),
        Producto(
            codArticulo = "A03",
            descripcion = "Tres",
            categoria = "C1",
            colores = listOf("rojo", "gris", "verde"),
            dimensiones = Dimensiones(
                largo = 5,
                ancho = 5,
                espesor = 3
            ),
            precio = 30.25
        ),
        Producto(
            codArticulo = "A04",
            descripcion = "Cuatro",
            categoria = "C2",
            colores = listOf("verde", "rojo"),
            dimensiones = Dimensiones(
                largo = 6,
                ancho = 8,
                espesor = 4
            ),
            precio = 18.45
        )
    )
}

