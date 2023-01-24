

//Program to replace e to i
public class Prob04 {
    public static void main(String[] args){
        StringBuilder sb= new StringBuilder("Replacement");

        System.out.println("Original String is: "+ sb);

        //Changing
        for(int i=0; i<sb.length(); i++){
          char ch=sb.charAt(i);      //String builder characters cannot be checked directly so firstly stored in ch.
          if(ch=='e')
           sb.setCharAt(i, 'i');
        }

      // Output
      System.out.println("New String is: "+ sb);
    }
    
}
