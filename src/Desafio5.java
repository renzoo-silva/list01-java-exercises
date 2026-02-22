import java.sql.SQLOutput;
import java.util.ArrayList;

public class Desafio5 {
    public static void main (String[] args){

        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);

        ArrayList<Integer> B = new ArrayList<>();
        B.add(2);
        B.add(3);
        B.add(4);

        ArrayList<Integer> Union_result = new ArrayList<>();
        ArrayList<Integer> Intersection_result = new ArrayList<>();

        //união
        for (int i = 0; i < A.size(); i++){
            Union_result.add(A.get(i));
        }
        for (int i = 0; i < B.size(); i++) {
            if (!Union_result.contains(B.get(i))){
                Union_result.add(B.get(i));
            }
        }

        System.out.println("A união é: " + Union_result);

        //interseção
        for (int i = 0; i < A.size(); i++){
            if (B.contains(A.get(i))){
                Intersection_result.add(A.get(i));
            }
        }

        System.out.println("A interseção é: " + Intersection_result);
    }
}
