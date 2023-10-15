import java.util.Scanner;

public class findVoteOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age : ");
        int age= sc.nextInt();

       String result=(age>=18)?"vote":"cannot vote";
       System.out.println(result);
       sc.close();
    }
    
}
