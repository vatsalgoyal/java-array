import java.net.SocketOption;
import java.util.*;
public class Hello {
    public int i;

    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("enter the elements of the array : ");
        for(int i=0;i<arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("the entered elemet of the arrays is :");
        for(int i=0; i<arr.length; i++ )
        {
            System.out.println(arr[i]);
        }

                System.out.println("enter the name : " );
                String name = input.nextLine();
        System.out.println("entered name is : " + name);
    }
}
