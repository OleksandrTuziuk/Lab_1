import java.util.Scanner;
public class Main {
    static final Scanner sc = new Scanner(System.in);

    public static long operations(int a, long[][] initialMatrix) {
        long[][] resultMatrix = new long[5][5];

        long sum = 0;
        for (int rowIndex = 0; rowIndex < 5; rowIndex++) {
            long max = Long.MIN_VALUE;
            for (int colIndex = 0; colIndex < 5; colIndex++) {
                resultMatrix[rowIndex][colIndex] = a * initialMatrix[rowIndex][colIndex];
                if (resultMatrix[rowIndex][colIndex] > max) {
                    max = resultMatrix[rowIndex][colIndex];
                }
            }
            sum += max;
        }

        System.out.println("Результуюча матриця:");
        for (long[] rowIndex : resultMatrix) {
            for (long colIndex : rowIndex) {
                System.out.print(colIndex + " ");
            }
            System.out.println();
        }

        return sum;
    }

    public static void main(String[] args) {
        String inputData = "";
        try {
            System.out.print("Введіть число a: ");
            inputData = sc.nextLine();
            int a = Integer.parseInt(inputData);

            long[][] initialMatrix = {
                    {1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 10},
                    {11, 12, 13, 14, 15},
                    {16, 17, 18, 19, 20},
                    {21, 22, 23, 24, 25}};

            System.out.println("Початкова матриця:");
            for (long[] rowIndex : initialMatrix) {
                for (long colIndex : rowIndex) {
                    System.out.print(colIndex + " ");
                }
                System.out.println();
            }

            long sum = operations(a, initialMatrix);

            System.out.println("сума найбільших елементів кожного рядка матриці = " + sum);


        } catch (NumberFormatException e) {
            boolean isNumber = true;
            for (char c : inputData.toCharArray()) {
                if (!Character.isDigit(c)) {
                    isNumber = false;
                    System.out.println("Введені дані не є числом");
                    break;
                }
            }
            if (isNumber) {
                System.out.println("Введене число занадто велике, або занадто мале");
            }
        }
    }
}