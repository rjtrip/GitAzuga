import java.io.File;
import java.util.Scanner;

class wcl {
  public static void main(String[] args) {

    int count = 0;

    try {
      // create a new file object
      File file = new File("/users/azuga/documents/wcTest/data.txt");

      // create an object of Scanner
      // associated with the file
      Scanner sc = new Scanner(file);

      // read each line and
      // count number of lines
      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }
      System.out.println(count +" " + "data.txt");

      // close scanner
      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}