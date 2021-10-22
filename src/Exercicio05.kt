//Com base na resolução do exercício 4, se o atributo informado for do tipo Aluno,
//instancie o objeto com o tipo da Classe Turma. Ao final, apresente o último tipo do
//objeto instanciado.

class AlunoX(nome: String, id: Int){
    var nome: String
    var id: Int

    init {
        this.nome = nome
        this.id = id
    }
}

class TurmaX(curso: String, id: Int){
    var curso: String
    var id: Int

    init {
        this.curso = curso
        this.id = id
    }
}

class ProfessorX(nome: String, id: Int){
    var nome: String
    var id: Int

    init {
        this.nome = nome
        this.id = id
    }
}

fun main() {
    val obj: Any? = AlunoX("SI", 3)

    if (obj is TurmaX){
        println("É da classe Turma")
    }
    else if (obj is AlunoX){
        val objrevisa: Any? = TurmaX(obj.nome, obj.id)
        if (objrevisa is TurmaX){
            println("É da classe Turma")
        }
        else{println("É da classe Aluno")}
    }
    else if (obj is ProfessorX){
        println("É da classe Professor")
    }
}
                                            //Saida esperada "É da classe Turma"