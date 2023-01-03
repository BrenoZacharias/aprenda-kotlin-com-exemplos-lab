package model

class DIO() {
    val formacoes: MutableSet<Formacao> = mutableSetOf()

    fun addFormacao(vararg formacao: Formacao) = formacoes.addAll(formacao)

    fun addFormacoes(formacoes: List<Formacao>) = this.formacoes.addAll(formacoes)

    override fun toString(): String {
        var description: String = "model.DIO"
        for (formacao in formacoes){
            description+="\n" + formacao
        }
        return description
    }
}

