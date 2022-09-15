import java.util.*;
import java.io.*;
import java.io.File;
     
   

public class ls1

{


    public static void main(String[] args) 
{
        
            File f = new File("/users/azuga/documents/demojava");
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


      
       for (int i = list.length-1; i >= 0; i--) {  
            System.out.println(list[i].getName()+ " ");  
        }  
    }
}
