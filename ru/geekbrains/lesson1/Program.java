package ru.geekbrains.lesson1;

import java.util.Scanner;

public class Program{

    static Scanner scanner = new Scanner(System.in);
     public static void main(String[] args) {
        // printName();
        // task2();
        // String str = "Добро пожаловать на курс по Java";
        // task3(str);

        boolean f = true;
        while(f)
        {
            System.out.println("Укажите номер задачи:");
            System.out.println("Работа с именем:");
            System.out.println("Работа с массивом:");
            System.out.println("Работа со строками:");
            System.out.println("0 - Завершение работы приложения:");
            System.out.print("Введите номер задачи: ");
            int no = Integer.parseInt(scanner.nextLine());

            if (no == 1){
                printName();
            }
            else if (no ==2){
                task2();
            }
            else if (no == 3){
                String str = "Добро пожаловать на курс по Java";
                task3(str);
            }
            else if(no == 0){
             f = false;
            System.out.println("Завершение работы приложения"); 
            }
        }
    }    
 // Написать программу, которая запросит пользователя ввести Имя в консоли.
 // Получит введенную строку и выведет в консоль сообщение "Привет, Имя!"

    public static void printName(){

     
        System.out.print("Укажите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
    }

// Дан массив двоичных чисел, например [1,1,0,1,1,1,0,1] вывести
 // максимальное колличество подряд идущих 1
   
    public static void task2(){
        int max = 0;
        int counter = 0;
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 1;
        array[2] = 0;
        array[3] = 0;
        array[4] = 1;
        int[] array2 = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1};
        for (int e: array2) {
             if (e == 1){
                 counter++;
            }
            else{
                if (counter > max){
                    max = counter;
                }
                 counter = 0;
            }
        }   
    System.out.println("Максимальное кол-во подряд идущих единиц: " + max);
    String str = "sample";
    double index = 12.234344;
    System.out.printf("Максимальное кол-во подряд идущих единиц: %d  %s  %.2f\n", max, str, index, counter, max);
    System.out.printf("Максимальное кол-во подряд идущих единиц: %d\t%s\t%.2f\n", max, str, index, counter, max);
    }


// Во фразе "Добро пожалоать на курс по Java" переставить слова в обратном порядке

    public static void task3(String str){
        String[] words = str.split(" ");

        for (int i = 0, j = 10; i < j; i++, j--){
            System.out.println("i - j: " + i + "-" + j);
        }  

        for (int i = words.length - 1; i >= 0; i--){
            System.out.printf("%s ", words[i]);
        }    
        System.out.println();
    }
}
    
  