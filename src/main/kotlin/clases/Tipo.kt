package clases

class Tipo(tipoPokemon: String) {
    private var tipoPokemon = tipoPokemon
        set(value) {
            val listaTipos = listOf("acero", "agua", "bicho", "dragon", "electrico", "fantasma", "fuego", "hada", "hielo", "lucha",
                "normal", "planta", "psiquico", "roca", "siniestro", "tierra", "veneno", "volador")
            field = if (value !in listaTipos) { throw IllegalArgumentException("El tipo no es válido") }
            else { value }
        }

    init { this.tipoPokemon = tipoPokemon }
}