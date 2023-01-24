//Program to Reverse a String.
public class Prob02 {
    public static void main(String[] args){
        StringBuilder sb= new StringBuilder("OjaswiSharma");
        System.out.println("Original String is: "+sb);

        //Reverse String
        for(int i=0; i<sb.length()/2; i++){
            int front=i;
            int back =sb.length()-i-1;

            char frontchar=sb.charAt(front);
            char backchar= sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }

        System.out.println("Reversed String is: ");
        System.out.println(sb);
    
 }
}
