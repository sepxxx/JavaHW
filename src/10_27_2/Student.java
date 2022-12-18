package dealine27_2;

public class Student extends Human{
    String group_num;

    Student (int id, String FIO, int age, String group_num) {
        super(id,FIO,age);
        this.group_num = group_num;
    }
    @Override
    public void display() {
        System.out.println(this.id + ". "+this.FIO + " -студент (группа:" + this.group_num+")");
    }
}
