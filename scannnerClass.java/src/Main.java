import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        Main mn= new Main();
        String finalString = " ";
        for(int i=0;i<3;i++){
            System.out.println("Enter the String:");
            String str = myObj.nextLine();
            finalString = finalString+str;
            mn.printString(str);

        }
        System.out.println(finalString);

    }
    void printString(String str){
        System.out.println("The entered string is ===> "+str);

    }
}