/*Program to Check if an array is Sorted in ascending order or not.

ex. array= 3,5,4,6
5>3
YES =1;
4>5
NO=1
6>4
YES=2;
(IF any how value of no is more than zero than it is not sorted.)

*/

import java.util.*;
import java.util.concurrent.CountDownLatch;
public class Prob04 {
    public static void main(String[] args)
    {Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Size of Array: ");

    int n=sc.nextInt();
    
      int yes=0;
      int no=0;
    int Array[]= new int[n];

    //Input
    System.out.println("Enter the Values : ");
    for(int i=0; i<n; i++){
      Array[i]=sc.nextInt();
    }

    //Check Ascending---->Increasing Order ex.{1,2,3,4....}
    for(int i=1; i<n; i++){
        if(Array[i]>Array[i-1])
        yes++;
        else
        no++;
       
      }

      if(no==0)
      System.out.println("Sorted in Ascending Order.");
      else
      System.out.println("NOT Sorted in Ascending Order.");
      
      
     





    }
}
