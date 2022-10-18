package deadline20_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> myEmployees = new ArrayList<>();
        Employee e1 = new Employee("John", "risk director", 3000);
        Employee e2 = new Employee("Alla", "managing director", 2500);
        Employee e3 = new Employee("Genry", "trader", 2777);
        Employee e4 = new Employee("Carl", "chief accountant", 3333);
        Employee e5 = new Employee("Debora", "cashier", 1500);
        myEmployees.add(e1);
        myEmployees.add(e2);
        myEmployees.add(e3);
        myEmployees.add(e4);
        myEmployees.add(e5);

        for (Employee e: myEmployees)
            System.out.println("Employee name: " + e.name + " position: " + e.position + " salary: " + e.salary);

        Collections.sort(myEmployees);

        System.out.println();
        for (Employee e: myEmployees)
            System.out.println("Employee name: " + e.name + " position: " + e.position + " salary: " + e.salary);

        NameComparator nameComparator = new NameComparator();
        myEmployees.sort(nameComparator);

        System.out.println();
        for (Employee e: myEmployees)
            System.out.println("Employee name: " + e.name + " position: " + e.position + " salary: " + e.salary);
    }
}
