//A classe Aluno possuí os atributos id, nome e curso.
//Receba todos os  parâmetros no método construtor e exiba-os em console,
//sem a utilização de  métodos estáticossse Aluno possuí os atributos id, nome e curso.
//Receba todos os  parâmetros no método construtor e exiba-os em console,
//sem a utilização de  métodos estáticos.

class Aluno(id: Int, nomeAluno: String, curso: String) {
    var id: Int
    var nomeAluno: String
    var curso: String

    init {
        this.id = id
        this.nomeAluno = nomeAluno
        this.curso = curso
    }
}

fun main() {
    var aluno1 = Aluno(666, "Jon Snow", "King in the North")
    println("Id: ${aluno1.id}\nNome: ${aluno1.nomeAluno}\nCurso: ${aluno1.curso}\n")
}
                                                        //Saida esperada: //Id: 666
                                                                          //Nome: Jon Snow
                                                                          //Curso: King in the North