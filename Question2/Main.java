package Question2;
import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator obj  = new Calculator();
        System.out.println("Enter Value 1 : ");
        int val1 = sc.nextInt();
     
        System.out.println("Enter Value 2 : ");
        int val2 = sc.nextInt();

        int ans = obj.sum(val1,val2);
        System.out.println("Addition : "+ans);

        try{
            ans = obj.multiply(val1,val2);
            System.out.println("Muliplication : "+ans);

            ans = obj.multiply(val1,0);
            System.out.println("Muliplication : "+ans);
            
            float result = obj.division(val1,val2);
            System.out.println("Division : "+result);

            result = obj.division(0,val2);
            System.out.println("Division : "+result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
