public class ArrayIndexStorage extends IndexStorage {

    private int[] arr;

    public ArrayIndexStorage(int[] arr) {
        super(arr.length);
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }

}