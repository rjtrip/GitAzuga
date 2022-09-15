import java.io.File;
import java.util.Arrays;

public class lsS{
    public static void main(String[] args) {
        File file = new File(
                System.getProperty("user.dir"));
        File[] files = file.listFiles();
  	Arrays.sort(files);
        for (File f : files) {
            System.out.println( f.getName() );
                    
        }
 
    }
}

/*"users/azuga/documents/demojava"*/