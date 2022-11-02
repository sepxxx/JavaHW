package dealine03_11_1;
import java.util.ArrayList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        int range = 10, arlist_size = 100000;
        ArrayList < Integer > num_arlist = new ArrayList < > ();
        while (num_arlist.size() < arlist_size)
            num_arlist.add((int)(Math.random() * range));

        System.out.println("Диапазон от 0 до " + range + " длиной " + arlist_size + ":");
        System.out.println(num_arlist);
        HashMap < Integer, Integer > dist = new HashMap <> ();
        for (int i = 0; i < num_arlist.size(); i++) {
            if (!dist.containsKey(num_arlist.get(i)))
                dist.put(num_arlist.get(i), 1);
            else
                dist.put(num_arlist.get(i), dist.get(num_arlist.get(i)) + 1);
        }

        System.out.println("\nРаспределение случайных чисел:");
        System.out.print(dist);
    }

}