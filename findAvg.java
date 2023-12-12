import java.util.Scanner;

public class findAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        try{
             System.out.println("enter the numbers to find the avg");

        int n= sc.nextInt();
        int arr[]= new int[10];
        System.out.println("enter the numbers");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        
        int sum=0;
        for(int j:arr){
           sum+=j;
        }
      
        int avg=sum/n;
        System.out.println("average of numbers is : " +avg);
            
        }
        catch(Exception e){
            System.out.println("you can enter 10 numbers only.......");
        }
       


      sc.close();

        
    }
    
}
