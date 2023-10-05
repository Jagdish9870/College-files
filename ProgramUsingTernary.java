import java.util.Scanner;


public class ProgramUsingTernary {
    public static void main(String[] args) {
        Scanner m= new Scanner(System.in);
        System.out.println("enter marks");

        int marks= m.nextInt();

        String result= (marks>70)? "passed": "fail";
        System.out.println(result);
        m.close();
       
        
    }
    
}
