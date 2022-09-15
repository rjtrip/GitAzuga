import java.io.*;
import java.nio.file.*;
import java.util.*;

public class pipe {
    public static String cat(String path)
    {
        try {
            String line = Files.readString(Path.of(path));
            return line;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String[] head(String str)
    {
        BufferedReader reader = null;
        int lineCount = 0;

        try {
            //Creating BufferedReader object

            reader = new BufferedReader(new FileReader("/users/azuga/documents/wcTest/data.txt"));

            //Reading the first line into currentLine
            String[]sh;
            int i=0;

            String currentLine = reader.readLine();

            while (lineCount < 10) {
                //Updating the lineCount

                lineCount++;
                sh[i]=currentLine;
                i++;

                //System.out.println(currentLine);
                currentLine = reader.readLine();
            }
            return sh;

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close(); //Closing the reader
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String[] tail(String str)
    {
        BufferedReader reader = null;
        BufferedReader reader2 = null;

        int lineCount = 0;
        String[] st;

        try {
            //Creating BufferedReader object

            reader = new BufferedReader(new FileReader("/users/azuga/documents/wcTest/data.txt"));

            //Reading the first line into currentLine
            String[] st;
            int i=0;

            String currentLine = reader.readLine();
            while (currentLine != null) {

                lineCount++;

                currentLine = reader.readLine();
            }

            reader2 = new BufferedReader(new FileReader("/users/azuga/documents/wcTest/data.txt"));

            //Reading the first line into currentLine

            String currentLine2 = reader2.readLine();
            int linecount2 = 0;
            int a = lineCount - 10;

            while (currentLine2 != null) {


                linecount2++;
                if (linecount2 > a) {
                    //System.out.println(currentLine2);
                    st[i]=currentLine2;
                    i++;
                }

                currentLine2 = reader2.readLine();
            }
         return st;

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close(); //Closing the reader
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void wc(String str) {
        String[] lines = str.split("\n\r|\r|\n");
        System.out.print(lines.length + "\t");
        int j = 0, k = 0;
        while (j < lines.length) {
            for (String s: lines[j].split(" ")) {

                k++;
            }
            j++;
        }
        System.out.print(k + "\t");
        int i = 0;
        for (char c: str.toCharArray()) {
            i++;
        }
        System.out.println(i + "\t"+ "data.txt");

    }


    public static List<String> sort(String str) {
		String[] lines = str.split("\n\r|\r|\n");
		List<String> ls = new ArrayList<>();
		for(String s:lines) {
			ls.add(s);
		}
		Collections.sort(ls);
        return ls;
		//ls.forEach(e->

		//		System.out.println(e));

	}

          public static String[] ls_a(String str)
        {
        
        String[] pathnames;

        File f = new File("/users/azuga");

        pathnames = f.list();

        /*for (String pathname : pathnames) {
            
            System.out.print(pathname + "\t"); 
             

        }*/
            return  pathnames;
    }

       public static File[] ls_1(String str)
    {
      
      File f = new File("/users/azuga");
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

return list;
      /*for(File fileName : list) {

         System.out.println(fileName.getName());

      } */
}
    
    public static File[] ls(String str)
    {
      
      File f = new File("/users/azuga");
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


      /*for(File fileName : list) {

         System.out.print(fileName.getName()+"\t");

      } */
        return list;
    }



    public static void main(String[] args) {
        String str = args[0];
        String[] s = str.split(" ");


    int i=0;
    String s2;

    if(s[i]=="cat") {
        i++;
        String st1=cat(s[i]);
        i++;
        i++;
        while(i<s.length)
    { if(s[i]=="wc") {
        wc(st1);
        break;
        }
        else if(s[i]=="sort") {
        List<String> ss=sort(st1);
        break;
        }
    else if(s[i]=="head") {
        String[] ss=head(st1);
        break;
    }
    else if(s[i]=="tail") {
        String[] ss=tail(st1);
        break;
    }

    }





    }
    else if (s[i]=="ls") {
        i++;
        File[] f1=ls(s[i]);
        i++;
        i++;
       // while(i<s.length()) {
         //   s = check(s[i]);

       // }






    }
   /* while(i<s.length())
    { s=check(s[i]);

    }*/
            
               /* switch (s[3]) {
                    case "wc":
                        wc(cat(s[1]));
                        break;
                    case "sort":
                        sort(cat(s[1]));
                        break;
                    case "head":
                        head(cat(s[1]));
                        break;
                    case "tail":
                        tail(cat(s[1]));
                        break;
                    case "ls-a":
                        ls_a(cat(s[1]));
                        break;
                    case "ls-1":
                        ls_1(cat(s[1]));
                        break;
                    case "ls":
                        ls(cat(s[1]));
                        break;
                    default:
                        System.out.println("Kindly recheck the arguments");
                }
                */
            

    }
}