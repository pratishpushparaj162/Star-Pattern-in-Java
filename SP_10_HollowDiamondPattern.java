import java.util.*;

public class SP_10_HollowDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println();

        // first half
        for(int i=1; i<=n; i++){
            
            for(int k=i; k<=n; k++){
                // stars
                System.out.print("*");
            }

            for(int k=1; k<=2*(i-1); k++){
                // spaces
                System.out.print(" ");
            }

            for(int k=i; k<=n; k++){
                // stars
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
        for(int i=2; i<=n; i++){

            for(int k=1; k<=i; k++){
                // stars
                System.out.print("*");
            }

            for(int k=1; k<=2*(n-i); k++){
                // spaces
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){
                // stars
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}


/*

For n = 7 -->

**************
******  ******
*****    *****
****      ****
***        ***
**          **
*            *
**          **
***        ***
****      ****
*****    *****
******  ******
**************

*/