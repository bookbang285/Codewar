/*
Acknowledgments:
I thank yvonne-liu for the idea and for the example tests :)

Description:
Encrypt this!

You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:

1.Your message is a string containing space separated words.
2.You need to encrypt each word in the message using the following rules:
    The first letter needs to be converted to its ASCII code.
    The second letter needs to be switched with the last letter
3.Keepin' it simple: There are no special characters in input.

Examples:

encryptThis "Hello" == "72olle"
encryptThis "good" == "103doo"
encryptThis "hello world" == "104olle 119drlo"
*/
public class Kata {
    public String encryptThis(String text) {
        if(text.isEmpty())return "";
        String str[] = text.split(" ");
        String result = "";
        for(int i = 0 ; i<str.length;i++){
            String test = String.valueOf((int)str[i].charAt(0));
            if(str[i].length()>1){
            test += str[i].charAt(str[i].length()-1);
            for(int j = 2 ; j<str[i].length()-1;j++)test += str[i].charAt(j);
            if(str[i].length()>2)test += str[i].charAt(1);
            }
            if(i<str.length-1)result = result+test+" ";
            else result += test;
        }
        return result;
    }
}