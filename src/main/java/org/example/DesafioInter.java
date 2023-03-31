import java.util.Scanner;

public class DesafioInter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (palavra.length() < 4) {
            System.out.println("A palavra deve ter pelo menos quatro letras.");
        } else {
            String ultimasQuatroLetras = palavra.substring(palavra.length() - 4);

            if (ultimasQuatroLetras.equals(".mp3")) {
                System.out.println("Salvar");
            } else {
                System.out.println("Deletar");
            }
        }
    }
}