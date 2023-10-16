package file_handling;

import java.io.File;
import java.io.IOException;

public class createAFile {
    public static void main(String[] args) throws IOException {
        File f= new File("C:\\Users\\jagdish gupta\\Desktop\\UIET SEMS\\Eit labs\\file_handling\\first.txt");
        f.createNewFile();
        System.out.println("file created succefully");
        
    }
    
}
