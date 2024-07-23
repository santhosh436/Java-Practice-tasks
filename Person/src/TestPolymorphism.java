public class TestPolymorphism {
    public static void main(String[] args){
        Person[] persons = new Person[3];
        persons[0] = new Student("santhosh","Modi",70,21);
        persons[1] = new Student("Abhishek","Modi",70,21);
        persons[2] = new Professor("Abhishek","Modi");
        for(Person person: persons){
            person.Print();
        }
    }
}
