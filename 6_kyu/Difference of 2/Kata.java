/*
The objective is to return all pairs of integers from a given array of integers that have a difference of 2.

The result array should be sorted in ascending order of values.

Assume there are no duplicate integers in the array. The order of the integers in the input array should not matter.

Examples
[1, 2, 3, 4]  should return [[1, 3], [2, 4]]

[4, 1, 2, 3]  should also return [[1, 3], [2, 4]]

[1, 23, 3, 4, 7] should return [[1, 3]]

[4, 3, 1, 5, 6] should return [[1, 3], [3, 5], [4, 6]]
*/
import java.util.Arrays;
public class Kata {
    public int[][] twosDifference(int[] array) {
        Arrays.sort(array);
            int[][] arr = new int[100][2];
            int c = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] - array[j] == 2 || array[j] - array[i] == 2 || array[i] + array[j] == 2) {
                        arr[c][0] = array[i];
                        arr[c][1] = array[j];
                        c++;
                    }
                }
            }
            int[][] result = new int[c][2];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j <= 1; j++)result[i][j] = arr[i][j];
            }
        return result;
    }
}
