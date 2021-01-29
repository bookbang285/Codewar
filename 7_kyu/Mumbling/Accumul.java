/*
This time no story, no theory. The examples below show you how to write function accum:

Examples:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
*/
public class Accumul { 
    public static String accum(String s) {
     String str = "";
        for(int i = 0 ; i < s.length();i++){
            int k =0 ;
            while(k<=i){
                if(k==0)str+= Character.toUpperCase(s.charAt(i));
                else str+= Character.toLowerCase(s.charAt(i));
                k++;
            }
            if(i<s.length()-1)str+="-";
        }
        return str;
    }
}