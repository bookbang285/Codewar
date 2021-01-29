/*
Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.

The input will be a lowercase string with no spaces.

Good luck!
*/
public class Solution {
    public String[] capitalize(String s){
        String str1 ="",str2 = "";
        for(int i = 0;i<s.length();i++){
            if(i%2==0) str1 += String.valueOf(s.charAt(i)).toUpperCase();
            else str1 += String.valueOf(s.charAt(i));
            if(i%2==1)str2 += String.valueOf(s.charAt(i)).toUpperCase();
            else str2 += String.valueOf(s.charAt(i));  
        }        
        return  new String[] {str1,str2};
    }
}
