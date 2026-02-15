import java.util.Scanner;
public class Main {
    static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        String inputData = "";
        int a;
        while (true) {
            try {
                System.out.print("Введіть число a: ");
                inputData = SC.nextLine();
                a = Integer.parseInt(inputData);
                break;
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

        final Matrix matrix = new Matrix();

        System.out.println("Початкова матриця:");
        for (long[] rowIndex : matrix.getMatrix()) {
            for (long colIndex : rowIndex) {
                System.out.print(colIndex + " ");
            }
            System.out.println();
        }

        long [][] finalMatrix = matrix.multiplyBy(a);

        System.out.println("Результуюча матриця:");
        for (long[] rowIndex : finalMatrix) {
            for (long colIndex : rowIndex) {
                System.out.print(colIndex + " ");
            }
            System.out.println();
        }
        try {
            final long sum = matrix.sumRowMax();
            System.out.println("сума найбільших елементів кожного рядка матриці = " + sum);
        } catch (ArithmeticException i) {
            System.out.println("Числа занадто великі");
        }
    }
}
