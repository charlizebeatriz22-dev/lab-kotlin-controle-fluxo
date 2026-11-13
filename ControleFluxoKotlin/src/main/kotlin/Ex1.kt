/**
 * Exercício 1: O Filtro de Vogais
 * Objetivo: Percorrer a string "Universidade" caractere por caractere e exibir apenas as consoantes.
 * Recurso utilizado: Laço 'for' e instrução de controle 'continue' para saltar as vogais.
 */
fun main() {
    // Declaração da palavra-alvo conforme especificado no enunciado
    val palavra = "Universidade"

    println("=== Exercício 1: Filtrando consoantes da palavra '$palavra' ===")

    // O laço 'for' itera sequencialmente sobre cada caractere (Char) da String
    for (caractere in palavra) {
        // Convertemos o caractere atual para minúsculo apenas para facilitar a comparação,
        // garantindo que a letra 'U' maiúscula no início também seja reconhecida como vogal.
        val letraMinuscula = caractere.lowercaseChar()

        // Verificamos se a letra atual pertence ao conjunto de vogais (a, e, i, o, u)
        if (letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i' || letraMinuscula == 'o' || letraMinuscula == 'u') {
            // A instrução 'continue' interrompe APENAS a iteração atual e força o laço
            // a avançar imediatamente para o próximo caractere, ignorando o 'println' abaixo.
            continue
        }

        // Este trecho só é executado se o 'if' acima for falso (ou seja, se for uma consoante)
        println("Consoante encontrada: $caractere")
    }
}