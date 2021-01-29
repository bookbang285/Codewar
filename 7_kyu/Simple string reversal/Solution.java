/*
In this Kata, we are going to reverse a string while maintaining the spaces (if any) in their original place.

For example:

solve("our code") = "edo cruo"
-- Normal reversal without spaces is "edocruo". 
-- However, there is a space at index 3, so the string becomes "edo cruo"

solve("your code rocks") = "skco redo cruoy". 
solve("codewars") = "srawedoc"
More examples in the test cases. All input will be lower case letters and in some cases spaces.

Good luck!
*/
public class Solution {
    public String solve(String s){  
        StringBuffer str = new StringBuffer(s.replaceAll("\\s+","")).reverse();
        String result = "";
        int count = 0;
        for(int i = 0 ; i<str.length();i++){
            if(s.charAt(i+count)==' '){
                result += " ";
                count++;
            }
            result += str.charAt(i);
        }
        return result;
     }
}
