package interview.TwoPointer;

import java.util.Arrays;

/**
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that
 * they add up to the target, where index1 must be less than index2.
 * <p>
 * Note:
 * <p>
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and
 * you may not use the same element twice.
 * Example:
 * <p>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoPointerSum {
    public static int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        int p1 = 1;
        int p2 = length;
        while (p1 < p2) {
            int sum = numbers[p1 - 1] + numbers[p2 - 1];
            if (sum > target) {
                p2--;
            }
            else if (sum == target) {
                return new int[]{p1, p2};
            } else {
                p1++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] test = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(test, target)));
    }

}
