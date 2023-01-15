/* Pattern No.17(Pascal's Triangle)

    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

Hint:
nCr= n!/(n-r)!*r!  -----> iCj = i!/(i-j)!*j!


       0C0
     1C0 1C1
   2C0 2C1 1C2
 3C0 3C1 3C2 3C3
4C0 4C1 4C2 4C3 4C4 


1). i and j will start from 0;
 
 */

 import java.util.*;
 public class Pattern17{

    //Recursive Function for factorial
     int factorial(int m){    //Function name should be in small case letters.
      if(m==1||m==0)
      return 1;
      else
      return m*(factorial(m-1));
     }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);   //Scaner class to take input from java.util.*;
        System.out.println("Enter the Size of Pascal's Triangle:");
        int n=sc.nextInt();
       

        int C=1; //Declare Variable to be Printed

        Pattern17 pc= new Pattern17();     //Pattern17 class to take input from pattern17 program;

        for(int i=0; i<=n; i++){

            for(int j=0; j<=(n-i); j++){
                System.out.print(" ");   // to print Starting Space
            }

            for(int j=0; j<=i; j++){
                //Putting into Formula nCr:
                C=((pc.factorial(i))/((pc.factorial(i-j))*(pc.factorial(j))));

                System.out.print(C +" "); //to print nCr and Space
            }

            System.out.println(); // to change line
        }
    }
 }