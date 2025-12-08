package lesson5;
import java.util.Scanner;

public class star_exerc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] a = new int[n][m];

        int current = 0; // число для записи

        for (int i = 0; i < n; i++) {

            // строка чётная - слева направо
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = current;
                    current++;
                }
            } else {
                // строка нечётная - справа налево
                for (int j = m - 1; j >= 0; j--) {
                    a[i][j] = current;
                    current++;
                }
            }
        }

        //  ширина числа - 3 символа
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
