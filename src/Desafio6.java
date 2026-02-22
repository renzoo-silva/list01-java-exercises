import java.util.Scanner;

public class Desafio6 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        String password = "1-2-3";
        int state = 0;

        System.out.println("Digite o primeiro digito da senha: ");
        String password_entered = scanner.nextLine();

        for(int i = 0; i < password_entered.length(); i++){
            char c = password_entered.charAt(i);
            switch (c){
                case '1':
                    if (state == 0){
                        state = 1;
                    } else {
                        state = 0;
                    }
                    break;
                case '2':
                    if (state == 1){
                        state = 2;
                    } else {
                        state = 0;
                    }
                    break;
                case '3':
                    if (state == 2){
                        state = 3;
                    } else {
                        state = 0;
                    }
                    break;
                default:
                    state = 0;
                    break;
            }
        }

        if (state == 3){
            System.out.println("ACESSO CONCEDIDO!");
        } else {
            System.out.println("ACESSO NEGADO!");
        }
    }
}
