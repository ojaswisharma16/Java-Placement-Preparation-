//Get bit --->
/*
 0101
 0100
 and them to get bit.
 */
import java.util.*;
public class Code01 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a Number :");
    int n=sc.nextInt();

    System.out.println("Number in Binary Is: " + Integer.toBinaryString(n));
    
    //Get bit
    System.out.println("Enter the Position of bit: ");
    int pos=sc.nextInt(); //pos starts from 0.

    int mask=1<<pos;

    if((n&mask)==0)
      System.out.println("The bit at "+pos +"nd place is 0.");
      else
      System.out.println("The bit at "+pos +"nd place is 1.");

    }
    
    
}
