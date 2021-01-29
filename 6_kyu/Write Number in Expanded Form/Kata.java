/*
Write Number in Expanded Form
You will be given a number and you will need to return it as a string in Expanded Form. For example:

expandedForm(12); // Should return '10 + 2'
expandedForm(42); // Should return '40 + 2'
expandedForm(70304); // Should return '70000 + 300 + 4'
NOTE: All numbers will be whole numbers greater than 0.
*/
public class Kata{
    public static String expandedForm(int num){
      int count = 1;
        String result = "";
        while(num!=0){
            if((num%10)!=0){
                result = (num%10)*count + result;
                count*=10;
                num/=10;
                if(num==0)break;
                result = " + "+result;
            }else{
                count*=10;
                num/=10;
            }
        }
        return result;
    }
}