/* Program to Create String Builder and do following operations.

NOte--> StringBuilder in Java represents a "mutable" sequence of characters.
 Since the String Class in Java creates an "immutable" sequence of characters, 
 the StringBuilder class provides an alternative to String Class, 
 as it creates a "mutable" sequence of characters.
 
 */
import java.util.*;
public class Prob01 {
    public static void main(String[] args){
        StringBuilder sb= new StringBuilder("Ojaswi");
        System.out.println("Original String is: "+sb);
         
        // Setting Character 
        sb.setCharAt(0, 'A');
        System.out.println("String after setting A at index 0: "+ sb);

        
        //Inserting Character
        sb.insert(1, "N");
        System.out.println("String after Inserting N at index 1: "+ sb);

        
        //Deleting Character
        sb.delete(3, 5);
        System.out.println("String after Deletion of index 3 to 5: "+ sb);

        //Adding new string
        sb.append("Sharma");
        System.out.println("String after Adding new string: "+ sb);

        System.out.println("String Length is:"+ sb.length());


    }
    
}
