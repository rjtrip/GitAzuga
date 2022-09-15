import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class headTail
{   
    public static void main(String[] args) 
    {
        BufferedReader reader = null;
BufferedReader reader2= null;
         
      
         
        
         
        int lineCount = 0;
         
        try
        {
            //Creating BufferedReader object
             
            reader = new BufferedReader(new FileReader("/users/azuga/documents/wcTest/data.txt"));
             
            //Reading the first line into currentLine
             
            String currentLine = reader.readLine();
while (currentLine != null)
            {
                 
                lineCount++;
                 
               
                 
               
                 
                currentLine = reader.readLine();
            }
             
           
 reader2 = new BufferedReader(new FileReader("/users/azuga/documents/wcTest/data.txt"));
             
            //Reading the first line into currentLine
             
            String currentLine2 = reader2.readLine();
int linecount2=0;
int a=lineCount-10;

             
           while (currentLine2 != null)
            {
                
                 
                linecount2++;
          if(linecount2> a)
                  {   
             System.out.println(currentLine2);
                  }
                
                 
               
             
 currentLine2 = reader2.readLine();
            }
             
            
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }   
}