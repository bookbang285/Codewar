
/*
Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:

rowSumOddNumbers(1); // 1
rowSumOddNumbers(2); // 3 + 5 = 8
*/
public class RowSumOddNumbers {
    public int rowSumOddNumbers(int n) {
        int numbers = 1;
        for (int i = 1; i < n; i++)numbers += i;
        numbers = numbers * 2 - 1;
        int sum = numbers;
        for (int i = 1; i < n; i++) {
            numbers += 2;
            sum += numbers;
        }
        return sum;
    }
}
