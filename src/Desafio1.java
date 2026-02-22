//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura que deseja: (NO MÁXIMO 20) " );
        int altura = scanner.nextInt();
        while (altura > 20 || altura < 1) {
            System.out.println("Valor inválido! Digite um número entre 1 e 20: ");
            altura = scanner.nextInt();
        }

        for (int i = 1; i <= altura; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}