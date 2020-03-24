package interview;

public class QuickSort {
    public static void quickSort(int[] numbs, int left, int right) {
        assert (left > 0 && right < numbs.length);
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right - 1; // pivot:right
        int pivot = numbs[right];
        while (i < j) {
            // search for keys to swap
            while(numbs[i]<pivot){
                i++;
            }
            while(numbs[j]>pivot){
                j--;
            }
            // swap
            if(i<j){
                swap(i,j,numbs);
            }
        }
        swap(right,i,numbs);
        // recurse
        quickSort(numbs,left,i-1);
        quickSort(numbs,i+1,right);
    }

    private static void swap(int i, int j, int[] numbs) {
        int tmp = numbs[i];
        numbs[i] = numbs[j];
        numbs[j] = tmp;
    }

    public static void main(String[] args) {
        int[] test = {2,1,5,8,11,3,9};
        quickSort(test,0,test.length-1);
        for (int i : test) {
            System.out.print(i+" ");
        }
    }
}
