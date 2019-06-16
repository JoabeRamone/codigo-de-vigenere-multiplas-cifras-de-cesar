package multiCifraDeCezar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CrifraDeCesar crifraDeCesar = new CrifraDeCesar();
        Scanner leia = new Scanner(System.in);
        System.out.println("=========================== NÃO COLOQUE CARACTERES ESPECIAIS E NEM LETRAS MAIÚSCULAS. ===========================");
        System.out.println("======================================= SOMENTE LETRA MINÚSCULA!!!!!!!!!!!!!! ==================================");
        System.out.print("Insira a chave para Criptografar: ");
        String chave = leia.next();

        System.out.print("Insira a palavra a ser Criptograda: ");
        String palavra = leia.next();

        String palavraCriptografada = crifraDeCesar.criptografar(palavra, chave);

        System.out.println("Palavra Criptografada: " + palavraCriptografada);

        String palavraDescriptografada = crifraDeCesar.DesCriptografar(palavraCriptografada, chave);

        System.out.println("Palavra Desriptografada: " + palavraDescriptografada);

    }
}
