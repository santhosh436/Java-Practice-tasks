interface GrandParent{
    String course = "java fullstack";
    int count = 8;

}
interface Parent1 extends GrandParent{
    String name = "Santhosh";
    void Student1();
}
interface Parent2 extends GrandParent{
    String name = "Johny";
    void Student2();
}

public class Main {
    public static void main(String[] args) {

        Child objChild = new Child();
        objChild.Student1();
        objChild.Student2();
    }
}