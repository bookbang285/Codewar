/*
Given a triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
find the triangle's row knowing its index (the rows are 1-indexed), e.g.:

odd_row(1)  ==  [1]
odd_row(2)  ==  [3, 5]
odd_row(3)  ==  [7, 9, 11]
Note: your code should be optimized to handle big inputs.
*/
public class UserSolution {
    public static long[] oddRow(int n) {
      long numbers = 1;
          for (int i = 1; i < n; i++)numbers += i;
          numbers = (numbers * 2 - 1)-2;
      long result[] = new long[n];
          for (int i = 1; i <= n; i++) {
            result[i-1] = numbers += 2;
          }
          
      return result;
    }
  }