package deadline27_1;

import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Pet> petList = new LinkedList<>();
        Pet p1 = new Pet(3, "dog");
        Pet p2 = new Pet(4, "cat");
        Pet p3 = new Pet(2, "minipig");
        Pet p4 = new Pet(8, "snake");
        petList.add(p1);
        petList.add(p2);
        petList.add(p3);
        petList.add(p4);
        System.out.println("Коллекция :"+petList);

        System.out.println("Первый: "+ petList.peekFirst());
        System.out.println("Последний: "+petList.peekLast());

        System.out.println("Убрали последнего: " + petList.pollLast());
        System.out.println("Результат :"+petList);

        System.out.println("Убрали первого: " + petList.pollFirst());
        System.out.println("Результат :"+petList);

        System.out.println("Убрали головной элемент: " + petList.poll());
        System.out.println("Результат :"+petList);

        petList.addFirst(p4);
        System.out.println("Addfirst Результат :"+petList);

        petList.offer(p3);
        System.out.println("offer Результат :"+petList);

        petList.offer(p2);
        System.out.println("offer Результат :"+petList);

    }

}
