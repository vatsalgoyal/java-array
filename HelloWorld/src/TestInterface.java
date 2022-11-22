interface TestInterface {
    void print();
    default void name(){
        System.out.println("my name is vatsal");
    }
}
interface Test extends TestInterface{
     void address();
}
class Testing implements Test{

    public void print() {
        System.out.println(" the place is cool");
    }

    public void address() {
        System.out.println(" the address is 3rd road in mumbai");
    }
    public static void main(String[] args){
        Test obj = new Testing();
        obj.name();
        obj.address();
        obj.print();
    }
}
