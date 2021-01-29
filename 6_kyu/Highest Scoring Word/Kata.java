/*
Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.
*/
public class Kata {

    public static String high(String s) {
      String str[] =s.toLowerCase().split(" ");
          int c = 0;
          int o = 0;
          for(int i = 0 ; i <str.length;i++){
              int result = 0;
              for(int j = 0 ; j <str[i].length();j++)result+= str[i].charAt(j)-96;
              if(result>c){
                  c=result;
                  o=i;
              }
          }
          return str[o];
    }
  
  }