package interview.TwoPointer;

import java.util.Arrays;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n)
 * to hold additional elements from nums2.
 * Example:
 * <p>
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * Output: [1,2,2,3,5,6]
 */
public class MergeSort {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m + n - 1;
        int i1 = m - 1;
        int i2 = n - 1;
        while (i1 >= 0 || i2 >=0){
            if(i1 < 0){
                nums1[l--] = nums2[i2--];
            }
            else if(i2 < 0){
                nums1[l--] = nums1[i1--];
            }
            else if(nums1[i1] > nums2[i2]){
                nums1[l--] = nums1[i1--];
            }
            else{
                nums1[l--] = nums2[i2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
