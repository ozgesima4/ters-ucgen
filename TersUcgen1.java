
package tersucgen1;

import java.util.Scanner;

public class TersUcgen1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int satir;
        System.out.println("basamak sayisi:");
         satir=sc.nextInt();
        
        for (int i = satir; i <= 1; i--) {
            
            for (int j =1; j <= i-satir; j++) {
                System.out.print(" ");
            }
            for (int k = 1;k <= (2*i)-1; k++) {
                System.out.print("*");
            }
            
            System.out.println( );
     
        }
        
        
    }
    
}
