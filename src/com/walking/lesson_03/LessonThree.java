package com.walking.lesson_03;

import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {

        example1();
        example2a();
        example2b();
        example3();
        example4();
    }


    static void example1(){
        // Задача 1
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        int x, y;
        System.out.print("Введите первое число: " );
        x = scanner.nextInt();
        System.out.print("Введите второе число: " );
        y = scanner.nextInt();

        scanner.close();

        System.out.println("Проверка первого числа на чётность:" );
        System.out.println();

        if(x % 2 == 0){
            System.out.println("Произведение x * y = " + (x * y) + " Число четное!");
            if(x == y)
                System.out.println("Числа равны!");
        }

        else if(x % 2 == 1){
            System.out.println("Частное x / y = " + (x / y) + " Число не четное!");
            if(x == y)
                System.out.println("Числа равны!");
        }
    }
    static void example2a(){
        // Задача 2 (A)
        Scanner scanner = new Scanner(System.in);
        String st;
        System.out.println("Введите одно из трех слов: Hi, Bye, How are you?");
        st = scanner.nextLine();

        scanner.close();

        if("Hi".equals(st)){
            System.out.println("Hello");
        }
        else if(st.equals("Bye")){
            System.out.println("Good Bye");
        }
        else if(st.equals("How are you?")){
            System.out.println("How are your doing");
        }
        else
            System.out.println("Unknown message");
    }
    static void example2b(){
        // Задача 2 (B)
        Scanner scanner = new Scanner(System.in);
        String st;
        System.out.println("Введите одно из трех слов: Hi, Bye, How are you?");
        st = scanner.nextLine();

        scanner.close();

        switch (st){
            case "Hi":
                System.out.println("Hello");
                break;

            case "Bye":
                System.out.println("Good Bye");
                break;

            case "How are you?":
                System.out.println("How are your doing");
                break;
            default:
                System.out.println("Unknown message");
        }

    }
    static void example3(){
        // Задача 3
        Scanner scanner = new Scanner(System.in);

        String name0;
        String name1;
        String name2;

        System.out.print("Введите Имя: ");
        name0 = scanner.nextLine();

        System.out.print("Введите Отчество: ");
        name1 = scanner.nextLine();

        System.out.print("Введите Фамилию: ");
        name2 = scanner.nextLine();

        scanner.close();

        System.out.println("ФИО: " + name0 + " " + name1 + " " + name2);
        System.out.printf("ФИО: " + name0 + " " + name1 + " " + name2);
    }
    static void example4(){
        // Задача 4
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print("Введите первое число: ");
        number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        number2 = scanner.nextInt();

        scanner.close();

        if ((number1 % 2 == 0) || (number2 % 3 == 0)) {
            System.out.println("Первое число четное или второе число кратно трем! \nРезультат сравнение первого и второго числа: ");
            if (number1 < number2)
                System.out.println(number1 + "<" + number2);
            else
                System.out.println(number1 + ">" + number2);
        }
        if ((number1 % 2 == 0) && (number1 % 3 == 0)) {
            System.out.println("Первое число кратно двум и трем! \nРезультат возведение первого числа в степень, равную второму числу: ");

            double result = Math.pow(number1, number2);

            if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
                System.out.println("Результат выражения слишком большой!");
            } else {
                System.out.println((int) result);
            }
        }
    }
}
