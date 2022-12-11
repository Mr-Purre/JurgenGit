package jurgen;

import java.util.Scanner;

public class LessonTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Задача 1
        System.out.println("Задача 1");

        double x, y, z, w;

        System.out.print("Введите первое число: " );
        x = sc.nextInt();

        System.out.print("Введите второе число: ");
        y = sc.nextInt();


        z = y * x * (x + y) / (x * x);
        w = 11 * 11 * (11 + 11) / (11 * 11);

        System.out.println("Выражение: z = y * x * (x + y) / (x * x), равно");
        System.out.println(z);

        System.out.println("Выражение: w = 11 * 11 * (11 + 11) / (11 * 11), равно");
        System.out.println(w);

        System.out.println();

        int a, b, c, d;

        System.out.print("Введите первое число: " );
        a = sc.nextInt();
        System.out.print("Введите второе число: ");
        b = sc.nextInt();
        c = b * a * (a + b) / (a * a);
        d = 11 * 11 * (11 + 11) / (11 * 11);

        System.out.println("Выражение: z = y * x * (x + y) / (x * x), равно");
        System.out.println(c);
        System.out.println("Выражение: w = 11 * 11 * (11 + 11) / (11 * 11), равно");
        System.out.println(d);

        System.out.println();

        // Задача 2
        System.out.println("Задача 2");

        int r, t;
        boolean result;

        System.out.print("Введите первое число: " );
        r = sc.nextInt();
        System.out.print("Введите первое число: " );
        t = sc.nextInt();

        result = (r * r * r) > (t * t);
        System.out.print("Результат сравнения (r * r * r) > (t * t): ");

        System.out.println(result);
        System.out.println();


        // Задача 3
        System.out.println("Задача 3");


        int q = 1;
        int e = q++;
        e += q++;

        System.out.println(e);
        System.out.println("Bingo!!!");
    }
}
