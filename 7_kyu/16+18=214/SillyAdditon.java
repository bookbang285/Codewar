/*
For this Kata you will have to forget how to add two numbers together.

The best explanation on what to do for this kata is this meme:

    248
   +
    208
    4416

In simple terms, our method does not like the principle of carrying over numbers and just writes down every number it calculates :-)

You may assume both integers are positive integers

You may assume both integers are positive integers and the result will not be bigger than Integer.MAX_VALUE
*/
public class SillyAdditon {
    public int add(int num1,int num2){
        String str = "";
        while(true){
            str = String.valueOf(num1%10 + num2%10) + str;
            num1 /= 10;
            num2 /= 10;
            if(num1==0&&num2==0)break; 
        }
        return Integer.parseInt(str);
    }
}
