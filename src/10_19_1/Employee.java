package dealine19_1;

public class Employee {
    int experience;
    int e_id;
    Employee []subordinates;

    Employee (int exp, int id, Employee []sub) {
        this.experience = exp;
        this.e_id = id;
        this.subordinates = sub;
    }
}
