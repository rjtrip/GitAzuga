import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*F;
 
 
public class wclong{
 
 
 
  public static void main(String a[]) {
 
    
 
    
    long lines = 0;

      try (InputStream is = new BufferedInputStream(new FileInputStream("/users/azuga/documents/wcTest/data.txt"))) {
          byte[] c = new byte[1024];
          int count = 0;
int fin=0;
          int readChars = 0;
          boolean endsWithoutNewLine = false;
          while ((readChars = is.read(c)) != -1) {
              for (int i = 0; i < readChars; ++i) {
                  if (c[i] == '\n')
                      {if(fin<=coun

              }
              endsWithoutNewLine = (c[readChars - 1] != '\n');
          }
          if (endsWithoutNewLine) {
              ++count;
          }
          lines = count;
      } catch (IOException e) {
          e.printStackTrace();
      }

  

 
}