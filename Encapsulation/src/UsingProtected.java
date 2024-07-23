public class UsingProtected {
    protected String username;
    protected int year;
    protected void display(){
        System.out.println(username+" "+year);
    }
    public static void main(String[] args){
        UsingProtected obj = new UsingProtected();
        obj.username = "Santhoshj";
        obj.year = 2002;
        obj.display();
    }
}
