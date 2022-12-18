package dealine19_2;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> myStudentArrayList = new ArrayList<Student>();

        Student firstStudent = new Student(1, 222);
        Student secondStudent = new Student(2, 111);
        Student thirdStudent = new Student(3, 333);

        myStudentArrayList.add(firstStudent);
        myStudentArrayList.add(secondStudent);
        myStudentArrayList.add(thirdStudent);

        for (Student s: myStudentArrayList) {
            System.out.println("Student id: " + s.s_id + " time: " + s.time);
        }

        Results results = new Results(myStudentArrayList);

        results.sortByTime(1);
        System.out.println("Sorted asc:");
        for (Student s: myStudentArrayList) {
            System.out.println("Student id: " + s.s_id + " time: " + s.time);
        }

        results.sortByTime(2);
        System.out.println("Sorted desc:");
        for (Student s: myStudentArrayList) {
            System.out.println("Student id: " + s.s_id + " time: " + s.time);
        }

        results.findWinner();

        results.findTop();

        results.analyse();



    }
}