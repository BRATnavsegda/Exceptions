
import java.util.*;

public class HomeWorkTask1 {

    /* --------------------____________________________________------------------------------
    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения */
    public static int DivideByZero(){
        int a = 10;
        int b = 0;
        return a / b;
    }

    public static int IndexOut(){
        int[] array = {1,2,3,4,5,6};
        int sum = 0;
        for (int i = 0; i <= array.length ; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void ArrayStore(){
        Object x[] = new String[3];
        x[0] = Integer.valueOf(0);
    }
    public static void main(String[] args) {
        // 1 метод - ArithmeticException
//        System.out.println(DivideByZero());
        // 2 метод - ArrayIndexOutOfBoundsException
//        System.out.println(IndexOut());
        // 3 метод - ArrayStoreException
//        ArrayStore();



        /* _______________---------------------------_____________________________
         Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
    1) NumberFormatException
    2) ArrayIndexOutOfBoundsException */



        /* -----------------------------______________________________-------------------------------
        Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
        и возвращающий новый массив, каждый элемент которого равен разности элементов
        двух входящих массивов в той же ячейке. Если длины массивов не равны,
        необходимо как-то оповестить пользователя.
         */

//        int [] arr1 = {2,2,3,4};
//        int [] arr2 = {1,1,1,1};
//        System.out.println(Arrays.toString(Task3(arr1, arr2)));


        /*__________________________________----------------------------__________________________________
         * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
         * и возвращающий новый массив, каждый элемент которого равен
         * частному элементов двух входящих массивов в той же ячейке.
         * Если длины массивов не равны, необходимо как-то оповестить пользователя.
         * Важно: При выполнении метода единственное исключение,
         * которое пользователь может увидеть - RuntimeException, т.е. ваше.
         */
        int [] arr1 = {2,2,3,4,5};
        int [] arr2 = {1,1,0,2};
        System.out.println(Arrays.toString(Task4(arr1, arr2)));
    }

    public static int[] Task3(int[] arr1, int[] arr2){

        int[] res = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("array lengths are not equal");
        }
        else {

            for (int i = 0; i < arr1.length; i++) {
                res[i] = arr1[i] - arr2[i];
            }
        }
        return res;
    }

    public static int[] Task4(int[] arr1, int[] arr2) {

        int[] res = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("array lengths are not equal");
        }
        else {

            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] == 0 ) {
                    throw new RuntimeException("/ by zero");
                }
                else {
                    res[i] = arr1[i] / arr2[i];
                }
            }
        }
        return res;
    }



}
