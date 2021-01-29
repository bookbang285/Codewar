/*
Write a function called repeat_str which repeats the given string src exactly count times.

repeatstr(6, "I") # "IIIIII"
repeatstr(5, "Hello") # "HelloHelloHelloHelloHello"
*/
public class Solution {
    public String repeatStr(final int repeat, final String string) {
        String str = "";
        for(int i= 1;i<=repeat;i++){
          str += string;
        }
          return str;
    }
}
