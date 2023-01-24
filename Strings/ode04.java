//Program to find  Combined lenght of all strings from a string array.
import java.util.*;
public class ode04 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:");
        int size=sc.nextInt();

        String Array[]= new String[size];

        //Input
        System.out.println("Enter the Elements(Names) : ");
        for(int i=0; i<size; i++){
            Array[i]=sc.next();
        }

        //Calculating lenght
        int totalLenght=0;
        for(int i=0; i<size; i++){
            totalLenght=totalLenght+ Array[i].length();
        }

        //Output
        System.out.println("Combined lenght of all strings is: "+ totalLenght);

    }

    
}
