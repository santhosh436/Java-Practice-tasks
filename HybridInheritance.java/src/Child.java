public class Child implements Parent1,Parent2 {
    @Override
    public void Student1() {
        System.out.println("my name is "+Parent1.name + " and I am doing the "+course+"and my class contains "+count);
    }

    @Override
    public void Student2() {
        System.out.println(" my name is "+Parent2.name + " and I am doing "+ course+"and my class contains "+ count);
    }
}
