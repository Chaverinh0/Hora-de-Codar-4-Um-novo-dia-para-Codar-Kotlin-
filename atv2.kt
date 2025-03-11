fun main() {
    //2
    //Crie uma array de planetas que inclua "Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno"  e, em seguida, peça ao usuário para digitar o nome de um planeta.
    //Verifique se o planeta que o usuário informou está na array e informe ao usuário.

    // Cria a array de planetas
    val planetas = arrayOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    // Solicita ao usuário para digitar o nome de um planeta
    print("Digite o nome de um planeta: ")
    val planetaInformado = readLine()!!

    // Verifica se o planeta informado está na array
    if (planetas.contains(planetaInformado)) {
        println("O planeta $planetaInformado está na lista.")
    } else {
        println("O planeta $planetaInformado não está na lista.")
    }
}
