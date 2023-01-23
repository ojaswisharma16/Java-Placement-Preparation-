/* Program to Sort an Array using Selection Sort 

**Selection Sorting= Repeatedly selecting the smallest
 (or largest) element from the unsorted portion of the list 
 and moving it to the sorted portion of the list.

 ex. 2 3 1 45 15
 1.  (2) 3 1 45 15    ---> min-index=0   , aar[1]to aar[n]<a[0]----> temp=ar[0], a[0]=aar[i], arr[i]=temp;
      1 3 (2) 45 15

 2.  1 (3) 2 45 15   

3. 1  2 (3) 45 15
   1  2 (3) 45 15

4. 1  2 3 (45) 15
  1  2 3  15 (45)------> Sorted by Selection sort

*/

import java.util.*;
public class Prob19 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Elements: ");
        int n=sc.nextInt();

        int Array[]=new int[n];
        int min_index, temp;

        //Input
        System.out.println("Enter the Elements :");
        for(int i=0; i<n; i++){
            Array[i]=sc.nextInt();
        }

        System.out.println("Original Array is:");
         for(int i=0; i<n; i++){
            System.out.print(Array[i]+" ");
          }
          System.out.println();

        //Sorting ---->  min-index=0   , aar[1]to aar[n]<a[0]----> temp=ar[0], a[0]=aar[i], arr[i]=temp;
        for(int i=0; i<n-1; i++){
            min_index=i;
            for(int j=i+1; j<n; j++){
               if(Array[j]<Array[min_index])
               min_index=j;


               temp=Array[min_index];
               Array[min_index]=Array[i];
               Array[i]= temp;
             }
           
         }

         //original
         System.out.println("Sorted Array is:");
         for(int i=0; i<n; i++){
            System.out.print(Array[i] +" ");
          }
    }
    
}
