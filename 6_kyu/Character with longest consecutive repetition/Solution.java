
/*
For a given string s find the character c (or C) with longest consecutive repetition and return:

Pair(c, l)
where l (or L) is the length of the repetition. If there are two or more characters with the same l return the first in order of appearance.

For empty string return:

Pair(null, 0)
Happy coding! :)
*/
public class Solution {
    public static Object[] longestRepetition(String s) {
        if(s=="") return new Object[]{"",0};
         int c = 1;
         int m = 0;
         for(int i = 0 ;i<s.length();i++){
             int count =0;
             for(int j = i;j<s.length();j++){
                 if(s.charAt(i)==s.charAt(j)) count++;
                 else break;
            }
             
             if(c<count) {c = count; m=i;}
        }
         
         return new Object[]{String.valueOf(s.charAt(m)),c};
    }
}
