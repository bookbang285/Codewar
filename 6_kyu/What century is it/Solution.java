/*
Return the century of the input year. The input will always be a 4 digit string, so there is no need for validation.

Examples
"1999" --> "20th"
"2011" --> "21st"
"2154" --> "22nd"
"2259" --> "23rd"
"1124" --> "12th"
"2000" --> "20th"
*/
public class Solution {
    public String whatCentury(int year) {
        int y1 = year/100;
        String str = "";
        if(year%100==00)str += y1;
        else str += ++y1;      
        if(y1>20 && y1%10==1)str += "st";
        else if(y1>20 && y1%10==2)str += "nd";
        else if(y1>20 && y1%10==3)str += "rd";
        else str += "th";
        return str;
      }
}
