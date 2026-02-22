import java.util.Scanner;

public class Desafio2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura que deseja: (NO MÁXIMO 20) " );
        int altura = scanner.nextInt();
        while (altura > 20 || altura < 1) {
            System.out.println("Valor inválido! Digite um número entre 1 e 20: ");
            altura = scanner.nextInt();
        }

        for (int i = 1; i <= 20; i++){
            for (int J = 1; J <= i - 1; J++) {
                System.out.print("  ");
            }
            for (int k = altura; k >= i; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
