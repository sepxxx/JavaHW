package dealine19_2;
import java.util.ArrayList;
public class Results {
    ArrayList<Student> students;
    Results ( ArrayList<Student> students) {
        this.students = students;
    }
    public void sortByTime(int fl) {
        TimeComparator myTimeComparator = new TimeComparator();
        if (fl==1)
            this.students.sort(myTimeComparator);
        else if (fl==2)
            this.students.sort(myTimeComparator.reversed());
    }

    public void findWinner() {
        TimeComparator myTimeComparator = new TimeComparator();
            this.students.sort(myTimeComparator.reversed());
        Student e = this.students.get(this.students.size() - 1);
        System.out.println("\nWinner id: " + e.s_id + " time: " +e.time);
    }

    public void findTop() {
        TimeComparator myTimeComparator = new TimeComparator();
        this.students.sort(myTimeComparator.reversed());
        int size = this.students.size();
        Student e1 = this.students.get(size - 1);
        Student e2 = this.students.get(size - 2);
        Student e3 = this.students.get(size - 3);
        System.out.println("\nTop: ");
        System.out.println("Top 1 id: " + e1.s_id + " time: " +e1.time);
        System.out.println("Top 2 id: " + e2.s_id + " time: " +e2.time);
        System.out.println("Top 3 id: " + e3.s_id + " time: " +e3.time);

    }

    public void analyse() {
        double sum = 0;
        for (Student s: this.students) {
            sum+= s.time;
        }
        System.out.println("\nAverage time: " + sum/this.students.size());
        System.out.println("Number of participants: " + this.students.size());
    }
}
