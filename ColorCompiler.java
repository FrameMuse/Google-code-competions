import java.io.*;
import java.util.*;

public class ColorCompiler {
  public static void main(String[] args) {
    Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    String colorName = input.nextLine().replace(" ", "-");
    String colorValue = input.nextLine();
    System.out.println("--color-" + colorName + ": " + colorValue + ";");
  }
}
