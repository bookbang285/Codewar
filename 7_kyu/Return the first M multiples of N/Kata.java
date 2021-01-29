/*
Implement a function, multiples(m, n), which returns an array of the first m multiples of the real number n. Assume that m is a positive integer.

Ex.

multiples(3, 5.0)
should return

[5.0, 10.0, 15.0]
*/
public class Kata {
    public int[] multiples(int m, int n) {
        int arr[] = new int[m];
        for(int i = 1; i<=m;i++){
          arr[i-1] = i*n;
        }
        return arr;
      }
}
