import java.util.Scanner;

public class Mutidemensional {
    public static void main(String[] args)
    {
        int arr[][]= new int[3][4];
        Scanner input = new Scanner(System.in);

        for(int i=0; i<3; i++){
            System.out.print("enter the "+i+ "row elemen : ");
            for(int j=0; j<4; j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("the elements of the 2d arrays are : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
