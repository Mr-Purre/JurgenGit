import jurgen.Counter;
import jurgen.LessonOne;

public class Main {
    public static void main(String[] args) {
        LessonOne lessonOne = new LessonOne();
        Counter evenCounter = new Counter("Четные числа");
        Counter oddCounter = new Counter("Нечетные числа");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenCounter.increment();
            } else {
                oddCounter.increment();
            }
        }

        printCounterValue(evenCounter);

        printCounterValue(oddCounter);

        // Задача #1
        //На месте комментария написать код, который присвоит переменной a значение переменной b и наоборот.
        //Подсказка: можно использовать третью переменную.

        int a = 5;
        int b = 10;
        int c;

        c = a;
        a = b;
        b = c;

        System.out.println("Значение а: " + a + ". Значение b: " + b);

        //Вариант на подумать: реализовать задачу, НЕ используя третью переменную.

        int x = 5;
        int y = 10;

        y -= x;
        x += y;

        System.out.println("Значение x: " + x + ". Значение y: " + y);

        // Задача #2
        //Используя
        //a) Переменную типа String
        //b) несколько переменных типа char
        //c) одну переменную типа char
        //вывести свое имя в консоль.
        //Вывод в консоль с переходом на новую строку:
        //System.out.println(/*ваша переменная*/);
        //Вывод в консоль без перехода на новую строку:
        //System.out.print(/*ваша переменная*/);

        String name = "Jurgen";

        char name0 = 'J';
        char name1 = 'u';
        char name2 = 'r';
        char name3 = 'g';
        char name4 = 'e';
        char name5 = 'n';

        System.out.println(name);

        System.out.print(name0);
        System.out.print(name1);
        System.out.print(name2);
        System.out.print(name3);
        System.out.print(name4);
        System.out.print(name5);

        System.out.print("\n");
        System.out.print(name + "\n");

        System.out.print(name0 + "\n");
        System.out.print(name1 + "\n");
        System.out.print(name2 + "\n");
        System.out.print(name3 + "\n");
        System.out.print(name4 + "\n");
        System.out.print(name5 + "\n");

    }

    static void printCounterValue(Counter counter){
        System.out.printf("%s: %d\n", counter.name, counter.counter);
    }
}