import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void multiplyBy() {
        Matrix matrix = new Matrix();
        int a = 2;
        long[][] resMatrix = {
                {2, 4, 6, 8, 10},
                {12, 14, 16, 18, 20},
                {22, 24, 26, 28, 30},
                {32, 34, 36, 38, 40},
                {42, 44, 46, 48, 50}};
        long[][] result = matrix.multiplyBy(a);
        assertArrayEquals(resMatrix, result);
    }

    @Test
    void sumRowMax() {
        Matrix matrix = new Matrix();
        long sum = matrix.sumRowMax();
        assertEquals(75, sum);
    }
}