//program to take and Print the Full Name of user and also its lenght.
import java.util.*;
public class code01 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //Input
        System.out.println("Enter Your First Name :");
        String firstname=sc.next();
        System.out.println("Enter Your Middle Name :");
        String middlename=sc.next();
        System.out.println("Enter Your Last Name :");
        String lastname=sc.next();

       //Output
       System.out.println("Your Full Name is: ");
       System.out.println(firstname+" "+ middlename+ " "+ lastname);

       String fullname= firstname+" "+ middlename+ " "+ lastname;
       System.out.println("Lenght of Your Name is: ");
       System.out.println(fullname.length());

    }
    
}
