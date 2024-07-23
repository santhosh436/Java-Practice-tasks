import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args){
        int[] arr = {12,56,33,67,12,56,67};
        int[] temp = new int[arr.length];
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            boolean isDuplicate = false;
            for(int k = 0; k<j;k++){
                if(arr[i] == arr[k]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                temp[j++] = arr[i];
            }
        }
        int[] result = new int[j];
        for(int i = 0;i<j;i++){
            result[i] = temp[i];
        }
        System.out.println(Arrays.toString(result));
    }
}