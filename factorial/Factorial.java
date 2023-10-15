package factorial;

import java.util.Scanner;

public class Factorial {
    public int show(){
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the number to print factorial... : ");
        int n= sc.nextInt();
           int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        
        sc.close();
        return factorial;
    }
   
}
