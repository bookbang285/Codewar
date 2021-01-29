/*
A perfect power is a classification of positive integers:

In mathematics, a perfect power is a positive integer that can be expressed as an integer power of another positive integer. More formally, n is a perfect power if there exist natural numbers m > 1, and k > 1 such that mk = n.

Your task is to check wheter a given integer is a perfect power. If it is a perfect power, return a pair m and k with mk = n as a proof. Otherwise return Nothing, Nil, null, NULL, None or your language's equivalent.

Note: For a perfect power, there might be several pairs. For example 81 = 3^4 = 9^2, so (3,4) and (9,2) are valid solutions. However, the tests take care of this, so if a number is a perfect power, return any pair that proves it.

Examples
isPP 4 `shouldBe` Just (2,2)
isPP 9 `shouldBe` Just (3,2)
isPP 5 `shouldBe` Nothing
*/
public class PerfectPower {
    public int[] isPerfectPower(int n) {
        if(n<4)return null;
            int n2 =2 ;
            int sum = 0;
            while(true){
                sum = (int)(root(n, n2)+0.1);
                if(Math.pow(sum, n2) == n) return new int[] {(int)sum,n2};
                else n2++;
                
                if(n2>12)return null;
            }
      }
      
      public double root(double num, double root) {
            if (num < 0) {
                return -Math.pow(Math.abs(num), (1 / root));
            }
            return Math.pow(num, 1.0 / root);
        }
}
