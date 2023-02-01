/* Update Bit---> 0 to 1, 1 to 0;
for 0 to 1--->Set Bit;
for 1 to 0 ----> Remonve bit;
 */
import java.util.*;
public class Code04 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();

        System.out.println("The Number in Binary is: "+ Integer.toBinaryString(n));

        //Update Bit
        System.out.println("Enter the Positon to be Updated: ");
        int pos=sc.nextInt();

        int mask=1<<pos;

        //Step 01- Find out the bit at that position.
        if((n&mask)==0){    //---->0 to 1.(Set bit)
          n=n|mask;
          System.out.println("The new Number is :"+n);
          System.out.println("The New Number in Binary is: "+Integer.toBinaryString(n));
        }

        else{      //---> 1 to 0 (Clear bit)
            int newmask=~(mask);
            n=n&newmask;
          System.out.println("The new Number is :"+n);
          System.out.println("The New Number in Binary is: "+Integer.toBinaryString(n));
        }
    }
    
}
