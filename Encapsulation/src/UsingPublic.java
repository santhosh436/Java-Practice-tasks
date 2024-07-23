public class UsingPublic {
    public String username;
    public int age;
    public  void display(){
        System.out.println(username+" "+age);
    }
    public static void main(String[] args){
        UsingPublic obj = new UsingPublic();
        obj.age = 12;
        obj.username = "Santhosh";
        obj.display();
    }
}
