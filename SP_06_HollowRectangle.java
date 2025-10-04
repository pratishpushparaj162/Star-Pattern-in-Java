import java.util.*;

public class SP_06_HollowRectangle {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows & column : ");
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        System.out.println();
        sc.close();

        for(int i=1; i<=n1; i++){
            // for rows

            for(int j=1; j<=n2; j++){
                // for cols

                if(i != 1 && j != 1 && i != n1 && j != n2){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    } 
}


/*

For n1 = 6 & n2 = 8 -->

* * * * * * * * 
*             * 
*             * 
*             * 
*             * 
* * * * * * * * 

*/