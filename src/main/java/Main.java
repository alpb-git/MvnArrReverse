public class Main {

    public static final int SIZE = 5;

    public static void main(String[] args) {
        System.out.println("Reverse IndexStorage ...");

        IndexStorage indexStorage = new IndexStorage(SIZE);
        print(indexStorage.reverse());

        System.out.println("Reverse ArrayIndexStorage ...");
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(new int[] { 10, 20, 30, 40});
        print(arrayIndexStorage.reverse());

    }

    public static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d] = %d%n", i, arr[i]);
        }

    }
}