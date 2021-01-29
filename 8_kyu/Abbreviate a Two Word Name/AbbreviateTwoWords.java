/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

Patrick Feeney => P.F
*/
public class AbbreviateTwoWords {
    public String abbrevName(String name) {
        String str[] = name.split(" ");
        
        return str[0].substring(0,1).toUpperCase() +"."+str[1].substring(0,1).toUpperCase();
      }
}
