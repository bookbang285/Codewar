/*
Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

solution('abc') // should return ['ab', 'c_']
solution('abcdef') // should return ['ab', 'cd', 'ef']
*/
public class StringSplit {
    public static String[] solution(String s) {
        String str[] = s.split("(?<=\\G..)");
        if(str[str.length-1].length()==1)str[str.length-1]=str[str.length-1]+"_";
        return str;
    }
}