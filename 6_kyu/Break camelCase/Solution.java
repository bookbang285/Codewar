/*
Complete the solution so that the function will break up camel casing, using a space between words.

Example
solution("camelCasing")  ==  "camel Casing"
*/
class Solution {
    public static String camelCase(String input) {
      String str = "";
      for(int i = 0 ; i < input.length();i++){
        if(input.charAt(i)<96)str+=" " + String.valueOf(input.charAt(i));
        else str+=String.valueOf(input.charAt(i));
      }
      return str;
    }
  }