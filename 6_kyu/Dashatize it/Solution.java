/*
Given a variable n,

If n is an integer, Return a string with dash'-'marks before and after each odd integer, but do not begin or end the string with a dash mark. If n is negative, then the negative sign should be removed.

If n is not an integer, return an empty value.

Ex:

dashatize(274) -> '2-7-4'
dashatize(6815) -> '68-1-5'
*/
public class Solution {
    public static String dashatize(int num) {
      //System.out.println(num);
      String n2s = String.valueOf(Math.abs(num));
      if(num<0)n2s=String.valueOf(num).substring(1, String.valueOf(num).length());
      String result = "";
      int c = 0;
      for(int i = 0 ; i <n2s.length();i++){
        if(Integer.parseInt(String.valueOf(n2s.charAt(i)))%2 !=0 ){
            if(c==1){
                c=0;
                result+="-";
            }
            if(i<n2s.length()-1)result+=n2s.charAt(i)+"-";
            else result+=n2s.charAt(i);
        }else{
            result+=n2s.charAt(i);
            c=1;
        }
      }
      return (result.charAt(result.length()-1)=='-')?result.substring(0,result.length()-1):result;
    }
    
}