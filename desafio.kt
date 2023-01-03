fun main() {
    val dio = DIO()

    val user1 = Usuario(1,"Marcos")
    val user2: Usuario = Usuario(2,"Camila")
    val user3 = Usuario(3,"Mara")
    val user4 = Usuario(4,"Cleiton")

    val contEducacional1: ConteudoEducacional = ConteudoEducacional("Fluxo de Controle", Nivel.BASICO)
    val contEducacional2 = ConteudoEducacional("Tratamento de Exceptions", Nivel.INTERMEDIARIO, 45)
    val contEducacional3: ConteudoEducacional = ConteudoEducacional("POO", Nivel.INTERMEDIARIO, 250)
    val contEducacional4 = ConteudoEducacional("Programação Funcional", Nivel.DIFICIL, 200)

    val listaConteudos1 = mutableListOf<ConteudoEducacional>(contEducacional1, contEducacional2)
    val listaConteudos2 = mutableListOf<ConteudoEducacional>(contEducacional3, contEducacional4)

    val formacao1: Formacao = Formacao("Dev Java Junior", Nivel.INTERMEDIARIO, listaConteudos1)
        .also { it.matricular(user1, user2) }

    val formacao2: Formacao = Formacao("Dev Python Junior", Nivel.DIFICIL, listaConteudos2)
        .apply { matricular(user3, user4) }

    dio.addFormacao(formacao1, formacao2)

    println( dio.toString())
}