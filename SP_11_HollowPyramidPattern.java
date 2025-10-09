import java.util.Scanner;

public class SP_11_HollowPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println();

        for (int i = 1; i <= n; i++) {

            // initial spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            //  stars for the first and last row
            if (i == 1 || i== n) {
                for (int j = 1; j <=i; j++) {
                    System.out.print(" * ");
                }
            } 
            else {
                // stars for all middle rows
                System.out.print("*");

                for (int j = 1; j <= (2 * i - 3); j++) {
                    // inner spaces
                    System.out.print(" ");
                }

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}


