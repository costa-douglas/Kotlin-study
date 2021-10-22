//Crie três classes chamadas, Aluno, Turma e Professor. Na função main, crie um
//atributo chamado obj instanciando uma das classes, valide se o atributo é do tipo da
//Classe Aluno, Turma ou Professor e exiba em console o tipo de dado que ele
//pertence.

class Aluno1 (nome: String, id: Int){
    var nome: String
    var id: Int

    init {
        this.nome = nome
        this.id = id
    }
}

class Turma (curso: String, id: Int){
    var curso: String
    var id: Int

    init {
        this.curso = curso
        this.id = id
    }
}

class Professor (nome: String, id: Int){
    var nome: String
    var id: Int

    init {
        this.nome = nome
        this.id = id
    }
}

fun main(){
    val obj: Any? = Turma("SI", 3)

    if (obj is Turma){
        println("É da classe Turma")
    }
    else if (obj is Aluno1){
        println("É da classe Aluno")
    }
    else if (obj is Professor){
        println("É da classe Professor")
    }
}
                                          //Saida esperada "É da classe Turma"