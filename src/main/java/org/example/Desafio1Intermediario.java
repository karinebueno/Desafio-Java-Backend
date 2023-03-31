package org.example;
import java.util.Scanner;

public class Desafio1Intermediario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();

        String ultimasQuatroLetras = arquivoDoPc.substring(arquivoDoPc.length() - 4);
        if (ultimasQuatroLetras.equals(".mp3")) {
            System.out.println("Salvar");
        } else {
            System.out.println("Deletar");
        }



        // TODO: Crie a condição necessária para verificar o formato do arquivo de entrada

    }
}



