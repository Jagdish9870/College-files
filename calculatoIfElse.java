import java.util.*;
public class calculatoIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               System.out.println("Enter the first number : ");
               int a=sc.nextInt();
               System.out.println(" enter second number : ");
               int b=sc.nextInt();

               System.out.print("enter operator : ");
               char ch = sc.next().charAt(0);

               if(ch=='+'){
                System.out.println(a+b);
               }
               else if(ch=='-'){
                System.out.println(a-b);
               }
               else if(ch=='*'){
                System.out.println(a*b);
               }
               else if(ch=='/'){
                System.out.println(a/b);
               }
               else if(ch=='%'){
                System.out.println(a%b);
               }
               else
               {
                System.out.println("invalid");
               }

             sc.close();
               
    }
    
}
