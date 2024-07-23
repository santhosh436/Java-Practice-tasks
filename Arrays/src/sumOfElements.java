public class sumOfElements {
    public static void main(String[] args){
        int[] arr = {23,45,67,89,34,13,56};
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.println("Sum of elements:"+sum);
    }
}
