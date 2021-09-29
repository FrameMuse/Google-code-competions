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

  private static long output(Scanner input) {
    long z = input.nextLong();
    long y = 0;
    long prevPrime = 2;
    for (int number = 3; number <= Math.round(Math.sqrt(z) * 2); number++) {
      if (Solution.isPrime(number)) {
        long cz = number * prevPrime;
        if (cz > z) {
          break;
        }
        y = cz;
        prevPrime = number;
      }
    }
    return y;
  }

  private static boolean isPrime(long number) {
    for (long i = 2; i <= Math.sqrt(number); i++)
      if (number % i == 0)
        return false;
    return number > 1;
  }
}
