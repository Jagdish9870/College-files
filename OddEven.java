import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number");
        int a= sc.nextInt();
        if(a%2==0){
            System.out.println(a+" number is even ");
        }
        else 
        System.out.println("Number is odd");
        sc.close();
        
    }
    
}
