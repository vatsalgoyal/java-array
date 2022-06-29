import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args){
        LinkedList<String> friends= new LinkedList<String>();
        friends.add("akash");
        friends.add("arun");
        friends.add("karan");
        friends.add("sahil");
        friends.add("devanshu");
        System.out.println(friends);
        friends.remove(3);
        friends.add(3, "naina");
        System.out.println(friends);
    }
}
