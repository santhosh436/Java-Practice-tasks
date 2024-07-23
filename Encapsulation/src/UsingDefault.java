public class UsingDefault {
    String username;
    int age ;
    void display(){
        System.out.println("My name is "+username+" and my age is "+age);
    }
    public static void main(String[] args){
        UsingDefault obj = new UsingDefault();
        obj.username = "Abhishek";
        obj.age = 19;
//        age = 20 shows error
        obj.display();
    }
}
