
public class WrapperClass {
    public static void main(String[] args) {
        //boxing refere to storing primitive value into primitive object...........
        int num=4;
        Integer num1= new Integer(num);  // boxing  and concept called wrapper class.........
        
        System.out.println(num1);

        Integer num2 = num;                //autoboxing
        System.out.println(num2);

        int num3=num1.intValue();           //unboxing......
        System.out.println(num3);

        int num4= num1;
        System.out.println(num4);     //autoUnboxing

       
    }
    
}
