public class EncapsulationExample1 {
    private String employeeName;
    private String mangerName;
    private int salary;

    public EncapsulationExample1(String employeeName, String mangerName, int salary) {
        this.employeeName = employeeName;
        this.mangerName = mangerName;
        this.salary = salary;
    }
    private void display(){
        System.out.println("My name is "+employeeName+" and my manger name is "+mangerName+" and my salary is "+salary);
    }
    public static void main(String[] args){
        EncapsulationExample1 obj = new EncapsulationExample1("santhosh","madhusmitha",12000);
        obj.display();
    }
}
