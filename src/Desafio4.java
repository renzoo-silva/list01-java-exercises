public class Desafio4 {
    public static void main (String[] args){

        String expression = "soma = 10 + 20";
        String[] parts = expression.split(" ");

        for (int i = 0; i < parts.length; i++){
            switch (parts[i]){
                case "+":
                case "-":
                case "*":
                case "/":
                    System.out.println(parts[i] + " -> Operador");
                    break;
                case "=":
                    System.out.println(parts[i] + " -> Atribuição");
                    break;
                default:
                    if (Character.isDigit(parts[i].charAt(0))){
                        System.out.println(parts[i] + " -> Número");
                    } else {
                        System.out.println(parts[i] + " -> Identificador");
                    }
            }
        }
    }
}
