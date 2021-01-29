/*
Task
Given string s, which contains only letters from a to z in lowercase.

A set of alphabet is given by abcdefghijklmnopqrstuvwxyz.

2 sets of alphabets mean 2 or more alphabets.

Your task is to find the missing letter(s). You may need to output them by the order a-z. It is possible that there is more than one missing letter from more than one set of alphabet.

If the string contains all of the letters in the alphabet, return an empty string ""

Example
For s='abcdefghijklmnopqrstuvwxy'

The result should be 'z'

For s='aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy'

The result should be 'zz'

For s='abbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxy'

The result should be 'ayzz'

For s='codewars'

The result should be 'bfghijklmnpqtuvxyz'

Input/Output
[input] string s

Given string(s) contains one or more set of alphabets in lowercase.

[output] a string

Find the letters contained in each alphabet but not in the string(s). Output them by the order a-z. If missing alphabet is repeated, please repeat them like "bbccdd", not "bcdbcd"
*/
public class MissingAlphabets {
    int countchar(char[] arr, char ch){
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==ch)count++;
        }
        return count;
    }
    String find(final String text) {
        char[] ch = text.toCharArray();
        int max_ch = 0;
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ch.length; j++)if(ch[i] == ch[j])count++;   
            if (count > max_ch)max_ch = count;
        }
        String str = "";
        for(int i ='a';i<='z';i++){
            int char1 = countchar(ch,(char)i);
            while(char1!=max_ch){
                str += (char)i;
                char1++;
            }
        }
        return str;
    }
}
