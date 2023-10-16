package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WitingInFile {
    public static void main(String[] args) throws IOException {
        File f= new File("C:\\Users\\jagdish gupta\\Desktop\\UIET SEMS\\Eit labs\\file_handling\\first.txt");
        FileWriter fw= new FileWriter(f);
        fw.write("jack here\n jai mata di");
        fw.close();
        
    }
    
}
