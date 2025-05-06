public class Employee {
    String name;
    int id;
    double salary;
    long M_no;

    public Employee(String name, int id, double salary, long M_no) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.M_no = M_no;
    }

    public void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Mobile number: " + M_no); 
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("XYZ", 101, 50000.0, 1098765098); 
        emp1.displayinfo();
    }
}
