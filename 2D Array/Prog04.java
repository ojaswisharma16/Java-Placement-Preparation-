
/*Given a 2D array, print it in spiral form.
// 1.   ([i=0][j=0 to colend]....   
// 2.    [j=colend][i=1 to rowend].)   -----> 
// 3, ...([i=rowend][j=colend-1 to 0]..
//4. ...[j=0][i=r0wend-1 to 1].)....


Examples:    

Input:  {{1,    2,   3,   4},
              {5,    6,   7,   8},
             {9,   10,  11,  12},
            {13,  14,  15,  16 }}
Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
 

example 02:

Input: { {1,   2,   3,   4,  5,   6},
           {7,   8,   9,  10,  11,  12},
          {13,  14,  15, 16,  17,  18}}

Output: 1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11

*/
import java.util.*;
public class Prog04 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Columns : ");
        int col=sc.nextInt();
        System.out.println("Enter Number of Rows : ");
        int row=sc.nextInt();

        int Array[][]= new int[row][col];


        //Input
        System.out.println("Total "+row*col+" Elements ! ");
        for(int i=0; i<row; i++){
            System.out.println("Enter " +col+" Elements in "+(i+1)+" th Row : ");
            for(int j=0; j<col; j++){ 
                Array[i][j]=sc.nextInt();
            }
        }


        //output
         System.out.println("Entered Matrix is : ");
         for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }

        
       //Spiral    ------->
        System.out.println("Spiral Output is : ");

        int rowStart=0;
        int colStart=0;
        int rowEnd=row-1;
        int colEnd=col-1;

        
        while(rowStart<=rowEnd && colStart<=colEnd)
        {
        //1 i=rowstart, j=colstart to colEnd
        for(int j=colStart; j<=colEnd; j++){
            System.out.print(Array[rowStart][j]+" ");
        }
        rowStart++;

         //2 j=colend, i=1 to rowend
         for(int i=rowStart; i<=rowEnd; i++){
            System.out.print(Array[i][colEnd]+" ");
        }
        colEnd--;

        //3 i=rowend, j=colend-1 to 0
         for(int j=colEnd; j>=colStart; j--){
            System.out.print(Array[rowEnd][j]+" ");
        }
        rowEnd--;
    
         //4 j=colstart , i= rowend-1 to 1
         for(int i=rowEnd; i>=rowStart; i--){
            System.out.print(Array[i][colStart]+" ");
        }
        colStart++;

        System.out.println();
        }
    }
    
}
