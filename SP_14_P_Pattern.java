import java.util.*;

public class SP_14_P_Pattern {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println();

        int mid = (n % 2 == 0) ? (n/2) : (n/2)+1;

        for(int i=1; i<=n; i++){
            
            // stars (vertical bar)
            System.out.print("* ");

            if(i == 1 || i == mid){
                // stars (horizontal bars)
                for(int k=1; k<=mid; k++){
                    System.out.print(" * ");
                }
            } 
            else if (i > 1 && i < mid) {
                // spaces (Hollow part)
                for(int k=1; k<mid; k++){
                    System.out.print("  ");
                }

                // stars (right boundary)
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

/*
 
For n = 9 -->

* * * * * * 
*         *
*         *
*         *
* * * * * * 
* 
* 
* 
* 

*/
