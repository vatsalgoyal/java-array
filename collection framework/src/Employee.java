import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void main(String args[]){

        ArrayList<String> emp_name = new ArrayList<String>();
        ArrayList<String> emp_fname = new ArrayList<String>();
        ArrayList<Integer> emp_age = new ArrayList<Integer>();
        Scanner obj = new Scanner(System.in);


        System.out.println("Enter the no of employee you want to add : ");
        int no = obj.nextInt();
            for(int i=0; i<= no; i++) {

                try {
                    System.out.println("enter the name of the employee : ");
                    String name = obj.nextLine();
                    emp_name.add(name);
                }
                catch(Exception e){
                    System.out.println("nothing is entered");
                  break;
                }
                try{
                    System.out.println("enter the fathers name of the employee : ");
                    String fname = obj.nextLine();
                    emp_fname.add(fname);
                }
                catch(Exception e){
                    System.out.println("nothing is entered");
                    break;
                }
                try{
                    System.out.println("enter the age of the employee : ");
                    int age = obj.nextInt();
                    emp_age.add(age);
                }
                catch(Exception e){
                    System.out.println("nothing is entered");
                    break;
                }

            }
        System.out.println("name : " + emp_name + "father name : "+ emp_fname + "age : " + emp_age);



    }
}
