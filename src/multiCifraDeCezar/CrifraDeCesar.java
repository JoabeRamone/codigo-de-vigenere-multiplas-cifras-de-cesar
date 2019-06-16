package multiCifraDeCezar;

import java.util.HashMap;
import java.util.Map;

public class CrifraDeCesar {
     private static final char multiCifraDeCesar[][] = {
            {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'},
            {'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a'},
            {'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b'},
            {'d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c'},
            {'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd'},
            {'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e'},
            {'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f'},
            {'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g'},
            {'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'},
            {'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'},
            {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'},
            {'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'},
            {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'},
            {'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'},
            {'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'},
            {'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o'},
            {'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'},
            {'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q'},
            {'s', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r'},
            {'t', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's'},
            {'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't'},
            {'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'},
            {'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v'},
            {'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w'},
            {'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x'},
            {'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y'}};

     private static final Map<Integer, Character> alfabeto = new HashMap<Integer, Character>();

     public CrifraDeCesar() {
         alfabeto.put(0, 'a');
         alfabeto.put(1, 'b');
         alfabeto.put(2, 'c');
         alfabeto.put(3, 'd');
         alfabeto.put(4, 'e');
         alfabeto.put(5, 'f');
         alfabeto.put(6, 'g');
         alfabeto.put(7, 'h');
         alfabeto.put(8, 'i');
         alfabeto.put(9, 'j');
         alfabeto.put(10, 'k');
         alfabeto.put(11, 'l');
         alfabeto.put(12, 'm');
         alfabeto.put(13, 'n');
         alfabeto.put(14, 'o');
         alfabeto.put(15, 'p');
         alfabeto.put(16, 'q');
         alfabeto.put(17, 'r');
         alfabeto.put(18, 's');
         alfabeto.put(19, 't');
         alfabeto.put(20, 'u');
         alfabeto.put(21, 'v');
         alfabeto.put(22, 'w');
         alfabeto.put(23, 'x');
         alfabeto.put(24, 'y');
         alfabeto.put(25, 'z');
     }


    public String DesCriptografar(String palavraCriptografada, String chave) {
        CrifraDeCesar crifraDeCesar = new CrifraDeCesar();
        int linha = -1;
        int quantidaDeLetraDaChave = 0;
        StringBuilder palavraDescriptografada = new StringBuilder();

        for (int posicaoDaLetraDaPalavraCriptografda = 0;
             posicaoDaLetraDaPalavraCriptografda < palavraCriptografada.length();
             posicaoDaLetraDaPalavraCriptografda++) {

            if (quantidaDeLetraDaChave < chave.length()) {
                linha = crifraDeCesar.buscarPorLetraNoAlfabeto(chave.charAt(quantidaDeLetraDaChave));
            } else {
                quantidaDeLetraDaChave = 0;
                linha = crifraDeCesar.buscarPorLetraNoAlfabeto(chave.charAt(quantidaDeLetraDaChave));
            }
            for (int coluna = 0; coluna < 26; coluna++) {
                if (multiCifraDeCesar[coluna][linha] ==
                        palavraCriptografada.charAt(posicaoDaLetraDaPalavraCriptografda)) {
                    palavraDescriptografada.append(crifraDeCesar.buscarPorNumeroNoAlfabeto(coluna));
                }
            }
            quantidaDeLetraDaChave++;
        }
        return palavraDescriptografada.toString();
    }

    public String criptografar(String palavra, String chave) {
        CrifraDeCesar crifraDeCesar = new CrifraDeCesar();
        int coluna;
        int linha;
        int quantidaDeLetraDaChave = 0;
        StringBuilder palavraCriptografada = new StringBuilder();
        for (int quantidadeDeLetraDaPalavra = 0; quantidadeDeLetraDaPalavra < palavra.length(); quantidadeDeLetraDaPalavra++) {
            coluna = crifraDeCesar.buscarPorLetraNoAlfabeto(palavra.charAt(quantidadeDeLetraDaPalavra));

            if (quantidaDeLetraDaChave < chave.length()) {
                linha = crifraDeCesar.buscarPorLetraNoAlfabeto(chave.charAt(quantidaDeLetraDaChave));
            } else {
                quantidaDeLetraDaChave = 0;
                linha = crifraDeCesar.buscarPorLetraNoAlfabeto(chave.charAt(quantidaDeLetraDaChave));
            }
            quantidaDeLetraDaChave++;
            palavraCriptografada.append(multiCifraDeCesar[coluna][linha]);
        }
        return palavraCriptografada.toString();
    }

    private int buscarPorLetraNoAlfabeto(char palavra) {
        for (int contador : alfabeto.keySet()) {
            if (alfabeto.get(contador).equals(palavra)) {
                return contador;
            }
        }
        return -1;
    }

    private char buscarPorNumeroNoAlfabeto(int letraKey) {
        return alfabeto.get(letraKey);
    }

    public void imprimirMatriz(char matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            char[] aMatriz = matriz[i];
            for (int linha = 0; linha < aMatriz.length; linha++) {
                System.out.print(aMatriz[linha] + "|");
            }
            System.out.println();

        }
    }
}
