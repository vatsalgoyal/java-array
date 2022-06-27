import java.util.Scanner;

public class Arraycreation {
    public int i;

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("the entered elemet of the arrays is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
