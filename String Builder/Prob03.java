//Program to find combined lenght.
import java.util.*;
public class Prob03 {
    public static void main(String[] args){
        StringBuilder sb= new StringBuilder("Ritu");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students exept ritu: ");
        int n=sc.nextInt();

        String names[]=new String[n];
        System.out.println("Enter All names:");
        System.out.println(sb);

        for(int i=0; i<n; i++){
            names[i]=sc.next();
        }

        System.out.println("You have Names : ");
        System.out.println(sb);

        for(int i=0; i<n; i++){
           System.out.println(names[i]);
        }

        //combining
        for(int i=0; i<n; i++){
            sb.append(names[i]);
        }

        System.out.println("Combined length is: "+ sb.length());

    }
    
}
