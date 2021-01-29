/*
In this Kata, you will be given a string that has lowercase letters and numbers. Your task is to compare the number groupings and return the largest number. Numbers will not have leading zeros.

For example, solve("gh12cdy695m1") = 695, because this is the largest of all number groupings.

Good luck!
*/
public class Solution {
    public int solve(String s){
        int max = 0 ;
        String sum = "" ;
         for(int i = 0 ; i<s.length();i++){
           if(s.charAt(i)<97) sum+=s.charAt(i);
           else sum = "" ;
           
           if(!sum.isEmpty()){
               if(Integer.parseInt(sum) >max)max = Integer.parseInt(sum);
           }
         }
        return max;
      }
}
