package org.example;

import java.util.Scanner;

public class Camarote {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

       double Pessoasnocamarote = tamanhoDaFila / 2.0;
        System.out.println((int)Math.ceil(Pessoasnocamarote) + " " +"pessoas no camarote");




        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.

    }
}
