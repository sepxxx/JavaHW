package deadline20_1;

public class Employee implements Comparable<Employee> {
    String name;
    String position;
    int salary;
    Employee (String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee anotherEmployee)
    {
        if (this.salary == anotherEmployee.salary) {
            return 0;
        } else if (this.salary < anotherEmployee.salary) {
            return -1;
        } else {
            return 1;
        }
    }

}
