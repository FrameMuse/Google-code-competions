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
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    int n = input.nextInt();
    String s = input.next();

    int lastInc = 1;
    int lastWeight = 1;
    ArrayList<CharSequence> incMap = new ArrayList<CharSequence>();
    for (int index = 0; index < n; index++) {
      char letter = s.charAt(index);
      int letterWeight = alphabet.indexOf(letter) + 1;

      if (letterWeight <= lastWeight) {
        lastInc = 1;
        lastWeight = 1;
      }

      incMap.add(String.valueOf(lastInc));

      lastInc++;
      lastWeight = letterWeight;
    }

    return String.join(" ", incMap);
  }
}
