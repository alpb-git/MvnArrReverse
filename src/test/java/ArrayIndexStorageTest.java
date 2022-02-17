import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayIndexStorageTest {

    @Test
    public void size() {
        int i = 1;
        Assertions.assertEquals(i, new ArrayIndexStorage(new int[]{i}).get(0));
    }

}