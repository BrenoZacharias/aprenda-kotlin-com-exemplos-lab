data class Formacao(var nome: String, var nivel:Nivel, val conteudos: MutableList<ConteudoEducacional>) {

    val inscritos = mutableMapOf<Int, Usuario>()

    fun matricular(vararg usuarios: Usuario) {
        addInscritos(usuarios.toList())
    }

    fun matricular(usuarios: List<Usuario>) {
        addInscritos(usuarios)
    }

    private fun addInscritos(usuarios: List<Usuario>) {
        for (usuario in usuarios) {
            inscritos.put(usuario.id, usuario)
        }
    }

    override fun toString(): String {
        return "$nome, $nivel, $conteudos, $inscritos"
    }
}