public class Child implements Parent1,Parent2{
    public void Student1(){
        System.out.println("My name is "+Parent1.name+" and my age is "+Parent1.age);
    }
    public void Student2(){
        System.out.println("My name is "+Parent2.name+ " and my age is "+Parent2.age);
    }
}
