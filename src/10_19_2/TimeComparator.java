package dealine19_2;
import java.util.Comparator;
public class TimeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2)
    {
        if (s1.time == s2.time) {
            return 0;
        } else if (s1.time < s2.time) {
            return -1;
        } else {
            return 1;
        }
    }
}
