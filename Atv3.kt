fun main() {
    //3
    //Vamos criar uma lista de compras.
    //
    //Crie uma array de frutas, exiba-a ao usuário e, em seguida, peça ao usuário para digitar o nome de uma das frutas.
    //
    //Caso a fruta esteja no array, remova-a e exiba a mensagem "Fruta foi retirada da lista".
    //
    //Peça novamente para o usuário digitar o nome de uma fruta para ser removida.
    //
    //Sempre que o usuário procurar por uma fruta que não está no array exiba a mensagem "Fruta indisponível no nosso mercado".
    //
    //Quando o array não possuir mais itens dentro de si, escreva "Lista de compras finalizada".


    // Cria uma array de frutas
    val frutas = mutableListOf("Maçã", "Banana", "Laranja", "Uva", "Pera", "Manga")

    // Exibe a lista de frutas ao usuário
    println("Lista de compras: ${frutas.joinToString(", ")}")

    while (frutas.isNotEmpty()) {
        // Solicita ao usuário para digitar o nome de uma fruta
        print("Digite o nome de uma fruta para ser removida: ")
        val frutaInformada = readLine()!!

        // Verifica se a fruta está na lista
        if (frutas.contains(frutaInformada)) {
            frutas.remove(frutaInformada)
            println("Fruta foi retirada da lista.")
        } else {
            println("Fruta indisponível no nosso mercado.")
        }

        // Exibe a lista de frutas atualizada
        if (frutas.isNotEmpty()) {
            println("Lista de compras atualizada: ${frutas.joinToString(", ")}")
        } else {
            println("Lista de compras finalizada.")
        }
    }
}
