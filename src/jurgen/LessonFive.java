package jurgen;

import java.util.Scanner;

public class LessonFive {
    public static void main(String[] args) {
//        takeName1();
//        takeName2();
//        takeArray();
        takePrimeNumber();

    }

    static void takeName1(){

        System.out.println("Задача А");

        char[] myNames1 = new char[]{'J', 'u', 'r', 'g', 'e', 'n'};

        for (int i = 0; i < myNames1.length; i++) {
            char name = myNames1[i];
            System.out.print(name + "\n");
        }
    }
    static void takeName2(){

        System.out.println("Задача В");


        char[] myNames2 = new char[]{'J', 'u', 'r', 'g', 'e', 'n'};

        for (int i = 0; i < myNames2.length; i++) {

            String name = "";
            name = name + myNames2[i];
            System.out.print(name + "\n");
        }
    }
    static void takeArray(){

        // Задача 2
        // Создать массив int’ов из 5 элементов. Заполнить его значениями, введенными с клавиатуры.
        // Вывести на экран сумму каждого значения с предыдущим.
        // Предыдущим значением для 0го элемента считать последнее значение массива.
        Scanner sc = new Scanner(System.in);

        int[] numbers;

        numbers = new int[5];

        int sum = 0;


        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
            sum += numbers[i];
            System.out.println(sum);
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[numbers.length - i - 1]);
        }
    }
    static void takePrimeNumber(){
        int[] primeNumber = new int[10];

        for(int i = 2; i <= 12; i++){
            boolean isPrime = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
