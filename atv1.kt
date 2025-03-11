fun main() {
    //1
    //Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida, Se o usuário digitar "PARE" o programa deve exibir a quantidade de estudantes cadastrados e a lista com cada um deles.
    val listaEstudantes = mutableListOf<String>()
    var estudante: String

    while (true) {
        print("Digite o nome do estudante (ou 'PARE' para finalizar): ")
        estudante = readLine()!!

        if (estudante.equals("PARE", ignoreCase = true)) {
            break
        }

        listaEstudantes.add(estudante)
    }

    println("\nQuantidade de estudantes cadastrados: ${listaEstudantes.size}")
    println("Lista de estudantes:")

    for (nome in listaEstudantes) {
        println(nome)
    }
}
