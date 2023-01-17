// Program to take and print all names using array.

import java.util.*;
public class Prob01{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Names:");
        int n= sc.nextInt();
      //Square brackets [ ] · 2. Curly brackets { } · 3. Rounded brackets ( ) · 4. Angle brackets < >.
        String name[]= new String[n];  //Declaration of Array= Datatype nameofarray[] =newkeyword datatype[Size]

        //Input
        System.out.println("Enter All the Names: ");
        for(int i=0; i<n; i++){  //Base index in an Array is always 0;
          name[i]=sc.next();
        }

         //Output
         System.out.println("Entered Names are : ");
         for(int i=0; i<name.length; i++){  //Base index in an Array is always 0;
           System.out.println(name[i]);
         }
    }
}
