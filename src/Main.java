import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            try {
                System.out.print("Введите размер массива (n): ");
                int n = scanner.nextInt();

                if (n <= 0) {
                    System.out.println("Размер массива должен быть больше нуля.");
                    continue; // Продолжить цикл, если размер массива меньше или равен нулю
                }

                int[] array = new int[n];

                System.out.println("Массив случайных чисел:");
                for (int i = 0; i < n; i++) {
                    array[i] = random.nextInt(100); // Здесь 100 - верхний предел случайных чисел
                    System.out.print(array[i] + " ");
                }

                System.out.println("\nНечётные числа массива:");
                int oddCount = 0;
                for (int i = 0; i < n; i++) {
                    if (array[i] % 2 != 0) {
                        System.out.print(array[i] + " ");
                        oddCount++;
                    }
                }

                System.out.println("\nКоличество нечётных чисел в массиве: " + oddCount);

                System.out.print("Хотите продолжить? (1 - Да, 0 - Нет): ");
                int continueChoice = scanner.nextInt();

                if (continueChoice != 1) {
                    break; // Выход из цикла, если пользователь выбрал "0"
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите корректное число.");
                scanner.nextLine(); // Очистить буфер ввода
            }
        } while (true);

        System.out.println("Программа завершена.");
    }
}
