/*
The vowel substrings in the word codewarriors are o,e,a,io. The longest of these has a length of 2. Given a lowercase string that has alphabetic characters only (both vowels and consonants) and no spaces, return the length of the longest vowel substring. Vowels are any of aeiou.

Good luck!
*/
public class Solution {
    public int solve(String s){
        String [] str = s.split("[qwrtypsdfghjklzxcvbnm]+");
           int result = 0;
           for(int i = 0 ;i<str.length;i++){
               if(result<=str[i].length())result=str[i].length();
           }
           return result;
     }
}
