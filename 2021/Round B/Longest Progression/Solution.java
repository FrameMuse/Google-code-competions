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

  private static int output(Scanner input) {
    int n = input.nextInt();

    int currentLength = 0;
    int longestLength = 2;
    int lastDiff = 0;
    int lastNumber = 0;
    for (int i = 0; i < n; i++) {
      int number = input.nextInt();
      int diff = Math.abs(number - lastNumber);

      if (lastDiff == diff) {
        currentLength++;
      } else {
        currentLength = 0;
      }
      // 8 5 2 -1
      lastDiff = diff;
      lastNumber = number;
      longestLength = Math.max(currentLength, longestLength);
    }

    return longestLength;
  }
}
