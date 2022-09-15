import java.util.*;
import java.io.*;
import java.io.File;


public class lsnh

{


    public static void main(String[] args) 
{
        
       

      
      File f = new File("/users/azuga");
 FileFilter fileFilter = new FileFilter(){
         public boolean accept(File dir) {          
            if (dir.isHidden()) {
               return false;
            } else {
               return true;
            }
         }
      };        
      File[] list = f.listFiles(fileFilter);


      for(File fileName : list) {

         System.out.println(fileName.getName());

      } 
    }
}
       
  
    
