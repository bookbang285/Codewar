/*
In this Kata, you will be given a string and two indexes (a and b). Your task is to reverse the portion of that string between those two indices inclusive.

solve("codewars",1,5) = "cawedors" -- elements at index 1 to 5 inclusive are "odewa". So we reverse them.
solve("cODEWArs", 1,5) = "cAWEDOrs" -- to help visualize.
Input will be lowercase and uppercase letters only.

The first index a will always be lower that than the string length; the second index b can be greater than the string length. More examples in the test cases. Good luck!
*/
public class Solution {
    public String solve(String s, int a, int b){
        char[] ch=s.toCharArray();
        
        if(b>ch.length-1) b=ch.length-1;
        int count = 0;
        
        for(int i = 0;i<=(int)(b-a)/2;i++){
            char c = ch[b-count];
            ch[b-count] = ch[a+i];
            ch[a+i] = c;
            count++;
            
        }
        return String.valueOf(ch);
    }
}
