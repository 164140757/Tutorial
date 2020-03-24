package interview;
/**
 * 题目描述
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 *
 * Input:
 * {2, 3, 1, 0, 2, 5}
 *
 * Output:
 * 2
 */

public class Duplicate {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        // check
        if(numbers == null || numbers.length != length){
            return false;
        }
        // adjust every element i to the ith position
        for (int i = 0; i < length; i++) {
            while(numbers[i]!= i){
                if(numbers[i] == numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(numbers[i],i,numbers);
            }
        }
        return false;
    }
    // swap element i to the ith position
    private static void swap(int element,int i,int[] nums) {
        int tmp = nums[element];
        nums[element] = element;
        nums[i] = tmp;
    }

    public static void main(String[] args) {
        int[] test = {2,3,1,0,2,5};
        int[] dup = new int[1];
        System.out.println(duplicate(test,6,dup)+" "+dup[0]);
    }

}