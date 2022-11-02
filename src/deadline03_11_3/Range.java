package deadline03_11_3;
import java.util.Scanner;

public class Range {
    double lb;
    double ub;
    double n;
    Range (double lb, double ub) {
        this.lb = lb;
        this.ub = ub;
    }

    public void Num() throws Lexc, Oexc {
        Scanner in = new Scanner(System.in);
        n = in.nextDouble();
        if (n < lb) {
            throw new Lexc("< нижней границы интервала!");
        } else if (n > ub) {
            throw new Oexc("> верхней границы интервала!");
        }
        else System.out.println("в интервале");
    }

}