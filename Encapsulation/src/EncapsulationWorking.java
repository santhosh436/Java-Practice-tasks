public class EncapsulationWorking {
    private  String firstName;
    private  int age;
    private  String lastName;

    private String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private void display(){
        System.out.println("My name is santhosh!");
    }
    public static void main(String[] args){
        EncapsulationWorking obj = new EncapsulationWorking();
        obj.setAge(12);
        obj.setFirstName("Santhosh");
        obj.setLastName("Modi");
        System.out.println(obj.getAge());
        System.out.println(obj.getFirstName());
        System.out.println(obj.getLastName());
        obj.display();


    }

}
