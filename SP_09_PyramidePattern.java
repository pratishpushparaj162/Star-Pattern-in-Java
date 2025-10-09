import java.util.*;

public class SP_09_PyramidePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println();

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= n - i; k++) {
                // spaces
                System.out.print("  ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                // numbers
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

