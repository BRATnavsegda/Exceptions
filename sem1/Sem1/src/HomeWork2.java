import java.io.FileNotFoundException;
import java.util.*;


public class HomeWork2 {

    /*TASK-1_____________---------------------_________________________

    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных.

     */

    public static float Task1(){
        System.out.println("Enter float number:__ ");
        Scanner input = new Scanner(System.in);
        float num = 0;
        try {
            num = input.nextFloat();
        }
        catch (InputMismatchException e) {
            System.out.println("Need to enter Float!!! number, try again");
            Task1();
        }
        return num;
    }

     /*TASK-2_____________---------------------_________________________

    Если необходимо, исправьте данный код
    (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

      */
    public static void Task2() {
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }
        int[] intArray = {1,2,3,4,5,6,7,8,9,10,55};
        Random rnd = new Random();
        try {
            int d = rnd.nextInt(10);
            int catchedRes1 = intArray[8] / d;
            System.out.println("Divide " + intArray[8] + " and " +d+ " \n catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
            throw e;
        }
    }

    /*TASK-3_____________---------------------_________________________
    Дан следующий код, исправьте его там, где требуется
    (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

    public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

     */

    public static void Task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
            throw ex;
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
            throw ex;
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    /*TASK-4_____________---------------------_________________________
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static String Task4(){
        System.out.println("Enter anything:__ ");
        Scanner input = new Scanner(System.in);
        String result = input.nextLine();
        result = result.trim();
       if (result.isEmpty()){
           throw new RuntimeException("пустые строки вводить нельзя");
       }
       else {
           return result;
       }
    }


    public static void main(String[] args) {

//        Task1()
//        Task2();
//        Task3();
        System.out.println(Task4());
    }
}
