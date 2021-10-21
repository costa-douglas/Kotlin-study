//A classe Aluno possuí os atributos id, nome e curso. Receba todos os
//parâmetros no método construtor e exiba-os em console. Adicione um
//companion Object com a mensagem chamando método estático, que deve ser
//acessado sem realizar a instância direta da classe.

class Aluno(id: Int, nome: String, curso: String) {
    var id: Int
    var nome: String
    var curso: String

    init {
        this.id = id
        this.nome = nome
        this.curso = curso
    }

    fun listar_aluno() {
        println("Nome: ${this.nome}\nCurso: ${this.curso}\nId: ${this.id}")
    }
}

fun main() {
    var aluno1 = Aluno(666, "Jon Snow", "King in the North")
    aluno1.listar_aluno()
}
