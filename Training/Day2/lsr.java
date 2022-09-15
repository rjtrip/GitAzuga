import java.util.*;
import java.io.*;
import java.io.File;
     
   

public class lsr

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


      
       for (int I = list.length-1; I >= 0; I--) {  
            System.out.print(list[I].getName() + " ");  
        }  
    }
}
       
  
    
