public class Database {
    public static void main(String[] args) {
        Employee employeeOne = new Employee(2, "Dinesh A", "Testing");
        Employee employeeTwo = new Employee(3, "Narmatha", "Designer");
        Employee employeeThree = new Employee(4, "Arun", "Developer");



//        employeeOne.setId(011);
//        employeeOne.setName("Dinesh");
//        employeeOne.setRole("Testing");
        employeeOne.setPhone(950829);
        employeeOne.setEmail("dinesh@gmail.com");
        employeeOne.showEmployeeDetails();

//        employeeTwo.setId(012);
//        employeeTwo.setName("Harsha");
//        employeeTwo.setRole("Developer");
        employeeTwo.setPhone(656782);
        employeeTwo.setEmail("harsha@gmail.com");
        employeeTwo.showEmployeeDetails();

//        employeeThree.setId(013);
//        employeeThree.setName("Dhanush");
//        employeeThree.setRole("Developer");
        employeeThree.setPhone(867754898);
        employeeThree.setEmail("dhanush@gamil.com");
        employeeThree.showEmployeeDetails();

    }
}
