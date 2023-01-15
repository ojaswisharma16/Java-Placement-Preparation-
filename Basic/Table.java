// Program to Print the Table of Inserted Number.
import java.util.*;
public class Table{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num= sc.nextInt();
        System.out.println("Table is:");
        for(int i=1; i<11; i++){
            System.out.println(num + "*"+ i+ "="+ (num*i));
        }
    }
}