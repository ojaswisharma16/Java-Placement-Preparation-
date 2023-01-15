// Program to Check if the Inserted Noumber is Prime or Not.
import java.util.*;
public class CheckPrime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        int count=0;

        for(int i=2; i<n; i++){
            if(n%i==0)
            count=count+1;
            break;
        }
        if(count==0)
        System.out.println("It is a Prime Number.");
        else
        System.out.println("It is NOT a Prime Number");
    }
}