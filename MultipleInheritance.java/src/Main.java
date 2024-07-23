interface Parent1{
    String name = "Santhosh";
    int age = 20;
    void Student1();

}
interface Parent2{
    String name = "Sainadh";
    int age = 21;
    void Student2();
}
public class Main {
    public static void main(String[] args) {

        Child c1 = new Child();
        c1.Student1();
        c1.Student2();
    }
}