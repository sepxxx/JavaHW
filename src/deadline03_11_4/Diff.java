package deadline03_11_4;

public class Diff {
    int n1;
    int n2;
    int res;

    Diff(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        res = n1 - n2;
    }
    public int Abs() throws NegN {
        if (res < 0)
            throw new NegN("Отрицательное значение под модулем!");
        return res;
    }

}