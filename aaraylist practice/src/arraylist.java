import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("honda");
        cars.add("volvo");
        cars.add("maruti");
        cars.add("sizuki");
        cars.add("honda");
        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);


    }
}
