import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.text.*;

public class pipetest{

    
   public static String cat(String path) {
			try {
				String line = Files.readString(Path.of(path));
				return line;
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
    
	public static void wc(String str) {

		String[] lines = str.split("\r\n|\r|\n");
		System.out.print(lines.length+"     ");
		lines = str.split(" ");
		System.out.print(lines.length+"     ");
        int i=0;
		for(char c:str.toCharArray()){
			i++;
		}
		System.out.println(i+"     " + "data.txt");



	}

public static void sort(String str) {
		String[] lines = str.split("\n\r|\r|\n");
		List<String> ls = new ArrayList<>();
		for(String s:lines) {
			ls.add(s);
		}
		Collections.sort(ls);
		ls.forEach(e->

				System.out.println(e));

	}
    public static void main(String[] args) {
			if((args[2].equals("|"))&&(args[3].equals("wc"))) {
				wc(cat(args[1]));
			}
                        else if((args[2].equals("|"))&&(args[3].equals("sort")))  {
				sort(cat(args[1]));
			}
			else {
				System.out.println("Please recheck the input arguments");
			}
			
	}
}
