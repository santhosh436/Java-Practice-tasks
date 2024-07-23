public class Student extends Person{

    private int cgpa;
    private int age;

    Student(String FirstName ,String LastName ,int cgpa , int age){
        super(FirstName,LastName);
        this.cgpa = cgpa;
        this.age = age;
    }

    @Override
    void Print() {
        System.out.println("Student details:");
        super.Print();
        System.out.println("\t"+ "cgpa:"+cgpa);
        System.out.println("\t"+ "age:"+age);
    }

}
