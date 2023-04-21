public class Task2 {
    /* Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
(кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.*/
    public static void main(String[] args) {
        int [][] twoDimArray = {{0,1,1}, {1,0,1}, {0,1,0}};
        System.out.println(task22(twoDimArray));
    }
    private static int task22(int[][] array) {
        if (array.length == array[0].length) {



            int result = 0;
            for (int[] ints : array) {
                for (int anInt : ints) {
                    if (anInt != 0 && anInt != 1){
                        throw new RuntimeException("Each cell can contain only the value 0 or 1");
                    }
                    result = result + anInt;
                }

            }
            return result;
        }
        else{
            throw new RuntimeException("Array is not quad");
        }
    }
}
