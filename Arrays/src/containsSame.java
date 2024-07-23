import java.util.Arrays;

public class containsSame {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,5,1,4};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean result = findContainSame(arr1,arr2);
        if(result){
            System.out.println("array contains the same elements");
        }
        else {
            System.out.println("Array do not contains the same elements");
        }
    }
    public static boolean findContainSame(int[] arr1,int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i=0 ;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
