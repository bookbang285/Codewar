/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
*/
import java.util.Arrays;
public class XO { 
  public static boolean getXO (String str) {
    int X = (int)Arrays.stream(str.toLowerCase().split("")).filter(x -> x.equals("x")).count();
    int O = (int)Arrays.stream(str.toLowerCase().split("")).filter(x -> x.equals("o")).count();
    return (X==O)? true:(X==0&&O==0)? true:false;
  }
}