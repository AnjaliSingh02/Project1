/*This program will show demo*/


interface A{
    public void method1();
}
class One implements A{
    public void method1()
    {
        System.out.println("Class One method");
    }
}
class Two extends One{
    public void method1()
    {
        System.out.println("Class Two method1");
    }
}
public class Test extends Two{
    public static void main(String[] args)
    {
        A a=new Two();
        a.method1();
    }
    
}

