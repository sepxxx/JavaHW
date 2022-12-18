package deadline03_11_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите числа для вычисления модуля разности:");
        n1 = in.nextInt();
        n2 = in.nextInt();

        Diff d = new Diff(n1, n2);
        try {
            System.out.println("Модуль разности = " + d.Abs());
        }
        catch (NegN e) {
            System.out.println(e.getMessage());
        }
    }
}