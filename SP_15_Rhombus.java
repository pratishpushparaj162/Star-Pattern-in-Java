import java.util.Scanner;

public class SP_15_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println();

        for(int i=1; i<=n; i++){
           
            for(int k=1; k<i; k++){
               // spaces
               System.out.print("  ");
            }

            for(int k=1; k<=n; k++){
                // stars
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

/*

For n = 8 -->
 
* * * * * * * * 
  * * * * * * * * 
    * * * * * * * * 
      * * * * * * * * 
        * * * * * * * * 
          * * * * * * * * 
            * * * * * * * * 
              * * * * * * * * 
*/