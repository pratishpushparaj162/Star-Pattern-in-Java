import java.util.*;

public class SP_12_PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println();

        for(int i=1; i<=n; i++){

            // initial spaces
            for(int k=i; k<n; k++){
                System.out.print(" ");
            }

            // stars
            for(int k=1; k<=i; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

/*
 
For n = 7 --> 

       * 
      * * 
     * * * 
    * * * * 
   * * * * * 
  * * * * * * 
 * * * * * * * 
* * * * * * * * 

*/
