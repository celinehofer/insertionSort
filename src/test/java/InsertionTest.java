import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void sort() {
        int[] listOfNumbers = {0, 9, 4, 6, 2, 8, 5, 1, 7, 3};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Insertion mysort = new Insertion();
        mysort.sort(listOfNumbers);
        assertArrayEquals(expected, listOfNumbers);
    }
}