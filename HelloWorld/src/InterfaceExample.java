public interface InterfaceExample {
    void print();
}
class Name implements InterfaceExample{

    public void print() {
        System.out.println("my name is vatsal");
    }
}
class Fathername implements InterfaceExample{

    public void print() {
        System.out.println("my father name is anuj");
    }
}
class Main{
    public static void main(String[] args){
        InterfaceExample obj = new Fathername();
        obj.print();
    }
}
