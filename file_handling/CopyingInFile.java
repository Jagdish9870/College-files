package file_handling;


import java.io.IOException;
import java.io.*;


public class CopyingInFile {
    public static void main(String[] args) throws IOException {
        
        FileInputStream re = new FileInputStream("C:\\Users\\jagdish gupta\\Desktop\\UIET SEMS\\Eit labs\\file_handling\\first.txt");
        FileOutputStream w = new FileOutputStream("C:\\Users\\jagdish gupta\\Desktop\\UIET SEMS\\Eit labs\\file_handling\\second.txt");

        int i;
        while((i=re.read())!= -1)
        {
            
            w.write((char)i);
        }
        re.close();
        w.close();
    

       
        
    }

    

    
    
}
