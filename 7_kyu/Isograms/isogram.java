/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

isIsogram "Dermatoglyphics" == true
isIsogram "aba" == false
isIsogram "moOse" == false -- ignore letter case
*/
public class isogram {
    public static boolean  isIsogram(String str) {
        char ch[] = str.toLowerCase().toCharArray();
        for(int i = 0 ;i<ch.length;i++)for(int j = i+1 ; j<ch.length;j++)if(ch[i]==ch[j])return false;
        return true;
    } 
}