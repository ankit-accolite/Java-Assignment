package Question1;
import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Values : ");
        int n = sc.nextInt();

        Values obj = new Values();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter Value "+i+" : ");
            int val = sc.nextInt();
            obj.addValues(val);
        }

        System.out.println("Values Before Sorting : ");
        obj.display();

        obj.Sort();
        System.out.println("Values After Sorting : ");
        obj.display();
     }
}
