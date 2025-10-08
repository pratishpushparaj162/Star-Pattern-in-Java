import java.util.*;

public class SP_13_K_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println();

        // first half
        for(int i=1; i<=n; i++) { 
            for(int k=1; k<=(n-i+1); k++){
               System.out.print(" * ");
            }
            System.out.println();
        }
        
        // second half
        for (int i=2; i<=n; i++) { 
            for(int k=1; k<=i; k++){
               System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

/*
 
For n = 8 --> 

* * * * * * * * 
* * * * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
* * * * * * * * 

*/
