/**
 * Exercício 2: O Primeiro Múltiplo Comum
 * Objetivo: Encontrar o primeiro número inteiro positivo divisível simultaneamente por 7 e por 13.
 * Recurso utilizado: Laço infinito 'while (true)' controlado por 'break'.
 */
fun main() {
    // Inicializamos a variável de controle começando em 1, conforme exigido pelo enunciado
    var numero = 1

    println("=== Exercício 2: Buscando o primeiro múltiplo comum de 7 e 13 ===")

    // O laço 'while (true)' executa indefinidamente até encontrar uma condição de parada ('break')
    while (true) {
        // O operador '%' (módulo) retorna o resto da divisão.
        // Se o resto da divisão por 7 for 0 E o resto por 13 também for 0, encontramos o múltiplo comum.
        if (numero % 7 == 0 && numero % 13 == 0) {
            println("Sucesso! O primeiro múltiplo comum encontrado é: $numero")

            // A instrução 'break' encerra imediatamente o laço 'while (true)',
            // impedindo que o programa continue rodando infinitamente.
            break
        }

        // Caso o número atual não atenda à condição, incrementamos em +1 para testar o próximo valor
        numero++
    }
}