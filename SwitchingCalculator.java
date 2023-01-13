// Program to Create a Calculator Using Switch Case Statements.
import java.util.*;
public class SwitchingCalculator{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Integer : ");
         int a= sc.nextInt();
         System.out.println("Enter Second Integer : ");
        int b= sc.nextInt();
         System.out.println("Enter the Operation Number : ");
         System.out.println("1. Addition ");
         System.out.println("2. Substraction");
         System.out.println("3. Multiplication  ");
         System.out.println("4. Division  ");
         System.out.println("5. Modulo or Remainder ");
       
        int value= sc.nextInt();

        switch(value){
        case 1:
        int sum= a+b;
          System.out.println(" Addition :"+ sum);
          break;

          case 2:
        int sub= a-b;
          System.out.println(" Substraction :"+ sub);
          break;

          case 3:
        int mul= a*b;
          System.out.println(" Multiplication :"+ mul);
          break;
          
          case 4:
        int div = a/b;
          System.out.println(" Division  :"+ div);
          break;
        
        case 5:
        int mod= a%b;
          System.out.println(" Modulo:"+ mod);
          break;

          default:
          System.out.println(" Wrong Choice Entered!!");


    }
    }
}