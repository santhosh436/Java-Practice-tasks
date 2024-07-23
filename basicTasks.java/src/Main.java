//Program of multiplying two floating numbers
//public class Main {
//    public static void main(String[] args) {
//        float num1 = 1.2F;
//        float num2 = 2.5F;
//        float result = num2*num1;
//        System.out.println("The result of multiplication of two floating number " + result);
//    }
//}




//Program of swaping two numbers

//public class Main {
//    public static void main(String[] args){
//       int x = 20;
//       int y = 30;
//       int temp = y;
//        y = x;
//        x = temp;
//        System.out.println("the value of x: "+x);
//        System.out.println("the value of y: "+y);
//
//    }
//}


//Program of checking the given number is even or odd

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the value :");
//        int value = input.nextInt();
//        if(value % 2 == 0){
//            System.out.println("The given number is even ");
//        }
//        else{
//            System.out.println("The given number is odd");
//        }
//    }
//}

//cheching the character is a vowel or consonant
//public class Main {
//
//       void check(char x){
//        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
//            System.out.println("It is an vowel aplhabet");
//        }
//        else{
//            System.out.println("it is a consonant aplhabet");
//        }
//    }
//
//    public static void main(String[] args) {
//           Main obj = new Main();
//           obj.check('x');
//           obj.check('u');
//           obj.check('t');
//           obj.check('w');
//           obj.check('a');
//    }
//}


//Finding the largest number among three numbers
//import java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        Main obj = new Main();
//        System.out.println("Enter the values");
//        int x = in.nextInt();
//        int y = in.nextInt();
//        int z = in.nextInt();
//        obj.checkLargest(x,y,z);
//    }
//    public void checkLargest(int x,int y,int z){
//        if(x>y && x>z){
//            System.out.println(x+" value is the largest number");
//        }
//        else if (y>z) {
//            System.out.println(y+" value is the largest number");
//        }
//        else {
//            System.out.println(z+" value is the largest number");
//        }
//    }
//}