/*
Implement a function that receives two IPv4 addresses, and returns the number of addresses between them (including the first one, excluding the last one).

All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the first one.

Examples
ipsBetween("10.0.0.0", "10.0.0.50")  ===   50 
ipsBetween("10.0.0.0", "10.0.1.0")   ===  256 
ipsBetween("20.0.0.10", "20.0.1.0")  ===  246
*/
public class CountIPAddresses {
    public long ipsBetween(String start, String end) {
    
        int[] ip_start = ip_array(start);
        int[] ip_end = ip_array(end);
        long ip4 =  (long)ip_end[3]-ip_start[3];
        long ip3 =  (long)(ip_end[2]-ip_start[2])*256;
        long ip2 = (long)(ip_end[1]-ip_start[1])*(int)Math.pow(2, 16);
        long ip1 = (long)(ip_end[0]-ip_start[0])*256*256*256;
        
        return ip1+ip2+ip3+ip4;
    }

    public int[] ip_array(String str){
        int []stt = new int[4];
        stt[0] = Integer.parseInt(str.substring(0, str.indexOf(".")));
        int i = 0;
        int st = str.indexOf(".")+1;
        String str2 = "";
        while(st<str.length()){
            if(str.charAt(st)!='.'){
                str2+=str.charAt(st);        
            }
            if(str.charAt(st)=='.' || st==str.length()-1){
                stt[++i] = Integer.parseInt(str2);
                str2=""; 
            }      
            st++;
        }
        return stt;
    }
}
