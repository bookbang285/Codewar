
/*
Write function alternateCase which switch every letter in string from upper to lower and from lower to upper. E.g: Hello World -> hELLO wORLD
*/
public class Kata {
    String alternateCase(final String string) {
        String str = "";
        for(int i =0;i<string.length();i++){
          if(string.charAt(i)<97)str += String.valueOf(string.charAt(i)).toLowerCase();
          else str += String.valueOf(string.charAt(i)).toUpperCase();
        }
          return str;
      }
}
