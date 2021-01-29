/*
Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example:
348597 => [7,9,5,8,4,3]
*/
import java.util.Arrays;
public class Kata {
  public static int[] digitize(long n) {
    return Arrays.stream(String.valueOf(new StringBuilder(String.valueOf(n)).reverse()).split("")).mapToInt(Integer::parseInt).toArray();
  }
}