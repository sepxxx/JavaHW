package deadline19_12_2;


public class SumMas {
    public static class Resource {
        int[] m = new int[] {5, 3, 5, 3, 4, 4, 3, 2, 5, 4};

        int res=0;
        int i=0;
        synchronized public void sum(){
            if(i<10) {
                res += m[i];
                System.out.println(Thread.currentThread().getName() + " THREAD CUR RES " + res + " I: " + i);
                i++;
                notify();

                if(i!=10) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("InterruptedException перехвачен");
                    }
                }
            }
        }
    }
    private static class SumThread extends Thread {
        Resource r;

        private SumThread(Resource r) {
            this.r = r;
        }

        public void run() {
            while (r.i<10)
                r.sum();
        }
    }


        public static void main(String[] args) throws Exception {
          Resource r = new Resource();
          SumThread t1 = new SumThread(r);
          SumThread t2 = new SumThread(r);
          t1.start();
          t2.start();
          t1.join();
          t2.join();
          System.out.println("RES= " + r.res);
        }

}
