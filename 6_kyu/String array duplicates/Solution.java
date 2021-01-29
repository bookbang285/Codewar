/*
In this Kata, you will be given an array of strings and your task is to remove all consecutive duplicate letters from each string in the array.

For example:

dup(["abracadabra","allottee","assessee"]) = ["abracadabra","alote","asese"].

dup(["kelless","keenness"]) = ["keles","kenes"].

Strings will be lowercase only, no spaces. See test cases for more examples.

Good luck!
*/
public class Solution {
    public String[] dup(String[] arr){
        String array[] =  new String[arr.length];
       for(int i =0;i<arr.length;i++){
           String str = "";
           for(int j = 0;j<arr[i].length()-1;j++){
               if(arr[i].charAt(j)!=arr[i].charAt(j+1))str+=arr[i].charAt(j); 
               if((j>=arr[i].length()-2)&&(str.charAt(str.length()-1) != arr[i].charAt(j+1)))str += arr[i].charAt(j+1);
           }
           array[i] = str;
       }
       return array;    
   }
}
