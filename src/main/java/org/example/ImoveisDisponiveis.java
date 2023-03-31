package org.example;
import jdk.nashorn.internal.objects.NativeMath;

import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];

        String[] words = frase.split("/"); // split the input string into an array of substrings

        String sentence = "Imovel: " + words[0] + " " + "R$" + words[1] + " " + words[2];

        System.out.println(sentence);


    }
}


