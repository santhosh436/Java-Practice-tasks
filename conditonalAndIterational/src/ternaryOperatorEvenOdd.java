import java.util.Scanner;

public class ternaryOperatorEvenOdd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        String result = num%2==0 ? "it is a even number":"it is a odd number";
        System.out.println(result);
    }
}

