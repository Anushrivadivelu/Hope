package day20;
interface Test{
    public void show();
}
interface Add{
    public void show(int a , int b);
}
public class InterfaceImplementation {
    public static void main(String[] args) {
        Test t = () -> System.out.println("lambda expression ");
        t.show();
        Add t1 = (a,b) -> System.out.println("Lambda interface" + (a+b));
        t1.show(5, 10);
    }
}
