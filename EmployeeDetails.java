public class EmployeeDetails {
    String name;
    String phoneNumber;
    String address;
    String maritalStatus;
    String joiningDate;
    String jobTitle;

    public EmployeeDetails(String name, String phoneNumber, String address, String maritalStatus, String joiningDate, String jobTitle)
{
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.maritalStatus = maritalStatus;
    this.joiningDate = joiningDate;
    this.jobTitle = jobTitle;
}
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Marital Status: " + maritalStatus);
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Job Title: " + jobTitle);
    }

}