package org.example;
import java.util.Scanner;

public class PontosNaCarteira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();

        if (velocidade > 80) {
            registrarMulta();
            multas++;
            //System.out.println(multas + " multas. Nao levou pontos na carteira");
        }
        if (multas == 1) {

            System.out.println(multas + " multas. Nao levou pontos na carteira");

        }
        if (multas == 2) {
            System.out.println(multas + " multas. Nao levou pontos na carteira");
        }

        if (multas >= 3){
            System.out.println(multas + " multas. Levou pontos na carteira");
        }


        // TODO: Crie a condição necessária para verificar se os carros estão acima da velocidade

        // TODO2: Crie a condição para verificar se os motoristas receberão ou não pontos na carteira de habilitação

    }

    private static void registrarMulta() {
        // Código para registrar a multa no banco de dados
        // Nesse exemplo, estamos apenas imprimindo uma mensagem para fins de ilustração
        //System.out.println("Multa registrada.");
    }
}