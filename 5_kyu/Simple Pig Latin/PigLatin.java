/*
Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
*/
public class PigLatin {
    public static String pigIt(String str) {
      String result = "";
        String arr[] = str.split(" ");
        for(int i =0 ; i <arr.length;i++){
            if(!arr[i].equals("!")&&!arr[i].equals("?")){
            String s = arr[i].substring(1,arr[i].length());
            arr[i] = s + arr[i].substring(0,1) + "ay";
            }
            result += arr[i];
            if(i<arr.length-1)result+=" ";
        }
        return result;
    }
}