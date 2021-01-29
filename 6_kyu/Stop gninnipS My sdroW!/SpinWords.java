/*
Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test") => returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona test"
*/
public class SpinWords {
    public String spinWords(String sentence) {
      String result = "";
          String []str = sentence.split(" ");
          for(int i = 0 ; i <str.length;i++){
              if(str[i].length()>4)result += new StringBuilder(str[i]).reverse();
              else result+=str[i];
              if(i<str.length-1)result +=" ";
          }
          return result;
    }
  }