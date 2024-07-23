public class largestNumber {
    public static void main(String[] args){
        int[] arr = {1,23,45,28,67,8,34};
        int largest  = arr[0];
        for(int i : arr){
            if(i > largest ){
                largest = i;
            }
        }
        System.out.println(largest);
    }
}
