//Program to check if two strings are Equal or Not. and showing first two alphabates of both names.
//Note*---> Do not use == for checking String Equality , it not always gives the Right Answer.
// use name.substring(beginindex, endindex) to find required alphabates
import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Code02 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //input
        System.out.println("Enter User 01 Name: ");
        String user01= sc.next();
        System.out.println("Enter User 02 Name: ");
        String user02= sc.next();

        // checking Equality
        if(user01.equals(user02))
            System.out.println("Both users have Same Name.");
        else
         System.out.println("They have Different Name.");



         //showing first two alphabates of both names.
          System.out.println("First two Alphabates from Name of --->");
         System.out.println("User 01 is: "+ user01.substring(0,2));
         System.out.println("User 02 is: "+ user02.substring(0,2));
    
    }

    
}
