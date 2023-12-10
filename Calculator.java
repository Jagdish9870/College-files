import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner cal= new Scanner(System.in);
        System.out.println("enter a : ");
        int num1 =cal.nextInt();
        System.out.println("enter b : ");
        int  num2=cal.nextInt() ;
        System.out.println("operator which you want to perform...");
        String opp = cal.next();
        switch(opp){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1+num2);
                break; 
            case "*":
                System.out.println(num1*num2);
                break;         
            case "/":
                System.out.println(num1/num2);
                break;
            case "%":
                System.out.println(num1%num2);
                break;                
        }
        cal.close();
    }
    
}
