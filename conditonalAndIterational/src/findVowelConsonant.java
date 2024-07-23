import java.util.Scanner;

public class findVowelConsonant {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the letter:");
        char letter  = in.next().charAt(0);
        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("it is vowel.");
                break;
            default:
                System.out.println("it is a consonant.");
        }

    }
}
