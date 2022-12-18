package dealine27_2;

public class Human {

    int id;
    String FIO;
    int age;

    Human (int id, String FIO, int age) {
        this.id = id;
        this.FIO = FIO;
        this.age = age;
    }

    public void display() {
        System.out.println(this.id + " "+this.FIO + " " + this.age);
    }
}
