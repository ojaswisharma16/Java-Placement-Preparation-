/* Set bit---> 0 to 1 

101
010
or of them 111

 */
import java.util.*;
public class Code02 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n=sc.nextInt();

        System.out.println("The Number in Binary is: "+ Integer.toBinaryString(n));

        //Set bit
        System.out.println("Enter the Position for Setting the bit as 1:");
        int pos=sc.nextInt(n);

        int mask=1<<pos;

        n=n|mask;

        System.out.println("The new number is: "+n);
        System.out.println("The New number in Binary is:"+Integer.toBinaryString(n));

    }
    
}
