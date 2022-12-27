import java.util.Scanner;

// Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n)
// Задача 2. Вычислить n! (произведение чисел от 1 до n)
// Задача 3. Вывести все простые числа от 1 до 1000
// Задача 4. Реализовать простой калькулятор


public class Homework1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1(){
        System.out.println("Введите число n: ");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int sum = 0;
        for (int index = 1; index <= n; index++) {
            sum += index;}
        String res = "Сумма чисел от 1 до " + n + " равна " + sum;
        System.out.println(res);
        iScanner.close();
        }
     
    public static void task2(){
        System.out.println("Введите число n: ");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int prod = 1;
        for (int index = 1; index <= n; index++) {
            prod *= index;}
        String res = "Произведение чисел от 1 до " + n + " равно " + prod;
        System.out.println(res);
        iScanner.close();
        }
    
    public static void task3(){
        String res = "";
        for (int i = 2; i < 1000; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
               if (i % j == 0){
                count++;
                }
            }
            if (count == 0){
                res += i + " ";
            } 
        }
        System.out.println(res);

    }

    public static void task4() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int n1 = iScanner.nextInt();
        System.out.println("Введите второе число: ");
        int n2 = iScanner.nextInt();
        System.out.println("Выберите действие:\n 1 - сложение\n 2 - умножение\n 3 - деление");
        int act = iScanner.nextInt();
        int res = 0;
        if (act == 1) { res = n1 + n2;}
        else if (act == 2) { res = n1 * n2;}
        else if (act == 3) { res = n1 / n2;}
        String res1 = "Ответ: " + res;
        System.out.println(res1);
        iScanner.close();
    }
        
}
