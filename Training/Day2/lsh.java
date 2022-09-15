import java.util.*;
import java.io.*;
import java.io.File;


public class lsh

{


    public static void main(String[] args) 
{
        
        String[] pathnames;

      
        File f = new File("/users/azuga");

        
        pathnames = f.list();

      
        for (String pathname : pathnames) {
            
            System.out.print(pathname); 
             System.out.print("   "); 

        }
    }
}
       
  
    
