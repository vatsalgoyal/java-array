public class Main {
    /* we are creating an array of object
    An array of objects is created like an array of primitive type data items in the following way.

                    Student[] arr = new Student[7]; //student is a user-defined class
 The studentArray contains seven memory spaces each of the size of student class in which the address of seven
 Student objects can be stored. The Student objects have to be instantiated using the constructor of the Student class,
 and their references should be assigned to the array elements in the following way.

                                Student[] arr = new Student[5];*/
    public static void main(String[] args)
    {
        Student arr[] = new Student[5];
        arr[0] = new Student(1,"arun");
        arr[1] = new Student(2,"brown");
        arr[2] = new Student(3,"charls");
        arr[3] = new Student(4,"denny");
        arr[4] = new Student(5,"elizabath");

        for(int i=0; i< arr.length; i++)
        {
            System.out.println("elemts at the " + i + "are as follows :" + arr[i].rollno + "    "+arr[i].name);
        }

    }

}
