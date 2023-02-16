package clases

class Ataque(nombre: String, tipo: Tipo, fuerza: Int) {

    var nombre: String = nombre

    var tipo: String = tipo.toString()

    var fuerza: Int = fuerza
        set(value) {
            if(value < 0) throw Exception("La fuerza no puede ser negativa")
            field = value
        }


    init {
        this.nombre = nombre
        this.tipo = tipo.toString()
        this.fuerza = fuerza
    }

    // RAMAS

}