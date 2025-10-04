import java.util.*;

public class SP_07_ButterflyPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int rows = sc.nextInt();
        sc.close();
        System.out.println();

        for(int i=1; i<=rows; i++){
            // first half

            for(int k=1; k<=i; k++){
                // stars
                System.out.print("* ");
            } 

            for(int k=1; k<= 2*(rows-i); k++){
                // spaces
                System.out.print("  ");
            }

            for(int k=1; k<=i; k++){
                // stars
                System.out.print("* ");
            } 
            System.out.println();
        }

        for(int i=rows; i>=1; i--){
            // second half

            for(int k=1; k<=i; k++){
                // stars
                System.out.print("* ");
            } 

            for(int k=1; k<= 2*(rows-i); k++){
                // spaces
                System.out.print("  ");
            }

            for(int k=1; k<=i; k++){
                // stars
                System.out.print("* ");
            } 
            System.out.println();
        }
        System.out.println();
    }
}

/*

For n = 5 --->

*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 

*/