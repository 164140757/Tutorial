package interview;

import java.util.Arrays;
import java.util.Vector;

public class BinarySearch {
    public static boolean Find(int target, int[][] array) {
        // 2 dimension array with sorted order
        int rows = array.length;
        int cols = array[0].length;
        if (cols == 0) {
            return false;
        }
        // left corner
        int i = rows - 1, j = 0, val = array[i][j];
        while (i >= 0 && j < cols) {
            val = array[i][j];
            if (target < val) {
                i--;
            } else if (target > val) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] test1 = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}};
        System.out.println(BinarySearch.Find(5, test1));
    }
}
