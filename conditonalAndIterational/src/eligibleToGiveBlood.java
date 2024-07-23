import java.util.Scanner;

public class eligibleToGiveBlood {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = in.nextInt();
        if(age>18){
            System.out.println("Enter the weight:");
            int weight = in.nextInt();

            if(weight>=50){
                System.out.println("Your eligible to give blood.");
            }
            else {
                System.out.println("Your not elgible to give blood");
            }
        }
        else {
            System.out.println("Your not eligible to give blood");
        }
    }
}
