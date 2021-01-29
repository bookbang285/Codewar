/*
Given time in seconds, return formatted string, as shown in following example:

Example:
Input: 90061 sec

Output: 1 1 1 1

e.g

90061 sec: 1 1 1 1 (1 day, 1 hour, 1 min and 1 seconds)
93784 sec: 1 2 3 4 (1 day, 2 hours, 3 mins, 4 seconds)
Useful conversions:
60 sec = 1 min
60 min = 1 hour
24 hour = 1 day
Please see included test case for an example.
*/
public class TimeUtils {
    public String convertTime(int timeDiff) {
        return (int)(((timeDiff/60)/60)/24)+" "+(int)((timeDiff/60)/60)%24+" "+(int)(timeDiff/60)%60+" "+(int)timeDiff%60;
       } 
}
