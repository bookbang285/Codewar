/*
Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"

Your task is to process a string with "#" symbols.

Examples
"abc#d##c"      ==>  "ac"
"abc##d######"  ==>  ""
"#######"       ==>  ""
""              ==>  ""
*/
public class BackspacesInString {
    public String cleanString(String s) {
      String str = "";
          for(int i = 0 ; i<s.length();i++){  
              if(s.charAt(i)=='#'&&str.length()>0) str=str.substring(0, str.length()-1);
              else if(s.charAt(i)!='#')str+=s.charAt(i);
          }
          return str;
    }
  }