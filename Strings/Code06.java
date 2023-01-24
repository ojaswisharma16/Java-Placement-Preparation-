//Program to Find the User Name from the email id. 
import java.util.*;
public class Code06 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //Input
        System.out.println("Enter Your Email ID: ");
        String email=sc.next();

        //Finding user name;
        int breakpoint=0;
        for(int i=0; i<email.length(); i++)
        {
            if(email.charAt(i)=='@'){
               breakpoint=i;
            }
        }

        //Output
        System.out.println("Your User Name Is: ");
        System.out.println(email.substring(0, breakpoint));
    }
    
}
