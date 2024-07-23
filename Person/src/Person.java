public class Person {
    private String FirstName;
    private String LastName;


    Person(String FirstName ,String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    void Print(){
        System.out.println("\t"+ FirstName+" "+LastName);
    }
}
