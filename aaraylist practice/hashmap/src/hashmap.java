import java.util.HashMap;

public class hashmap {
    public static void main(String[] args){
        HashMap<String,String> students = new HashMap<String,String>();
        students.put("rahul","london");
        students.put("arun","london");
        students.put("jayent","india");
        students.put("sharad","mombai");
        students.put("varun","bengal");
        System.out.println(students);
        HashMap<Integer, String> cars = new HashMap<Integer, String>();
        cars.put(1,"volvo");
        cars.put(2,"od");
        cars.put(3,"mahindra");
        cars.put(4,"safari");
        cars.put(5,"ronaldo");
        cars.put(6,"swift");
        System.out.println(cars);
        System.out.println("size of the hasmap is  :"+ cars.size());
        if(cars.containsKey(4)){
            String a = cars.get(4);
            System.out.println("value of the key "+ "4 is :" + a);

        }
        cars.remove(5);
        System.out.println(cars);
    }
}
