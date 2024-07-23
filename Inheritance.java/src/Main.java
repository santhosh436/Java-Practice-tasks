//class SingleInheritance{
//    String Name = "santhosh";
//    int age = 22;
//    String Fathername = "Mallikarjuna";
//
//}
//class Single extends SingleInheritance{
//    void details(){
//        System.out.println("My name is "+Name);
//        System.out.println("MY age is "+age);
//        System.out.println("My father name is "+Fathername);
//    }
//    class Main{
//        public static void main(String[] args){
//            Single data = new Single();
//            SingleInheritance obj = new SingleInheritance();
//            System.out.println(obj.age);
//            data.details();
//        }
//    }
//}


//class MultilevelInheritance{
//    void Cat(String animal){
//        System.out.println(animal+" Sounds meow");
//    }
//}
//class Firstlevel extends MultilevelInheritance{
//    void Dog(String animal){
//        System.out.println(animal+" Sounds bow bow");
//    }
//}
//class Secondlevel extends Firstlevel{
//    void Goat(String animal){
//        System.out.println(animal+ " Sounds meh meh");
//    }
//}
// class Main{
//    public static void main(String[] args){
//        Secondlevel animals = new Secondlevel();
//        animals.Goat("goat");
//        animals.Cat("cat");
//        animals.Dog("dog");
//     }
// }

class HieraricalInheritance{
    String studentName;
    void Trainer(){
        System.out.println("madhusmita medam is our trainer");
    }
}
class FirstLevel extends HieraricalInheritance{
    void Student1(){
        System.out.println("Student1 : Santhosh");
    }
}
class SecondLevel extends HieraricalInheritance{
    void Student2(){
        System.out.println("Student2 : Manisai");
    }
}
class  Main{
    public static void main(String[] args){
        FirstLevel std1 = new FirstLevel();
        std1.studentName = "Santhosh";
        std1.Student1();
        std1.Trainer();
        System.out.println();
        SecondLevel std2 = new SecondLevel();
        std2.Student2();
        std2.Trainer();
    }

}



