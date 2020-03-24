package interview;

import java.util.Arrays;
import java.util.Vector;


/**
 * 题目描述
 * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 *
 * Consider the following matrix:
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 *
 * Given target = 5, return true.
 * Given target = 20, return false.
 */
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
