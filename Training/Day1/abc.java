import java.util.*;
import java.io.*;
import java.io.File;


public class abc{
   public static void main(String[] args) {
      try{            
        ProcessBuilder builder = new ProcessBuilder("cat", "qwe.java","fcat.);
        File combinedFile = new File("combinedFile");
        builder.redirectOutput(combinedFile);
        builder.redirectError(combinedFile);
        Process p = builder.start();
    } catch(IOException e){
        //handle exception...
    }
   }
}