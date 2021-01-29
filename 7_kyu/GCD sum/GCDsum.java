/*
Given the sum and gcd of two numbers, return those two numbers in ascending order. If the numbers do not exist, return -1, (or NULL in C, tuple (-1,-1) in C#, pair (-1,-1) in C++,None in Rust, array {-1,-1} in Java and Golang).

For example: 
Given sum = 12 and gcd = 4...

solve(12,4) = [4,8]. The two numbers 4 and 8 sum to 12 and have a gcd of 4.

solve(12,5) = -1. No two numbers exist that sum to 12 and have gcd of 5.

solve(10,2) = [2,8]. Note that [4,6] is also a possibility but we pick the one with the lower first element: 2 < 4, so we take [2,8].
More examples in test cases.

Good luck!
*/
public class GCDsum {
    public int[] solve(int s, int g){        
        int max = g,min = g,gcd = g;
        while(g!=s){
            g=max+min;
            if(g==s) return new int [] {min,max};
            if(s-gcd >= max)max+=gcd;
            else{
                max = gcd;
                min+= gcd;
            }
            if(min>gcd) return new int [] {-1,-1};
        }
        return new int [] {min,max};
    }
}
