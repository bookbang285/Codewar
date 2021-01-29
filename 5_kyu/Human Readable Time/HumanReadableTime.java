/*
Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures.
*/
public class HumanReadableTime {
    public String makeReadable(int seconds) {
        int sec = (int)seconds%60;
            int min = (int)(seconds/60)%60;
            int hr = (int)((seconds/60)/60);
            String str = "";
            if(hr<=9) str += "0"+hr+":";
            else str +=hr+":";
            if(min<=9) str += "0"+min+":";
            else str +=min+":";
            if(sec<=9)str += "0"+sec;
            else str +=sec; 
            return str;
      }
}
