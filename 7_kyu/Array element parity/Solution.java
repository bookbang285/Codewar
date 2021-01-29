/*
In this Kata, you will be given an array of integers whose elements have both a negative and a positive value, except for one integer that is either only negative or only positive. Your task will be to find that integer.

Examples:

[1, -1, 2, -2, 3] => 3

3 has no matching negative appearance

[-3, 1, 2, 3, -1, -4, -2] => -4

-4 has no matching positive appearance

[1, -1, 2, -2, 3, 3] => 3

(the only-positive or only-negative integer may appear more than once)

Good luck!
*/
public class Solution {
    public int solve(int [] arr){   
        for(int i : arr){
               int count = 0;
               for(int j = 0;j<arr.length;j++){
                   if(i>0&&(-i == arr[j]))count++;
                   else if(i<0 && (Math.abs(i)==arr[j]))count++;
               }
               if(count!=1)return i;
           }
        return -1;
    }
}
