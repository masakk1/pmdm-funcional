package org.example.funcional.ejercicio4

fun main() {
    val separadorConsulta = "\n".padEnd(80, '_')

    println(separadorConsulta)
    println(
        "Consulta 1: Usando las funciones filter y map.\n" +
                "Mostrar CodArticulo, Descripcion y Precio .\n" +
                "de productos con Precio entre 10 y 30 euros\n"
    )

    val consulta1 = Datos.productos
        .filter { it.precio in 10.0..30.0 }
        .map { "${it.codArticulo} ${it.descripcion} ${it.precio}" }
    println(consulta1.joinToString(separator = "\n"))

    println(separadorConsulta)
    println(
        "Consulta 2: Usando las funciones map, sortedByDescending y take.\n" +
                "Muestra CodArticulo, Descripcion y Precio de los 3 productos.\n" +
                "más caros (ordenando por Precio descendente)\n"
    )
    val consulta2 = Datos.productos
        .sortedByDescending { it.precio }
        .take(3)
        .map { "${it.codArticulo} ${it.descripcion} ${it.precio}" }
    println(consulta2.joinToString(separator = "\n"))

    println(separadorConsulta)
    println(
        "Consulta 3: Usando las funciones groupBy, map, sortedByDescending y last.\n" +
                "Muestra el precio más barato por categoría\n"
    )
    val consulta3 = Datos.productos
        .groupBy { it.categoria }
        .map { g -> "${g.key} ${g.value.minByOrNull { it.precio }?.precio ?: 0}" }
    println(consulta3.joinToString(separator = "\n"))

    println(separadorConsulta)
    println(
        "Consulta 4: Usando las funciones groupBy y map.\n" +
                "¿Cuántos productos hay de cada categoría?\n"
    )
    val consulta4 = Datos.productos
        .groupBy { it.categoria }
        .map { g -> "${g.key} ${g.value.size}" }

    println(consulta4.joinToString(separator = "\n"))

    println(separadorConsulta)
    println(
        "Consulta 5: Usando las funciones groupBy, map y filter\n" +
                "Mostrar las categorías que tengan más de 2 productos\n"
    )
    val consulta5 = Datos.productos
        .groupBy { it.categoria }
        .filter { it.value.size > 2 }
        .map { it.key }

    println(consulta5.joinToString(separator = "\n"))

    println(separadorConsulta)
    println(
        "Consulta 6: Usando la función map\n" +
                "Mostrar CodArticulo, Descripcion, Precio y Descuento redondeado a 2 decimales,\n" +
                "siendo Descuento el 10% del Precio\n"
    )
    val consulta6 = Datos.productos
        .map { "%s %s %f %.2f".format(it.codArticulo, it.descripcion, it.precio, it.precio * 0.9) }
    println(consulta6.joinToString(separator = "\n"))

    println(separadorConsulta)
    println(
        "Consulta 7: Usando las funciones filter, contains y map.\n" +
                "Mostrar CodArticulo, Descripcion y Colores\n" +
                "de los productos de color verde o rojo\n" +
                "(es decir, que contengan alguno de los dos)\n"
    )
    val consulta7 = Datos.productos
        .filter { it.colores.contains("verde") || it.colores.contains("rojo") }
        .map { "${it.codArticulo} ${it.descripcion} ${it.colores.joinToString("-")}" }
    println(consulta7.joinToString(separator = "\n"))

    println(separadorConsulta)
    println(
        "Consulta 8: Usando las funciones filter y map.\n" +
                "Mostrar CodArticulo, Descripcion y Colores.\n" +
                "de los productos que se fabrican en tres Colores\n"
    )
    val consulta8 = Datos.productos
        .filter { it.colores.size == 3 }
        .map { "${it.codArticulo} ${it.descripcion} ${it.colores.joinToString("-")}" }
    println(consulta8.joinToString(separator = "\n"))

    println(separadorConsulta)
    println(
        "Consulta 9: Usando las funciones filter, map.\n" +
                "Mostrar CodArticulo, Descripcion y Dimensiones\n" +
                "de los productos con espesor de 3 cm\n"
    )
    val consulta9 = Datos.productos
        .filter { it.dimensiones.espesor == 3 }
        .map { "${it.codArticulo} ${it.descripcion} ${it.dimensiones}" }
        println(consulta9.joinToString(separator = "\n"))

    println(separadorConsulta)
    println(
        "Consulta 10: Usando las funciones flatMap, distinct y sortedBy.\n" +
                "Mostrar los colores de productos ordenados y sin repeticiones\n"
    )

    val consulta10 = Datos.productos
        .flatMap { it.colores }
        .distinct()
        .sorted()
        println(consulta10.joinToString(separator = "\n"))

    println(separadorConsulta)

}
