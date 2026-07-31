package Utilitarios;

/**
 * Guarda, de forma compartilhada por toda a aplicação, se a última janela
 * usada pelo usuário estava maximizada ou em modo janela.
 *
 * Como cada tela é um novo JFrame (criado via "new Tela()"), sem essa
 * classe cada tela nova nasceria sempre no mesmo estado padrão. Com esse
 * valor estático, cada tela nova consulta o último estado conhecido e o
 * reaplica, dando a sensação de que a janela "lembra" o que o usuário
 * estava fazendo ao navegar entre as telas.
 *
 * @author guto4
 */
public class EstadoJanela {

    /**
     * true = a última janela usada estava maximizada.
     * false = a última janela usada estava em modo janela (tamanho normal).
     * Começa em false para a primeira tela que o sistema abrir.
     */
    public static boolean maximizada = false;
}
