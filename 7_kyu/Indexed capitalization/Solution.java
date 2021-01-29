/*
Given a string and an array of integers representing indices, capitalize all letters at the given indices.

For example:

capitalize("abcdef",[1,2,5]) = "aBCdeF"
capitalize("abcdef",[1,2,5,100]) = "aBCdeF". There is no index 100.
The input will be a lowercase string with no spaces and an array of digits.

Good luck!
*/
public class Solution {
    public String capitalize(String s, int[] ind){
        String str = "";
          int count = 0 ;
          for(int i = 0 ; i<s.length();i++){
              if(i==ind[count]){
                  str+= String.valueOf(s.charAt(i)).toUpperCase();
                  if(count<ind.length-1)count++;
              }else str += s.charAt(i);
          }
          return str;
      }
}
