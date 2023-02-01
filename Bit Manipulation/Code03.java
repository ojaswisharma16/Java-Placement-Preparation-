/* Clear Bit--->1 to 0

1001
1000
0111

and of (n and ~(mask))
 */
import java.util.*;
public class Code03 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n=sc.nextInt();

        System.out.println("The Number in Binary is: "+ Integer.toBinaryString(n));

        //Clear Bit
        System.out.println("Enter the Position to make the bit 0:");
        int pos=sc.nextInt();

        int mask=1<<pos;
        int newmask=~(mask);

        n=n&newmask;

        System.out.println("The new number is:"+n);
        System.out.println("The new Number in Binary is: "+Integer.toBinaryString(n));
    }

    
}
