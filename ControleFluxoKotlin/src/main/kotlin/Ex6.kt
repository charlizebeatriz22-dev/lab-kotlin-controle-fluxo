/**
 * Exercício 6: O Menu Teimoso
 * Objetivo: Simular um menu interativo em loop infinito com tratamento específico para opções 1, 2, 3 e 0.
 * Recursos utilizados: 'while (true)', 'continue' (retorno imediato ao início) e 'break' (saída).
 */
fun main() {
    // Lista simulando as entradas sequenciais de um usuário no sistema.
    // Dica: Caso queira digitar manualmente no console do IntelliJ durante a apresentação,
    // basta substituir a leitura do array por: val opcao = readln().toInt()
    val entradasSimuladas = listOf(1, 3, 2, 3, 0)
    var indice = 0

    println("=== Exercício 6: Sistema de Menu Teimoso ===")

    // Laço infinito mantendo o menu ativo até que a opção de saída (0) seja acionada
    while (true) {
        // Obtém a próxima opção simulada da lista
        val opcao = if (indice < entradasSimuladas.size) entradasSimuladas[indice++] else 0
        println("\n[MENU] Opção selecionada: $opcao")

        if (opcao == 1 || opcao == 2) {
            // Comportamento padrão para opções operacionais 1 e 2
            println("Processando...")
        } else if (opcao == 3) {
            // Opção em manutenção: exibe o aviso e reinicia o ciclo do menu instantaneamente
            println("Módulo em manutenção")
            // O 'continue' salta qualquer código que viesse abaixo no laço e volta ao topo do 'while'
            continue
        } else if (opcao == 0) {
            // Opção de encerramento: sai do laço infinito com 'break'
            println("Encerrando o sistema. Até logo!")
            break
        } else {
            println("Opção inválida! Tente novamente.")
        }
    }
}