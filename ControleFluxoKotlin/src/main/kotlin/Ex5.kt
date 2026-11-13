/**
 * Exercício 5: Detecção de Números Primos
 * Objetivo: Verificar se um número alvo é primo testando divisores de 2 até (alvo - 1).
 * Recurso utilizado: Flag booleana 'ehPrimo' e otimização de performance com 'break'.
 */
fun main() {
    // Número escolhido para verificação (teste também com valores compostos como 28 ou 15)
    val alvo = 29

    // Partimos da premissa de que o número é primo até que se prove o contrário
    var ehPrimo = true

    println("=== Exercício 5: Verificador de Número Primo (Alvo: $alvo) ===")

    // Números menores que 2 não são primos por definição matemática
    if (alvo < 2) {
        ehPrimo = false
    } else {
        // O intervalo '2 until alvo' gera números de 2 até (alvo - 1), excluindo o próprio alvo
        for (divisor in 2 until alvo) {
            // Se o resto da divisão do alvo pelo divisor atual for zero, ele possui um divisor exato
            if (alvo % divisor == 0) {
                println("Divisor encontrado: $alvo é divisível por $divisor.")
                // Alteramos a variável de controle para falso
                ehPrimo = false
                // Acionamos 'break' imediatamente: como já sabemos que não é primo,
                // não há necessidade de desperdiçar processamento testando os números restantes.
                break
            }
        }
    }

    // Exibe o diagnóstico final com base no estado da variável 'ehPrimo'
    if (ehPrimo) {
        println("Resultado: O número $alvo É PRIMO.")
    } else {
        println("Resultado: O número $alvo NÃO É PRIMO.")
    }
}