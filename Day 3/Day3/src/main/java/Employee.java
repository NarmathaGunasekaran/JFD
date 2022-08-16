public class Employee {
    private int id;
    private String name;
    private String role;
    private long phone;
    private String email;

    public Employee() {

    }
    public Employee( int id, String name, String role){
            this.id = id;
            this.name = name;
            this.role = role;
        }

//    public Employee(int id, String name, String role, long phone, String email) {
//        this.id = id;
//        this.name = name;
//        this.role = role;
//        this.phone = phone;
//        this.email = email;
//    }

        public void showEmployeeDetails () {
            System.out.println("Id : " + id + "\n" + "Name : " + name + "\n" + "Role :" + role + "\n" + "Phone no : " + phone + "\n" + "Email :" + email);
        }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

//    public String getRole() {
//        return role;
//    }

//    public void setRole(String role) {
//        this.role = role;
//    }

        public long getPhone () {
            return phone;
        }

        public void setPhone ( long phone){
            this.phone = phone;
        }

        public String getEmail () {
            return email;
        }

        public void setEmail (String email){
            this.email = email;
        }

    }
