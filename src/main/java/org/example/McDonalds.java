package org.example;

import java.util.Scanner;

public class McDonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];

        String[] IngredientesFinal = ingredientes.split(";"); // split the input string into an array of substrings


        System.out.println(IngredientesFinal[0]);
        System.out.println(IngredientesFinal[1]);
        System.out.println(IngredientesFinal[2]);
        System.out.println(IngredientesFinal[3]);



        // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída

    }
}

