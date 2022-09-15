import java.io.BufferedReader;  
import java.io.FileReader;  
  
public class wcw 
{  
    public static void main(String[] args) throws Exception {  
        String line;  
        int count = 0;  
  
        //Opens a file in read mode  

        FileReader file = new FileReader("/users/azuga/documents/wcTest/data.txt");  
        BufferedReader br = new BufferedReader(file);  
  
        //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split("");  
            //Counts each word  
            count = count + words.length;  
  
        }  
  
        System.out.println( count +" " + "data.txt");  
        br.close();  
    }  
}  