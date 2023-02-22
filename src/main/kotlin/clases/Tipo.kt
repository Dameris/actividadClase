package clases

class Tipo(tipoPokemon: String) {
    private var tipoPokemon = tipoPokemon
        set(value) {
            val listaTipos = listOf("Acero", "Agua", "Bicho", "Dragon", "Electrico", "Fantasma", "Fuego", "Hada", "Hielo", "Lucha",
                "Normal", "Planta", "Psiquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador")
            field = if (value !in listaTipos) { throw IllegalArgumentException("El tipo no es válido") }
            else { value }
        }

    init { this.tipoPokemon = tipoPokemon }

    override fun toString(): String {
        return tipoPokemon.uppercase()
    }

    fun efectividad(): String {
        when (tipoPokemon) {
            "Acero" -> {
                return "x2 -> Hada, Hielo y Roca\n" +
                        "x1 -> Normal, Lucha, Volador, Veneno, Tierra, Fantasma, Planta, Psíquico, Dragón y Siniestro\n" +
                        "x0.5 -> Acero, Agua, Eléctrico y Fuego\n" +
                        "x0 -> Ninguno"
            }

            "Agua" -> {
                return "x2 -> Fuego, Roca y Tierra\n" +
                        "x1 -> Acero, Bicho, Eléctrico, Fantasma, Hada, Hielo, Lucha, Normal, Psíquico, Siniestro, Veneno y Volador\n" +
                        "x0.5 -> Agua, Dragón y Planta\n" +
                        "x0 -> Ninguno"
            }

            "Bicho" -> {
                return "x2 -> Planta, Psíquico y Siniestro\n" +
                        "x1 -> Agua, Bicho, Dragón, Eléctrico, Hielo, Normal, Roca y Tierra\n" +
                        "x0.5 -> Acero, Fantasma, Fuego, Hada, Lucha, Veneno y Volador\n" +
                        "x0 -> Ninguno"
            }

            "Dragon" -> {
                return "x2 -> Dragón\n" +
                        "x1 -> Agua, Bicho, Eléctrico, Fantasma, Fuego, Hielo, Lucha, Normal, Planta, Psíquico, Roca, Siniestro, Tierra, Veneno y Volador\n" +
                        "x0.5 -> Acero\n" +
                        "x0 -> Hada"
            }

            "Electrico" -> {
                return "x2 -> Agua y Volador\n" +
                        "x1 -> Acero, Bicho, Fantasma, Fuego, Hada, Hielo, Lucha, Normal, Psíquico, Roca, Siniestro y Veneno\n" +
                        "x0.5 -> Dragón, Eléctrico y Planta\n" +
                        "x0 -> Tierra"
            }

            "Fantasma" -> {
                return "x2 -> Fantasma y Psíquico\n" +
                        "x1 -> Acero, Agua, Bicho, Dragón, Eléctrico, Fuego, Hada, Hielo, Lucha, Planta, Roca, Tierra, Veneno y Volador\n" +
                        "x0.5 -> Siniestro\n" +
                        "x0 -> Normal"
            }

            "Fuego" -> {
                return "x2 -> Acero, Bicho, Hielo y Planta\n" +
                        "x1 -> Eléctrico, Fantasma, Hada, Lucha, Normal, Psíquico, Siniestro, Tierra, Veneno y Volador\n" +
                        "x0.5 -> Agua, Dragón, Fuego y Roca\n" +
                        "x0 -> Ninguno"
            }

            "Hada" -> {
                return "x2 -> Dragón, Lucha y Siniestro\n" +
                        "x1 -> Agua, Bicho, Eléctrico, Fantasma, Hada, Hielo, Normal, Planta, Psíquico, Roca, Tierra y Volador\n" +
                        "x0.5 -> Acero, Fuego y Veneno\n" +
                        "x0 -> Ninguno"
            }

            "Hielo" -> {
                return "x2 -> Dragón, Planta, Tierra y Volador\n" +
                        "x1 -> Bicho, Eléctrico, Fantasma, Hada, Lucha, Normal, Psíquico, Roca, Siniestro y Veneno\n" +
                        "x0.5 -> Acero, Agua, Fuego y Hielo\n" +
                        "x0 -> Ninguno"
            }

            "Lucha" -> {
                return "x2 -> Acero, Hielo, Normal, Roca y Siniestro\n" +
                        "x1 -> Agua, Dragón, Eléctrico, Fuego, Lucha, Planta y Tierra\n" +
                        "x0.5 -> Bicho, Hada, Psíquico, Veneno y Volador\n" +
                        "x0 -> Fantasma"
            }

            "Normal" -> {
                return "x2 -> Ninguno\n" +
                        "x1 -> Agua, Bicho, Dragón, Eléctrico, Fuego, Hada, Hielo, Lucha, Normal, Planta, Psíquico, Siniestro, Tierra, Veneno y Volador\n" +
                        "x0.5 -> Acero y Roca\n" +
                        "x0 -> Fantasma"
            }

            "Planta" -> {
                return "x2 -> Agua, Roca y Tierra\n" +
                        "x1 -> Eléctrico, Fantasma, Hada, Hielo, Lucha, Normal, Psíquico y Siniestro\n" +
                        "x0.5 -> Acero, Bicho, Dragón, Fuego, Planta, Veneno y Volador\n" +
                        "x0 -> Ninguno"
            }

            "Psiquico" -> {
                return "x2 -> Lucha y Veneno\n" +
                        "x1 -> Agua, Bicho, Dragón, Eléctrico, Fantasma, Fuego, Hada, Hielo, Normal, Planta, Roca, Tierra y Volador\n" +
                        "x0.5 -> Acero y Psíquico\n" +
                        "x0 -> Siniestro"
            }

            "Roca" -> {
                return "x2 -> Bicho, Fuego, Hielo y Volador\n" +
                        "x1 -> Agua, Dragón, Eléctrico, Fantasma, Hada, Normal, Planta, Psíquico, Roca, Siniestro y Veneno\n" +
                        "x0.5 -> Acero, Lucha y Tierra\n" +
                        "x0 -> Ninguno"
            }

            "Siniestro" -> {
                return "x2 -> Fantasma y Psíquico\n" +
                        "x1 -> Acero, Agua, Bicho, Dragón, Eléctrico, Fuego, Hielo, Normal, Planta, Roca, Tierra, Veneno y Volador\n" +
                        "x0.5 -> Hada, Lucha y Siniestro\n" +
                        "x0 -> Ninguno"
            }

            "Tierra" -> {
                return "x2 -> Acero, Eléctrico, Fuego, Roca y Veneno\n" +
                        "x1 -> Agua, Dragón, Hada, Hielo, Lucha, Normal, Psíquico, Siniestro, Tierra y Fantasma\n" +
                        "x0.5 -> Bicho y Planta\n" +
                        "x0 -> Volador"
            }

            "Veneno" -> {
                return "x2 -> Hada y Planta\n" +
                        "x1 -> Agua, Bicho, Dragón, Fuego, Hada, Hielo, Lucha, Normal, Psíquico, Siniestro, Volador\n" +
                        "x0.5 -> Fantasma, Roca, Tierra y Veneno\n" +
                        "x0 -> Acero"
            }

            "Volador" -> {
                return "x2 -> Bicho, Lucha y Planta\n" +
                        "x1 -> Agua, Dragón, Fuego, Hada, Hielo, Normal, Psiquico, Siniestro, Tierra, Veneno, Volador y Fantasma\n" +
                        "x0.5 -> Acero, Eléctrico y Roca\n" +
                        "x0 -> Ninguno"
            }
        }
        return tipoPokemon
    }
}