package file_handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("C:\\Users\\jagdish gupta\\Desktop\\UIET SEMS\\Eit labs\\file_handling\\first.txt");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine())
        {
         String s=sc.nextLine();
         System.out.println(s);
        }
    sc.close();
    }

   
}
