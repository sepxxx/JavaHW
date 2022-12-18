package deadline19_12_1;


import java.util.Scanner;

public class SumMas {
    int[] m;
    int sum;
    public SumMas(int n){
        m = new int[n];
    }
    public int sum_part(int istart, int istop) {
        int cursum = 0;
        for (int i = istart; i <= istop & i<m.length; i++) {
            cursum+=m[i];
        }
        return cursum;
    }
    public class myExc extends Exception {
        public myExc() {};
        public myExc(String message) {
            super(message);
        }
    }
    public void check_kn(int k, int n) throws myExc {
        if(k>n)
            throw new myExc("Число потоков больше числа элементов массива");
    }

    public static void main(String[] args) throws Exception{

        int n;// = 10;
        int k;// = 4;
        int istart;
        int istop=-1;

        int last_shift=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = input.nextInt();

        System.out.print("Enter k: ");
        k = input.nextInt();

        int shift = n/k;
        SumMas sm = new SumMas(n);
        sm.sum=0;
        sm.check_kn(k, n);

        System.out.print("Insert array elements:");
        for (int i = 0; i < n; i++) {
            sm.m[i] = input.nextInt();
        }


        System.out.println("SHIFT "+shift);
        System.out.println("LAST SHIFT "+last_shift);
        if(n% k != 0) {
            last_shift = n % k + shift;
        }
        for (int i = 0; i < k; i++) {
            istart = istop+1;

            if(i==k-1&&last_shift!=0)
                istop = istart+last_shift-1;
            else
                istop = istart+shift-1;
            //System.out.println(istart+" "+istop);
            Thread thread = new SumThread(sm, istart, istop);
            thread.start();
            thread.join();
        }

        System.out.println("End balance = " + sm.sum);
    }
    private static class SumThread extends Thread {
        int tsum;
        int istart;
        int istop;
        private final SumMas sm;
        private SumThread(SumMas sm, int istart, int istop) {
            this.sm = sm;
            this.istart = istart;
            this.istop = istop;
        }
        public void run() {
            tsum=sm.sum_part(istart, istop);
            sm.sum+=tsum;
            System.out.println("Cумма потока "+getName()+" : "+tsum);
            System.out.println("Чисел просуммировано в потоке: " + (istop-istart+1));
        }
    }

}
