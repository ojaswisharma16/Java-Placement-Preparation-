// Program to print Table of a Number using Function.

import java.util.*;
public class Table {


    static int printtable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        printtable(n);
    }
    
}
