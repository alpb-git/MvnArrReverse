import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class IndexStorageTest {

    @Test
    public void getEvenNumber() {
        int i = 2;
        IndexStorage indexStorage = new IndexStorage(Main.SIZE);

        int expected = 2;
        int actual = indexStorage.get(i);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getOddNumber() {
        int i = 3;
        IndexStorage indexStorage = new IndexStorage(Main.SIZE);

        int expected = -3;
        int actual = indexStorage.get(i);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverse() {
        IndexStorage indexStorage = new IndexStorage(Main.SIZE);

        int[] expected = new int[] {4, -3, 2, -1, 0};
        int[] actual = indexStorage.reverse();

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}