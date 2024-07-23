class Professor extends Person{

    Professor(String Firstname,String LastName){
        super(Firstname,LastName);
    }

    @Override
    void Print() {
        System.out.println("Professor Details:");
        super.Print();
    }
}
