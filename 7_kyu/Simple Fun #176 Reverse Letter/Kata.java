/*
Task
Given a string str, reverse it omitting all non-alphabetic characters.

Example
For str = "krishan", the output should be "nahsirk".

For str = "ultr53o?n", the output should be "nortlu".

Input/Output
[input] string str

A string consists of lowercase latin letters, digits and symbols.

[output] a string
*/
public class Kata {
    public String reverseLetter(final String str) {
        String result = "";
        for(int i = str.length()-1 ;i>=0;i--){
            if(str.charAt(i)>96&&str.charAt(i)<123){
                result += str.charAt(i);
            }
        }
        return result;
    }
}
