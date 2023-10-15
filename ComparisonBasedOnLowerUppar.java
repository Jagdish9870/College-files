import java.util.*;
public class ComparisonBasedOnLowerUppar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.println("enter choices  : ");
        System.out.println("choose 1 for comparison of two string .. ");
         System.out.println("choose 2 for convert any string in lower case.. ");
          System.out.println("choose 3 for convert any string in uppar case..");


        int  ch = sc.nextInt();
        switch(ch){
            case 1:
                {
                    System.out.println("enter first string");
                    String s1= sc.next();
                    System.out.println("enter second string");
                    String s2=sc.next();
                    boolean areEqual = s1.equals(s2);

                    if (areEqual) {
                        System.out.println("The strings are the same.");
                    } else {
                        System.out.println("The strings are different.");
                    }

                      break;
                }
            case 2:{
                System.out.println("Enter a string to make lowercase:");
                String str = sc.next();
                String str1 = str.toLowerCase();//to change all characters into small letters
                System.out.println(str1);



                

                break;
            }
           
            case 3:
            {
               System.out.println("enter a string to convert into lower case");
               String str = sc.next().toUpperCase();//to change all characters into uppar letters
               System.out.println(str);
               break;

            }
           
            default : System.out.println("invalid choice");
        }
        
    
       
        
        sc.close();
    }

    
}

