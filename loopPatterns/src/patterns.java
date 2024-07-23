import java.util.Scanner;
public class patterns {
    void pattern1(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        for(int i=1;i<=num;i++){
            for (int j=num;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //output
        /*      *
                **
                ***
                ****
                *****
                ******
        */

    }
    void pattern2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //output
        /*
         ******
         *****
         ****
         ***
         **
         *
         */
    }

    void pattern3(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        int i,j;
        for(i = 1; i <= num; i++){
            for (j=1 ; j< num ; j++){
                if (i == 1 || j == 1 || j == num-1  || i == num ) {

                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    void pattern4(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int i,j;
        for(i = 1;i <= num;i++){
            for (j = 1;j <= num-i;j++){
                System.out.print(" ");
            }
            for(j=1 ;j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    void pattern5(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int i,j;

    }
    public static void main(String[] args){
        patterns[] obj = new patterns[3];
        obj[0] = new patterns();
        obj[0].pattern4();
//        obj.pattern2();
//        obj.pattern3();
//        obj.pattern4();

    }
}
