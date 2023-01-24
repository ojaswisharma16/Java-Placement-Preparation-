import java.util.Scanner;

//Program to find user name from an Email.

public class Prob05 {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Ritu123@gmail.com");
        
        System.out.println("Your Email ID Is: "+sb);

        //Finding
        int breakpoint=0;
        for(int i=0; i<sb.length(); i++){
            char ch=sb.charAt(i);
            if(ch=='@')
            breakpoint=i;
             }

             //Output
             sb.delete(breakpoint,sb.length());
             System.out.println("Your User Name is: "+ sb);

        
    }
    
}
