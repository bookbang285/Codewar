/*
Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"
*/
public class Kata{
    public static String reverseWords(final String original){
      String str[] = original.split(" ");
          String result = "";
          for(int i =0 ;i<str.length;i++){
              str[i] = new StringBuilder(str[i]).reverse().toString();
              result += str[i];
              if(i<str.length-1)result+=" ";
          }
          return (result.equals(""))? original:result;
    }
  }