public class Main {
    public static void main(String[] args) {

        long start = System.nanoTime();

        // -------- program --------

        Thread.sleep(3000);

        // -------------------------------

        long duration = (System.nanoTime() - start)/1000000;
        System.out.print(duration + "ms");
    }
}
