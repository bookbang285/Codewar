/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
*/



public class Kata {
    public static int findShort(String s) {
        String arr[] = s.split(" ");
        int min = arr[0].length();
        for(String i : arr) if(i.length()<min)min=i.length();
        return min;
    }
}