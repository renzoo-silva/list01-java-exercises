import java.util.Scanner;
import java.util.Stack;

public class Desafio3 {

    private static char parEsperado(char fechamento) {
        if (fechamento == ')') return '(';
        if (fechamento == ']') return '[';
        return '{';
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();

        System.out.println("Digite a expressão: ");
        String expressions = scanner.nextLine();

        boolean valido = true;

        for(int i = 0; i < expressions.length(); i++){
            char c = expressions.charAt(i);

            if(c == '(' || c == '[' || c == '{'){
                pilha.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if(pilha.isEmpty()){
                    System.out.println("ERRO! Abertura da expressão sem fechamento correspondente!");
                    valido = false;
                } else if(pilha.peek() != parEsperado(c)){
                    System.out.println("ERRO! Fechamento da expressão incorreto!");
                    valido = false;
                } else {
                    pilha.pop();
                }
            }
        }

        if (valido && pilha.isEmpty()){
            System.out.println("PERFEITO! Essa expressão está correta!");
        } else {
            System.out.println("OPS! A expressão é inválida, verifique se as aberturas foram devidamente fechadas com seus respectivos fechamentos.");
        }
    }
}
