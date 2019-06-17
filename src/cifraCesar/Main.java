package cifraCesar;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();


        Map<Integer, String> alfabeto = new HashMap<Integer, String>();

        alfabeto.put(1, "a");
        alfabeto.put(2, "b");
        alfabeto.put(3, "c");
        alfabeto.put(4, "d");
        alfabeto.put(5, "e");
        alfabeto.put(6, "f");
        alfabeto.put(7, "g");
        alfabeto.put(8, "h");
        alfabeto.put(9, "i");
        alfabeto.put(10, "j");
        alfabeto.put(11, "k");
        alfabeto.put(12, "l");
        alfabeto.put(13, "m");
        alfabeto.put(14, "n");
        alfabeto.put(15, "o");
        alfabeto.put(16, "p");
        alfabeto.put(17, "q");
        alfabeto.put(18, "r");
        alfabeto.put(19, "s");
        alfabeto.put(20, "t");
        alfabeto.put(21, "u");
        alfabeto.put(22, "v");
        alfabeto.put(23, "w");
        alfabeto.put(24, "x");
        alfabeto.put(25, "y");
        alfabeto.put(26, "z");


        Scanner leia = new Scanner(System.in);
        System.out.println("Insira valor para K, sendo K > 0");
        int k = leia.nextInt();

        System.out.println("=========================== NÃO COLOQUE CARACTERES ESPECIAIS E NEM LETRAS MAIÚSCULAS. ===========================");
        System.out.println("======================================= SOMENTE LETRA MINÚSCULA!!!!!!!!!!!!!! ==================================");
        System.out.println("Insira a palavra para ser criptografada.");
        String palavra = leia.next();

        String[] letra = null;


        StringBuilder palavraCriptografada= new StringBuilder();
        StringBuilder palavraDesCriptografada= new StringBuilder();

        for (int i=0;  i< palavra.length();i++) {
            letra = palavra.split("");
            palavraCriptografada.append(main.criptografarPalavra(alfabeto, letra[i], k));
        }
        System.out.print("Palavra Criptografada: ");
        System.out.println(palavraCriptografada);

        letra =null;

        int qtdLetraPalvra = palavraCriptografada.length();

        for (int i=0;  i< qtdLetraPalvra;i++) {
            letra = palavraCriptografada.toString().split("");
            palavraDesCriptografada.append(main.desCriptografarPalavra(alfabeto, letra[i], k));
        }

        System.out.print("Palavra Descriptografada: ");
        System.out.println(palavraDesCriptografada);
    }


    private String criptografarPalavra(Map<Integer, String> alfabeto, String letra, int k) {

        for (int key : alfabeto.keySet()) {

            if(alfabeto.get(key).equals(letra) && key + k  <= 26) {
                return alfabeto.get(key + k);
            } else if (key + k > 26) {
                return alfabeto.get((key + k) -26);

            }

        }
        return null;
    }

    private String desCriptografarPalavra(Map<Integer, String> alfabeto, String letra, int k) {

        for (int key : alfabeto.keySet()) {
            if(alfabeto.get(key).equals(letra) && key - k > 0) {
                return alfabeto.get(key - k);
            }
        }

        for (int key : alfabeto.keySet()) {
            if (key - k <= 0) {
                return alfabeto.get((key - k) + 28);
            }
        }
        return null;
    }
}
