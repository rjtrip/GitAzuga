import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class wcc 
{   
    public static void main(String[] args) 
    {
        BufferedReader reader = null;
         
        //Initializing charCount, wordCount and lineCount to 0
         
        int charCount = 0;
         
        
         
        try
        {
            //Creating BufferedReader object
             
            reader = new BufferedReader(new FileReader("/users/azuga/documents/wcTest/data.txt"));
             
            //Reading the first line into currentLine
             
            String currentLine = reader.readLine();
             
            while (currentLine != null)
            {
                
                  
                //Getting number of words in currentLine
                 
                String[] words = currentLine.split(" ");
                 
                
                 
                
                 
                //Iterating each word
                for (String word : words)
                {
                    //Updating the charCount
                     
                    charCount = charCount + word.length();
                }
                 
                //Reading next line into currentLine
                 
                currentLine = reader.readLine();
            }
             
            //Printing charCount, wordCount and lineCount
             
            System.out.println(charCount+ " " +"data.txt");
             
          
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