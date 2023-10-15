

class Shape {

    public int length;
   
    public int height;
    public int base;

  
}
class Sqaure extends Shape{
    public void area(int height){
        int Area1=height*height;
        System.out.println("area of triangle : " + Area1);
    }
}
class Rectangle extends Shape{
    public void area(int height , int length){
        int Area= length*height;
        System.out.println("area of rectangle : "+ Area);
    }
}

public class AreaOfDiffShape {
    public static void main(String[] args) {
       Sqaure s= new Sqaure();
       
       s.area(5);
       Rectangle r= new Rectangle();
       r.area(5, 8);




    }

    
}
