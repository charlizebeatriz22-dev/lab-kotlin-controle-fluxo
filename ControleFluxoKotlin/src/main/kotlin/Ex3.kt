/**
 * Exercício 3: Somador com Limite de Carga
 * Objetivo: Somar números de 1 a 100 ignorando múltiplos de 10 e parando caso o total ultrapasse 500.
 * Recursos utilizados: Laço 'for', 'continue' (para filtrar múltiplos de 10) e 'break' (limite de carga).
 */
fun main() {
    // Variável acumuladora que armazenará a soma progressiva dos valores válidos
    var total = 0

    println("=== Exercício 3: Somador de 1 a 100 (Ignorando múltiplos de 10 | Limite: 500) ===")

    // Itera sobre o intervalo fechado de 1 até 100
    for (i in 1..100) {
        // Verifica se o número atual 'i' é múltiplo de 10 (ex: 10, 20, 30...)
        if (i % 10 == 0) {
            println("Ignorando múltiplo de 10: $i")
            // Pula para a próxima iteração sem executar a soma abaixo
            continue
        }

        // Soma o número válido ao total acumulado
        total += i
        println("Somado +$i -> Total parcial: $total")

        // Verifica se a carga máxima (500) foi ultrapassada após a soma
        if (total > 500) {
            println("\nALERTA: Limite de 500 ultrapassado ao somar o número $i!")
            println("Valor final acumulado: $total")
            // Aborta imediatamente o laço 'for' antes mesmo de chegar ao 100
            break
        }
    }
}