package deadline03_11_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double lb, ub;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите нижнюю границу:");
        lb = in.nextDouble();
        System.out.print("Введите верхнюю границу:");
        ub = in.nextDouble();
        System.out.println("Введите 10 чисел:");
        Range r = new Range(lb, ub);
        for (int i = 0; i < 10; i++) {
            try {
                r.Num();
            }
            catch (Lexc | Oexc e) {
                System.out.println(e.getMessage());
            }
        }
    }
}