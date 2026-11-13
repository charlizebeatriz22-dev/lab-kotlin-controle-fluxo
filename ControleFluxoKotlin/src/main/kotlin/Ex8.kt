/**
 * Exercício 8: Cofre com Bloqueio Progressivo
 * Objetivo: Controlar até 5 tentativas de acesso por senha, bloqueando o sistema definitivamente
 *           caso o usuário erre pela 3ª vez.
 * Recursos utilizados: Laço 'for' limitado (1..5), condicionais encadeadas e interrupção precoce com 'break'.
 */
fun main() {
    // Senha cadastrada no cofre
    val senhaCorreta = "KOTLIN2026"

    // Simulação de tentativas de senha feitas pelo usuário (3 erros consecutivos para demonstrar o bloqueio)
    // Para testar o acesso concedido, basta colocar "KOTLIN2026" na 1ª ou 2ª posição do array.
    val tentativasUsuario = arrayOf("123456", "admin123", "senhaerrada", "KOTLIN2026", "0000")

    println("=== Exercício 8: Sistema de Segurança do Cofre ===")

    // O laço 'for' concede no máximo 5 chances ao usuário
    for (tentativa in 1..5) {
        val senhaDigitada = tentativasUsuario[tentativa - 1]
        println("\nTentativa $tentativa de 5 | Senha inserida: '$senhaDigitada'")

        // Verifica se a senha fornecida coincide com a senha correta
        if (senhaDigitada == senhaCorreta) {
            println("Acesso concedido! Cofre aberto.")
            // Encerra o laço imediatamente, pois o objetivo foi atingido
            break
        } else {
            // Caso a senha esteja incorreta, notifica o usuário
            println("Aviso: Senha incorreta!")

            // Regra de segurança: ao atingir a 3ª falha, o sistema bloqueia antes das tentativas 4 e 5
            if (tentativa == 3) {
                println("ALERTA DE SEGURANÇA: Cofre travado administrativamente")
                // Interrompe o laço 'for' imediatamente, impedindo as 2 tentativas restantes
                break
            }
        }
    }
}