/*
Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
*/
import java.util.Arrays;
import java.util.List;
public class BitCounting {

  public static int countBits(int n){
    List<String> s1 = Arrays.asList(Integer.toBinaryString(n).split(""));    
        return (int)s1.stream()
                      .filter(x -> x.equals("1"))
                      .count();
  }
  
}