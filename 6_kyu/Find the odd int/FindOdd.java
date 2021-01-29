/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
*/
import java.util.Arrays;
public class FindOdd {
  public static int findIt(int[] a) {
    Arrays.sort(a);
        if(a.length<1)return a[0];
        for(int i = 0 ; i <a.length-1;i++){
            if(a[i+1]==a[i])i++;
            else return a[i];
        }
        return a[a.length-1];
  }
}