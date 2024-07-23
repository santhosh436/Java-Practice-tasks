abstract class Shape {
    String color = "red";
     abstract double area();
     public abstract String toString();
     public String getColor(){
         return color;
     }

}
class Circle extends Shape{
    double radius = 2;

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}
class Rectangle extends Shape{
    double length = 4;
    double breadth = 5;
    @Override
    double area() {
        return length*breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}
class Main{
    public static void main(String[] args){
        Rectangle obj1 = new Rectangle();
        System.out.println(obj1.area());
        System.out.println(obj1.toString());
        System.out.println(obj1.getColor());
        System.out.println();
        Circle obj2 = new Circle();
        System.out.println(obj2.area());
        System.out.println(obj2.toString());
        System.out.println(obj2.getColor());
    }
}