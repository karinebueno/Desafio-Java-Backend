package org.example;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        switch(tamanho){
            case(10):
                System.out.println("//////////");
                break;
            case(9):
                System.out.println("/////////");
                break;
            case(8):
                System.out.println("////////");
                break;
            case(7):
                System.out.println("///////");
                break;
            case(6):
                System.out.println("//////");
                break;
            case(5):
                System.out.println("/////");
                break;
            case(4):
                System.out.println("////");
                break;
            case(3):
                System.out.println("///");
                break;
            case(2):
                System.out.println("//");
                break;
            case(1):
                System.out.println("/");
                break;
        }

        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download

    }
}
