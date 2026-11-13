/**
 * Exercício 7: Pula-Obstáculos Numérico
 * Objetivo: Imprimir os números de 1 a 50, omitindo todos aqueles que terminam com o dígito 7.
 * Recurso utilizado: Aritmética modular (numero % 10 == 7) combinada com 'continue'.
 */
fun main() {
    println("=== Exercício 7: Contagem de 1 a 50 (Pulando números terminados em 7) ===")

    // Percorre todos os inteiros de 1 até 50
    for (numero in 1..50) {
        // Ao dividir qualquer número inteiro por 10, o resto da divisão ('%') corresponde
        // exatamente ao seu último dígito (unidade). Ex: 7 % 10 = 7; 17 % 10 = 7; 27 % 10 = 7.
        if (numero % 10 == 7) {
            // Ignora o número terminado em 7 e avança diretamente para a próxima iteração
            continue
        }

        // Imprime apenas os números que não foram barrados pela condicional acima
        print("$numero ")
    }
    println() // Quebra de linha final para organização da saída no console
}