public class Matrix {
    final private long[][] matrix;

    public Matrix() {
        final long[][] defaultMatrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        this.matrix = defaultMatrix;
    }

    public Matrix(long[][] inMatrix) {
        this.matrix = inMatrix;
    }

    public long[][] multiplyBy(int a) {
        for (int row = 0; row < this.matrix.length; row++) {
            for (int i = 0; i < this.matrix[row].length; i++) {
                this.matrix[row][i] *= a;
            }
        }

        return this.matrix;
    }

    public long sumRowMax() {
        long sum = 0;

        for (long[] row : this.matrix) {
            long max = Long.MIN_VALUE;
            for (long i : row) {
                if (i > max) {
                    max = i;
                }
            }
            sum = Math.addExact(sum, max);
        }

        return sum;
    }

    public long[][] getMatrix() {
        return this.matrix;
    }
}
