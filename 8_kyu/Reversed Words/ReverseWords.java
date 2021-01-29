/*
Complete the solution so that it reverses all of the words within the string passed in.

Example:

reverseWords("The greatest victory is that which requires no battle") 
// must return "battle no requires which that is victory greatest The"
*/
public class ReverseWords{

    public static String reverseWords(String str){
        String s[] = str.split(" ");
           String result= "";
           for(int i = s.length-1;i>=0;i--){
               result+=s[i];
               if(i!=0)result+=" ";
           }
           return result;
    }
   }