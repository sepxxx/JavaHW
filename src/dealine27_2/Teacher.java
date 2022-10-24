package dealine27_2;

public class Teacher extends Human{
    String department;

    Teacher (int id, String FIO, int age, String department) {
        super(id, FIO, age);
        this.department = department;
    }
    @Override
    public void display() {
        System.out.println(this.id + ". "+this.FIO + " -преподаватель (кафедра:" + this.department+")");
    }
}
