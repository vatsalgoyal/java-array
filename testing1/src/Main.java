
import java.util.Scanner;
import java.util.ArrayList;


class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        ArrayList<Worker> records= new ArrayList<Worker>(2);

        records.add(new Worker(88, "rahul", "kumar", 45000, "rahul@gmail.com",  "rahulkumar", true));
        records.add(new Worker(89, "raman", "singh", 47000,"raman@gmail.com",  "ramansingh",false));

        System.out.println("Authenticating...");
        System.out.print("Enter you email: ");
        String loginEmail = sc.next();
        System.out.print("Enter your password: ");
        String loginPassword = sc.next();

        Worker loggedInUser = null;
        for (Worker emp : records)
            if (emp.email.equals(loginEmail) && emp.password.equals(loginPassword)) {
                loggedInUser = emp;
                break;
            }

        if(loggedInUser == null) {
            System.out.println("no such user found. exiting");
            return;
        }

        System.out.println("Welcome " + loggedInUser.firstName + "...");
        while(true) {
            System.out.print("Enter your action(add/update/remove/display/displayAll/exit): ");
            String choice = sc.next();

            if (choice.equals("exit"))
                break;

            else if(choice == "add"){
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter first name: ");
                    String firstName = sc.next();
                    System.out.print("Enter last name: ");
                    String lastName = sc.next();
                    System.out.print("Enter the salary: ");
                    float salary = sc.nextFloat();
                    System.out.print("Enter email ID: ");
                    String email = sc.next();
                    System.out.print("Enter your password: ");
                    String password = sc.next();

                    // add a new Worker at the end of array.
                    records.add(new Worker(id, firstName, lastName, salary, email, password, false));
                    break;
                }


                else if (choice == "remove"){
                    System.out.println("Enter ID of Worker to remove: ");
                    int givenId = sc.nextInt();
                    boolean removed = records.removeIf(e -> e.id == givenId);
                    if(removed)
                        System.out.println("Record removed successfully");
                    else
                        System.out.println("no such record found");
                    break;
                }

                else if(choice == "update"){
                    System.out.println("Enter ID of Worker to update: ");
                    int givenId = sc.nextInt();
                    for(Worker emp: records)
                        if (emp.id == givenId) {
                            System.out.println("Enter the field to update (firstName, lastName, email): ");
                            String fieldName = sc.next();
                            System.out.println("Enter the field value: ");
                            String fieldValue = sc.next();
                            emp.updateRecord(fieldName, fieldValue);
                        }
                    break;
                }
                else if(choice == "display") {
                    if (!loggedInUser.isAdmin()) loggedInUser.showDetails();
                    else {
                        System.out.print("Enter Worker ID: ");
                        int givenId = sc.nextInt();
                        boolean found = false;
                        for (Worker e : records)
                            if (e.id == givenId) {
                                e.showDetails();
                                found = true;
                                break;
                            }
                        if (!found)
                            System.out.println("the record was not found");
                    }
                    break;
                }
            else if(choice == "displayAll")
                    {
                        for(Worker e: records) {
                            e.showDetails();
                        }
                        break;
                    }
                    else{
                        System.out.println("Invalid choice.");
                    }
                }
            }

        }


    class Worker {

        final int id;
        String firstName;
        String lastName;
        float salary;

        String email;
        String password;

        boolean admin;
        String[] permissions;


        Worker(int id, String firstName, String lastName, float salary,
               String email,  String password, boolean admin) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
            this.email = email;
            this.password = password;
            this.admin = admin;

            // if admin, give more permissions.
            if (admin) {
                permissions = new String[] {"add", "remove", "update", "display", "displayAll"};
            } else {
                permissions  = new String[] {"display"};
            }
        }


        void showDetails() {
            System.out.println("Full Name: " + this.firstName + " " + this.lastName);
            System.out.println("ID: " + this.id);
            System.out.println("email: " + this.email);
            System.out.println("Salary: " +  this.salary);
            System.out.println("Admin: " + this.admin);
            System.out.println("----");
        }

        boolean isAdmin() {
            return this.admin ? true : false;
        }

        public void updateRecord(String fieldName, String fieldValue) {
            switch(fieldName) {
                case "firstName":
                    this.firstName = fieldValue;
                    break;
                case "lastName":
                    this.lastName = fieldValue;
                    break;
                case "email":
                    this.email = fieldValue;
                default:
                    System.out.printf("That field is not valid. no record updated");
            }
        }
    }

