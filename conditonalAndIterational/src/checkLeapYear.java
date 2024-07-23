import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the leap year:");
        int year = in.nextInt();
        if(year%4==0){
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("It is not a leap year");
        }
    }
}
