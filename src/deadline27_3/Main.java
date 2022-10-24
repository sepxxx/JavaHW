package deadline27_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//        HashSet HashSet будет хранить элементы так, как ему удобно, но зато быстро ищет.
//        LinkedHashSet будет хранить элементы в порядке добавления, но зато работает медленнее.
//        TreeSet хранит элементы отсортированными.
public class Main {
    public static void main(String[] args){
        HashSet<Integer> myHashSet1 = new HashSet<Integer>();
        TreeSet<Integer> myTreeSet = new TreeSet<Integer>();
        LinkedHashSet<Integer> myLinkedHashSet = new LinkedHashSet<Integer>();
        for (int i = 5; i < 56; i++)
            myHashSet1.add(i);
        for (int i = 5; i < 56; i++)
            myTreeSet.add(i);
        for (int i = 5; i < 56; i++)
            myLinkedHashSet.add(i);
        System.out.println("myHashSet1: "+myHashSet1);
        System.out.println("myTreeSet: "+myTreeSet);
        System.out.println("myLinkedHashSet: "+myLinkedHashSet);

        ArrayList<Integer> m = new ArrayList<>();
        m.add(7);
        m.add(22);
        m.add(34);
        m.add(11);
        HashSet<Integer> myHashSet2 = new HashSet<Integer>(m);

        System.out.println("Проверяем содержит ли myTreeSet myHashSet2: ");
        String res = (myTreeSet.containsAll(myHashSet2)) ? "Содержит!" : "Не содержит!";
        System.out.println(res);

        System.out.println("Удаляем из myTreeSet myHashSet2");
        myTreeSet.removeAll(myHashSet2);
        System.out.println("Результат: ");
        System.out.println(myTreeSet);
    }
}
