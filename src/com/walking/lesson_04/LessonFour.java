package com.walking.lesson_04;

import java.util.Scanner;

public class LessonFour {
    public static void main(String[] args) {

        factorial();
        sum();
        rectangle();
        isCompare();
        guessedWrongA();
        guessedWrongB();
    }

    static void factorial(){
        // Задача #1
        // Ввести с клавиатуры целое число. Вывести в консоль его факториал.

        Scanner sc = new Scanner(System.in);

        int count;
        int result = 1;
        System.out.print("Введите число, факториал которого нужно посчитать: ");

        count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            result *= i;
        }
        System.out.println(result);
    }
    static void sum(){
        // Задача #2
        // Ввести с клавиатуры целое число. Вывести в консоль сумму цифр введенного числа.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, чтобы посчитать сумму всех чисел: ");

        int number;
        int summ = 0;

        System.out.println("");
        number = scanner.nextInt();

        for(int i = 1; i <= number; i++){
                summ += i;
            }

        System.out.println(summ);
    }
    static void rectangle(){
//         Задача #3
//         Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
//         Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”. Углы прямоугольника обозначить символом “ “.
//         Каждая единица длины должна обозначаться одним символом “-“, каждая единица ширины – символом “|“.

        Scanner scanner = new Scanner(System.in);
        int x;
        int y;


        System.out.print("Введите ширину: ");
        x = scanner.nextInt();
        System.out.print("Введите высоту: ");
        y = scanner.nextInt();


        do{
            System.out.print(' '); // Ставит пробел

            for(int i = 1; i <= x; i++){
                System.out.print('-'); // Ставит горизонталь

            }
            System.out.println(' '); // Ставит пробел

            for(int g = 1; g <= y; g++){
                System.out.print('|'); // Ставит вертикаль
                for(int j = 1; j <= x; j++){
                    System.out.print(' '); // Ставит пробел
                }
                System.out.println('|'); // Ставит вертикаль
            }
            System.out.print(' '); // Ставит пробел

            for(int i = 1; i <= x; i++){
                System.out.print('-'); // Ставит горизонталь

            }
            System.out.println(' '); // Ставит пробел
        }
        while(x < 0);
    }
    static void isCompare(){
        // Задача 4
        // Ввести с клавиатуры целое число (Число 2). Для каждого из чисел от 1 до 10 выполнить:
        //
        // Если число1 четное, вывести сумму двух чисел (пр.1), если нет - разность(пр.2). Также если числа равны - вывести надпись "числа равны!".
        //
        //пр1.: "Число1 + Число2 = Сумма", где число1 - значение 1го числа (от 1 до 10), число2 - значение введенного с клавиатуры числа, Сумма - результат сложения.
        //
        //пр2.: "Число1 - Число2 = Разность", где число1 - значение 1го числа (от 1 до 10), число2 - значение введенного с клавиатуры числа, Разность - результат вычитания.
        Scanner scanner = new Scanner(System.in);

        int rand;

        System.out.println("Введите число");
        rand = scanner.nextInt();

        System.out.println();

        for(int i = 1; i <= 10; i++){
            if(i % 2 == 1){
                System.out.println("Число : " + i);
                System.out.println(i - rand + "\n");
            }
            if(i % 2 == 0 ^ i == rand){
                System.out.println("Число : " + i);
                System.out.println(i + rand + "\n");
            }
            if(i == rand){
                System.out.println("Число : " + i);
                System.out.println("Числа равны!" + "\n");
            }
        }
    }
    static void guessedWrongA(){
        // Задача 5
        // Выводить на экран "Не угадал!" до тех пор, пока с клавиатуры не будет введено число 1. Запрашивать число с клавиатуры:
        //
        //Вариант 1: перед выводом на экран "Не угадал!"
        //
        //Вариант 2: после вывода на экран "Не угадал!"
        //
        //Подумать, где стоило бы использовать цикл do-while, а где – нет.
        //int num;

//         Вариант A
        Scanner scanner = new Scanner(System.in);

        int num;
        boolean isNumber = true;

        while (isNumber){
            System.out.print("Введите число: ");
            num = scanner.nextInt();



            if(num != 1){
                System.out.println("Не угадал!");
                isNumber = true;
            }
            else{
                System.out.println("Угадал!");
                isNumber = false;
            }

        }
    }
    static void guessedWrongB(){
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        boolean isNumber = true;


        do {
            if(num == 0){
                System.out.println("Не угадал!");
            }

            System.out.print("Введите число: ");
            num = scanner.nextInt();

            if(num != 1){
                System.out.println("Не угадал");
                isNumber = true;
            }

            if(num == 1){
                System.out.println("Угадал!");
                isNumber = false;
            }
        }
        while (isNumber);
    }
}
