import java.util.*;

public class EmployeeBook {
    static Scanner sc = new Scanner(System.in);
    static List<EmployeeDetails> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Create Data");
            System.out.println("2. Update Data");
            System.out.println("3. Search Data");
            System.out.println("4. Display Data");
            System.out.println("5. Exit");
            System.out.print("Choose the option: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: createData(); break;
                case 2: updateData(); break;
                case 3: searchData(); break;
                case 4: displayData(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close(); // Important to close scanner
    }

    static void createData() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Marital Status: ");
        String maritalStatus = sc.nextLine();
        System.out.print("Enter Joining Date: ");
        String joiningDate = sc.nextLine();
        System.out.print("Enter Job Title: ");
        String jobTitle = sc.nextLine();

        EmployeeDetails emp = new EmployeeDetails(name, phone, address, maritalStatus, joiningDate, jobTitle);
        employeeList.add(emp);
        System.out.println("Employee added successfully.");
    }

    static void updateData() {
        System.out.print("Enter Name to Update: ");
        String name = sc.nextLine();
        for (EmployeeDetails emp : employeeList) {
            if (emp.name.equalsIgnoreCase(name)) {
                System.out.print("Enter New Address: ");
                emp.address = sc.nextLine();
                System.out.print("Enter New Phone Number: ");
                emp.phoneNumber = sc.nextLine();
                System.out.println("Data updated.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void searchData() {
        System.out.print("Enter Name to Search: ");
        String name = sc.nextLine();
        for (EmployeeDetails emp : employeeList) {
            if (emp.name.equalsIgnoreCase(name)) {
                emp.display();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void displayData() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (EmployeeDetails emp : employeeList) {
                emp.display();
                System.out.println("--------------------");
            }
        }
    }
}
