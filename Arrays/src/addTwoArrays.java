import java.util.Arrays;

public class addTwoArrays {
    public static void main(String[] args){
        int[] arr1 = {2,45,56,34,22,};
        int[] arr2 = {7,5,2,4,9};
        int[] sum = new int[arr1.length];
        for(int i = 0; i<arr2.length; i++){
            sum[i] = arr1[i]+arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(sum));
    }
}
