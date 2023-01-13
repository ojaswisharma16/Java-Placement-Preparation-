// Print All Even Numbers till n.
import java.util.*;
public class PrintEven{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Value of n:");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i % 2==0)
            System.out.println(i);
        }
    }
}