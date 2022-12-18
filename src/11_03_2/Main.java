package dealine03_11_2;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = in.nextLine();

        HashMap < Character, Integer > dist = new HashMap < > ();
        for (int i = 0; i < str.length(); i++) {
            if (!dist.containsKey(str.charAt(i)) && Character.isLetter(str.charAt(i)))
                dist.put(str.charAt(i), 1);
            else if(dist.containsKey(str.charAt(i)) && Character.isLetter(str.charAt(i)))
                dist.put(str.charAt(i), dist.get(str.charAt(i)) + 1);
        }

        System.out.println("\nРаспределение букв в тексте:");
        System.out.print(dist);
    }
}