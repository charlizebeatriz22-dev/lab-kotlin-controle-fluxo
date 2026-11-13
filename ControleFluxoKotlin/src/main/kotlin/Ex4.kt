/**
 * Exercício 4: Simulador de Caixa Eletrônico
 * Objetivo: Realizar saques sucessivos de R$ 150,00 a partir de R$ 1000,00 até o saldo se tornar insuficiente.
 * Recurso utilizado: Laço infinito 'while (true)' e encerramento condicional com 'break'.
 */
fun main() {
    // Saldo inicial disponível na conta
    var saldo = 1000.0
    // Valor fixo de cada tentativa de saque
    val valorSaque = 150.0
    var contadorSaques = 0

    println("=== Exercício 4: Simulador de Caixa Eletrônico ===")
    println("Saldo inicial: R$ $saldo\n")

    // Laço infinito simulando operações contínuas no terminal bancário
    while (true) {
        // Verifica se o saldo atual cobre o valor solicitado para o saque
        if (saldo >= valorSaque) {
            // Deduz o valor do saque do saldo existente
            saldo -= valorSaque
            contadorSaques++
            println("Saque #$contadorSaques de R$ $valorSaque aprovado! Saldo restante: R$ $saldo")
        } else {
            // Se o saldo restante (ex: R$ 100,00) for menor que R$ 150,00, entra neste bloco
            println("\nTentativa de saque de R$ $valorSaque negada (Saldo atual: R$ $saldo).")
            println("Saldo Insuficiente")

            // Encerra o loop infinito de tentativas de saque imediatamente
            break
        }
    }
}