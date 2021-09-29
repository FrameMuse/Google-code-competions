/*

  * Google Code Competition
  * Kick Start 2021 - Round B

*/

import java.util.*;
import java.io.*;

public class Solution {
  public static void main(String[] args) {
    Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = input.nextInt();
    for (int i = 1; i <= t; ++i) {
      var output = Solution.output(input);
      System.out.println("Case #" + i + ": " + output);
    }
  }

  private static String output(Scanner input) {
    return input.next();
  }
}
