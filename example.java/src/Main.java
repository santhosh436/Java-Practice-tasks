package example.java.src;

class Door{
    String DoorType;
    int DoorLength;
    int DoorBreadth;
    void Hello(){
        System.out.println("Hi mama");
    }

}
class Door1 extends Door{
    Door1(String DoorType,int DoorLength,int DoorBreadth ){
        this.DoorType = DoorType;
        this.DoorLength = DoorLength;
        this.DoorBreadth = DoorBreadth;
    }
    void wooden(){
        System.out.println(DoorType+" is more strong than other doors");
        System.out.println("The door length is "+DoorLength);
        System.out.println("The door breadth is "+DoorBreadth);

    }
    void Iron(){
        System.out.println(DoorType+" is less strong than wooden door");
        System.out.println("The length of the door is "+ DoorLength);
        System.out.println("The breadth of the door is "+DoorBreadth);
    }

    @Override
    void Hello() {
        System.out.println("Namasthey Mama");
    }
}
class Ride{
    public static void main(String[] args){
        Door dor = new Door();
        Door1 dir = new Door1("wooden",23,45);
        Door1 dir1 = new Door1("Iron",34,56);
        dir.wooden();
        System.out.println();
        dir1.Iron();
        System.out.println();
        dor.Hello();
        dir1.Hello();

    }
}
