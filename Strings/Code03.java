//Program to Convert a String into Integer and Integer to String.
import java.util.*;
public class Code03 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //Conversion from Number to String to find the lenght of Number as .lenght does not support for integer directly.
        int num01=123;
        String str01=Integer.toString(num01);

        System.out.println(str01.length());


         //Conversion from string to number
        String str02="4567";
        int num02=Integer.parseInt(str02);
 
         System.out.println(num02);

    }
    
}
