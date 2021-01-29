/*
Normally we have firstname, middle and the last name but there may be more than one word in a name like a South Indian one.

Similar to those kinda names we need to initialize the names.

See the pattern below:

initials('code wars') => returns C.Wars 
initials('Barack Hussain obama') => returns B.H.Obama 

Complete the function initials.
*/

public class CWars {
    public String initials(String name){ 
        String s[] = name.split(" ");
        String result = "";
        for(int i = 0 ; i <s.length;i++){
            if(i<s.length-1)result += String.valueOf(s[i].charAt(0)).toUpperCase()+".";
            else {
                s[i] = s[i].replaceFirst(String.valueOf(s[i].charAt(0)), String.valueOf(s[i].charAt(0)).toUpperCase());
                result += s[i];
            }
        }
        return result;
    }
}
