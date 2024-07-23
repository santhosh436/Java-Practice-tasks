

// By Using Class

//public class Animal {
//    String animalName;
//
//}
//class Dog extends Animal{
//    void speak(){
//        System.out.println(animalName +" sounds bow bow");
//    }
//}
//class Puppy extends Dog{
//    String petName;
//    void move(){
//        System.out.println("hi dogs my name is "+ petName);
//    }
//}
//class Cat extends Animal{
//    void speak(){
//        System.out.println(animalName+" sounds meow meow");
//    }
//}
//class Kitten extends Cat{
//    String petName;
//    void move(){
//        System.out.println("hi cats my name is "+petName);
//    }
//}
//class Main{
//    public static void main(String[] args){
//        Puppy ani1 = new Puppy();
//        ani1.animalName = "Dog";
//        ani1.speak();
//        ani1.petName = "Triko";
//        ani1.move();
//        Kitten ani2 = new Kitten();
//        ani2.animalName = "Cat";
//        ani2.speak();
//        ani2.petName = "Tinku";
//        ani2.move();
//
//    }
//}



//By using Interface
interface Animal{
    String animalName1 = "Dog";
    String animalName2 = "Cat";
}
interface Dog extends Animal{
    void speak();
}
class Puppy implements Dog{
    public void speak(){
        System.out.println(animalName1+" sounds boww boww");
    }
    void breed(){
        System.out.println("The dog is a "+ "Labrador Retriever" + " breed dog.");
    }
}
interface Cat extends Animal{
    void speak();
}
class Kitten implements Cat{
   public void speak(){
        System.out.println(animalName2+" sounds meow meow");
    }
    void breed(){
        System.out.println("The cat is a "+ "Ragdoll" + " breed cat.");
    }
}
class Main{
    public static void main(String[] args){
        Puppy ani1 = new Puppy();
        ani1.speak();
        ani1.breed();
        Kitten ani2 = new Kitten();
        ani2.speak();
        ani2.breed();

    }

}





