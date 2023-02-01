//Program to make two functions BinarytoDecimal and Decimalto Binary.
import java.util.*;
public class Code07 {
    // 13= 1101
   // Decimal to binary : 13-->odd ---> 1*10^0, 13/2=6-->even--->0*10^1, 6/2=3-->odd--->1*10^2, 3/2=1---->1*10^3
   static int decimaltobinary(int n){
    int binary=0;
    int i=0;
    while(n>0){
     if(n%2==1)
     binary=binary+ (int)Math.pow(10, i);
     n=n/2;
     i++;
    }
    return binary;
}

    // binary to decimal---> 101= 1*2^2+ 0*2^1+ 1*2^0= 4+0+1=5
    // 101/10--->rem=1 , n=101/10=10;
    static int binarytodecimal(int bin){
        int rem=0;
        int i=0;
        int dec=0;
         while(bin>0){
            rem=(bin%10);
          dec=dec+ (rem* (int) Math.pow(2, i));     //Explicit type Casting
            bin=bin/10;
            i++;
         }
        return dec;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number to be Coverted in Binary: ");
        int n=sc.nextInt();
        System.out.println("The Number in Binary is: "+decimaltobinary(n));

        
        //Binary to decimal
        System.out.println("Enter the Number to be Converted in Decimal :");
        int bin=sc.nextInt();
        System.out.println("The Number in Decimal is:"+ binarytodecimal(bin));
        
    }
    
}
