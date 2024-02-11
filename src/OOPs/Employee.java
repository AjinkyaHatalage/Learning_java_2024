package OOPs;

class Employee {
     float salary = 50000;
}
class programmer extends Employee{
    float bonus=90000;

    public static void main(String[] args) {
        // Inheritance
        programmer programmer = new programmer();
        Employee employee = new Employee();
        System.out.println("Programmer Salary :"+ programmer.salary);
        System.out.println("Programmer bonus :"+ programmer.bonus);
        System.out.println("Overall :"+ (programmer.salary + programmer.bonus));

    }

}
