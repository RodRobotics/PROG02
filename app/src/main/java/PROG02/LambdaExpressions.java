package PROG02;
import java.util.ArrayList; // import the ArrayList class
public class LambdaExpressions {


    public void lambdaExpressionOne(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> { System.out.println(n); } );
    }











}