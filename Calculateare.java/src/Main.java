//Calculating the area of Circle and Rectangle

//interface Shape{
//    double CalculateArea(double pi,double r);
//}
//class Circle implements Shape{
//    @Override
//    public double CalculateArea(double pi,double r) {
//        return pi*Math.pow(r,2);
//    }
//}
//class Rectangle implements Shape{
//    @Override
//    public double CalculateArea(double l, double w) {
//        return l*w;
//    }
//}
//class Main{
//    public static void main(String[] args){
//        Shape crl = new Circle();
//        System.out.println(crl.CalculateArea(3.14,5));
//        Shape rec = new Rectangle();
//        System.out.println(rec.CalculateArea(5,6));
//    }
//}

//Displaying the Eat method in their individual class objects

//class Animal{
//    void Eat( String AnimalType){
//        if(AnimalType == "Herbivores"){
//            System.out.println("it is a Herbivores type living beings");
//
//        }
//        else if (AnimalType == "Carbivores"){
//            System.out.println(" it is a Carbivores type living beings");
//        }
//        else {
//            System.out.println("it is a Omnivores type living beings");
//        }
//    }
//}
//class Herbivores extends Animal{
//    @Override
//    void Eat(String FoodType) {
//        System.out.println("Herbivores are the animals which eats only " +FoodType);
//    }
//    void Example(){
//        System.out.println("Example of Herbivore animals: ");
//        System.out.println("deer\n"+"cow\n"+"goat");
//    }
//}
//class Carnivores extends Animal{
//    @Override
//    void Eat(String FootType) {
//        System.out.println("Carnivores are the animals which eats only " + FootType);
//    }
//    void Example(){
//        System.out.println("Example of Carnivores animals: ");
//        System.out.println("Lion\n"+"Tiger\n"+"Fox");
//    }
//}
//class Omnivores extends Animal {
//    @Override
//    void Eat(String FoodType) {
//        System.out.println("Omnivores are the animals which  eats both " + FoodType);
//    }
//
//    void Example() {
//        System.out.println("Examples of Omnivore animals: ");
//        System.out.println("Bears\n" + "Chicken\n" + "Birds\n" + "Humans");
//    }
//}
//class Main{
//    public static void main(String[] args){
//        Animal anis = new Animal();
//        Animal herbi = new Herbivores();
//        Animal Carni = new Carnivores();
//        Animal Omni = new Omnivores();
//        anis.Eat("Herbivores");
//        anis.Eat("Omnivores");
//        System.out.println("------------------------------------------------------------------------------");
//        herbi.Eat("Plants");
//        Carni.Eat("animals");
//        Omni.Eat("Plants and Animals");
//        System.out.println("-------------------------------------------------------------------------------");
//        Herbivores ex1 = new Herbivores();
//        Carnivores ex2 = new Carnivores();
//        Omnivores ex3 = new Omnivores();
//        ex1.Example();
//        System.out.println("-------------------------------------------------------------------------------");
//        ex2.Example();
//        System.out.println("-------------------------------------------------------------------------------");
//        ex3.Example();
//
//    }
//}



//Displaying the location and famous of that location methods in individual class objects

//
//class HilStation{
//    void location(){
//        System.out.println("Finding the location");
//    }
//    void famousof(){
//        System.out.println("Finding the famous of that location");
//    }
//}
//class Manali extends HilStation{
//    @Override
//    void location() {
//        System.out.println("Manali is located in Himachal Pradesh");
//    }
//
//    @Override
//    void famousof() {
//        System.out.println("Manali is famous for Jogini water falls and Hidimba Temple");
//
//    }
//}
//class Mussoorie extends HilStation{
//    @Override
//    void location() {
//        System.out.println("Mussoorie is located in Uttarakhand.");
//    }
//
//    @Override
//    void famousof() {
//        System.out.println("Mussoorie is famous for Kempty water falls and Mussoorie lake");
//    }
//}
//
//class Gulmarg extends HilStation{
//    @Override
//    void location() {
//        System.out.println("Gulmarg is located in Jammu kashmir.");
//    }
//
//    @Override
//    void famousof() {
//        System.out.println("Gulmarg is famous for Gulmarg gondala cable car and afarwat peak");
//    }
//}
//class Main{
//    public static void main(String[] args){
//        HilStation man = new Manali();
//        HilStation mus = new Mussoorie();
//        HilStation gul = new Gulmarg();
//        man.location();
//        man.famousof();
//        System.out.println("----------------------------------------------------------------------");
//        mus.location();
//        mus.famousof();
//        System.out.println("----------------------------------------------------------------------");
//        gul.location();
//        gul.famousof();
//
//
//    }
//}
