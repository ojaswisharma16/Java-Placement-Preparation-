//Program to replace Letter 'e'to 'i' in a String.
import java.util.*;
public class Code05 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //Input
        System.out.println("Enter the Word: ");
        String word=sc.next();

        System.out.println("Original Word is: "+ word);

        //replace
        System.out.println("Method 01: ");
        String newWord=word.replace("e","i");
        System.out.println("New Word is: "+ newWord);


        System.out.println("Method 02: ");
        String result="";
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)=='e')
            result=result+"i";
            else
            result=result+word.charAt(i);
        }
        System.out.println("New Word is: "+ result);


    }
}
