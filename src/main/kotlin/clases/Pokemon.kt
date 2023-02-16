package clases

class Pokemon(id: Int, nombre: String, vida: Int, tipo: String) {

    var id: Int = 0
        set(value){
            if(value <= 0){
                throw Exception("El Id no puede ser menor que 0")
            }
            field = value
        }

    var nombre: String = ""

    var vida: Int = 0

    var tipo: String = ""

    init {
        this.id = id;
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo
    }

    override fun toString(): String {
        return "Hola mi nombre es $nombre, tengo $vida de vida y soy de tipo $tipo"
    }
}