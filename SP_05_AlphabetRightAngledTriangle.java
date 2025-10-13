import java.util.*;

public class SP_05_AlphabetRightAngledTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt() ;
        sc.close();
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
                ch = (ch == 'Z') ? 'A' : ++ch;
            }
            System.out.println();
        }
    }
}

