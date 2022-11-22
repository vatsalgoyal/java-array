public class Test {
    public static void main(String[] args){
    Employee E =new Employee("vatsal");
        System.out.println("employee naem is : "+ E.name);;
    }
}
final class Employee{
final String name;

    Employee(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}