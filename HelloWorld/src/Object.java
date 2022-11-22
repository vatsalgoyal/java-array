interface Vatsal{
    void sing();
    int a=50;
}
interface Vatsal1{
    void dance();
    int a=30;
}
public class Object implements Vatsal,Vatsal1 {

    public void sing() {
        System.out.println("break my heart"+Vatsal.a);

    }

    public void dance() {
        System.out.println("jazz"+Vatsal1.a);

    }

    public static void main(String[] args) {
        Object obj = new Object();
        obj.dance();
        obj.sing();
    }
}