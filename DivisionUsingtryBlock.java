import java.util.Scanner;

public class DivisionUsingtryBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        System.out.println("enter a number by which you want to divide :");
        int b=sc.nextInt();
        int c=0;
        try{
           c=n/b;
           
           
        }
        catch(Exception e){
            System.out.println("cannot divide by zero");
            
        }
        System.out.println(" here is the ans "  +c);


        sc.close();

    }
    
}
