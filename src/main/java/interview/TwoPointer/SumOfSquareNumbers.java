package interview.TwoPointer;

/**
 * Given a non-negative integer c, your task is to decide
 * whether there're two integers a and b such that a^2 + b^2 = c.
 * Example 1:
 *
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 */
public class SumOfSquareNumbers {
    public static boolean judgeSquareSum(int c) {
        if(c < 0){
            return false;
        }
        int i = 0, j = (int)Math.sqrt(c);
        while(i <= j){
            int sum = i*i + j*j;
            if(sum > c){
                j--;
            }
            else if(sum < c){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
    }

}
