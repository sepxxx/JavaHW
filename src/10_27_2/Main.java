package dealine27_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Main {
    public static void main (String[] args) {
        ArrayList<Human> list = new ArrayList<>();
        Student s1 = new Student(1,"Абрамова Ника Сергеевна",19, "09-012");
        Student s2 = new Student(2,"Бычков Александр Тимофеевич",22, "09-011");
        Student s3 = new Student(3,"Вишневский Владимир Ильич",19, "09-013");
        Student s4 = new Student(4,"Лазарев Пётр Максимович",18, "09-011");
        Student s5 = new Student(5,"Макарова Полина Максимовна",19, "09-012");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Teacher t1 = new Teacher(1,"Яковлев Фёдор Даниилович", 33, "КАДИО");
        Teacher t2 = new Teacher(2,"Снегирев Лев Фёдорович", 38, "КТК");
        Teacher t3 = new Teacher(3,"Пономарева София Лукинична", 44, "КТК");
        list.add(t1);
        list.add(t2);
        list.add(t3);
        System.out.println(list);

        Comparator<Human> H_FIO_C = new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.FIO.compareTo(o2.FIO);
            }
        };
        Comparator<Human> H_AGE_C = new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                if (o1.age == o2.age) {
                    return 0;
                } else {
                    return o1.age < o2.age ? -1 : 1;
                }
            }
        };

        list.sort(H_FIO_C);
        for (Human h: list)
            h.display();

        System.out.println("Человек с макс возрастом");
        Human h1 = Collections.max(list, H_AGE_C);
        h1.display();
        System.out.println("Человек с мин возрастом");
        Human h2 = Collections.min(list, H_AGE_C);
        h2.display();

    }
}
