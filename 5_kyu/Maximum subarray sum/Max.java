/*
The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:

maxSequence(listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4));
// should be 6: listOf(4, -1, 2, 1)
Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.

Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
*/
public class Max {
    public int sequence(int[] arr) {
        int max = 0;
            for(int i =0;i<arr.length;i++){     
                int sum = 0;
                for(int j=i;j<arr.length;j++){
                    sum += arr[j]; 
                    if(max<sum)max=sum;    
                } 
            }
        return max;
      }
}
