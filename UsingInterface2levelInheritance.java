interface College{

    void Branches();

}
interface Computer extends College{
    public default void Branches(){
        System.out.println("we study in CSE branch..");
    }
}
interface EIT extends Computer{
    void sub();
    void java();
}
class Java implements EIT{
    public void sub(){
        System.out.println("EIT subject is based on design and coding");
    }
    public void java(){
        System.out.println(" java is used to design and code");
    }
   
}
public class UsingInterface2levelInheritance {
    public static void main(String[] args) {
        Java j = new Java();
        j.Branches();
        j.sub();
        j.java();
    }
    
}
