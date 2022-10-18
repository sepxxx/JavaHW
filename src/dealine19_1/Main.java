package dealine19_1;

public class Main {
    public static void main(String[] args) {
        Employee[] sub1;
        sub1 = new Employee[]{};
        Employee e1 = new Employee(6, 1, sub1);

        Employee[] sub2;
        sub2 = new Employee[]{};
        Employee e2 = new Employee(5, 2, sub2);

        Employee[] sub3;
        sub3 = new Employee[]{};
        Employee e3 = new Employee(4, 3, sub3);

        Employee[] sub4;
        sub4 = new Employee[]{};
        Employee e4 = new Employee(3, 4, sub4);

        Employee[] sub5;
        sub5 = new Employee[]{e1, e2, e3, e4};
        Employee e5 = new Employee(10, 5, sub5);

        Employee[] list = new Employee[] {e1,e2,e3,e4, e5};
        Accounting test = new Accounting(list);

        test.main();
    }
}