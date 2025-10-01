import java.util.*;

public class SP_02_InvertedRightAngledTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println();

        for(int i = 1; i <= n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
