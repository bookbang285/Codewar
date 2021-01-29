/*
Task
Given a positive integer n, calculate the following sum:

n + n/2 + n/4 + n/8 + ...
All elements of the sum are the results of integer division.

Example
25  =>  25 + 12 + 6 + 3 + 1 = 47
*/
public class HalvingSum {
    int halvingSum(int n) {
      int result = n;
          while(n>1){
              result += (int)n / 2;
              n=n/2;
          }
          return result;
    }
  }