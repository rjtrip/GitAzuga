import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class wcall
{   
    public static void main(String[] args) 
    {
        BufferedReader reader = null;
         
        //Initializing charCount, wordCount and lineCount to 0
         
        int charCount = 0;
         
        int wordCount = 0;
         
        int lineCount = 0;
         
        try
        {
            //Creating BufferedReader object
             
            reader = new BufferedReader(new FileReader("/users/azuga/documents/wcTest/data.txt"));
             
            //Reading the first line into currentLine
             
            String currentLine = reader.readLine();
             
            while (currentLine != null)
            {
                //Updating the lineCount
                 
                lineCount++;
                 
                //Getting number of words in currentLine
                 
                String[] words = currentLine.split(" ");
                 
                //Updating the wordCount
                 
                wordCount = wordCount + words.length;
                 
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
             
            System.out.println(lineCount +" "+wordCount+ " " + charCount + " "  + "data.txt");
             
            
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