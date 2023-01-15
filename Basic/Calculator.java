/* Program to print calculator with operations like 
1. Addition
2. Subtraction
3. Multiplication 
4. Divide
5. Modulous
6. Floor division 
*/
import java.util.*;
class Calculator{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Integer:");
        int a= sc.nextInt();
        System.out.println("Enter Second Integer:");
        int b= sc.nextInt();
       System.out.println("We got Following Calculations...");
       System.out.println("1. Addition :"+ (a=+b));
       System.out.println("2. Subtraction :"+ (a-b));
       System.out.println("3. Multiplication :"+(a*b));
       System.out.println("4. Divide :"+(a/b));
       System.out.println("5. Modulous :"+(a%b));
       System.out.println("6. Floor division :"+(a/b));
    }
}