package Utilitarios;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

/**
 * Cache estático e compartilhado por toda a aplicação.
 * Garante que cada imagem (ex: "/Imagem/Odontologia Temporaria.png")
 * seja lida e decodificada do disco/jar apenas UMA vez durante toda a
 * execução do programa, independente de quantas telas diferentes a
 * utilizem ou quantas vezes o usuário alterne entre elas.
 *
 * @author guto4
 */
public class CacheDeImagens {

    private static final Map<String, Image> cache = new HashMap<>();

    /**
     * Retorna a imagem original (sem redimensionar) referente ao caminho
     * informado, carregando-a do disco/jar apenas na primeira vez em que
     * for solicitada.
     *
     * @param caminho caminho do recurso, ex: "/Imagem/Odontologia Temporaria.png"
     * @return a imagem original em cache
     */
    public static Image obter(String caminho) {
        return cache.computeIfAbsent(
                caminho,
                c -> new ImageIcon(CacheDeImagens.class.getResource(c)).getImage()
        );
    }
}
