public class Task1 {
    private static int arrayLength(int[] array){
        if(array.length < 5)
            return -1;
        return array.length;
    }
    public static void main(String[] args) {
        /*int[] array = {1,2,3,4};
        int length = arrayLength(array);
        if(length<0)
            System.err.println("Length of array must be more than five");
        else
            System.out.printf("Length of array: %d",length);         */


        int[] array = {1,2,3,4,55};
        for_task11(task11(55,array));
    }


    /*Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
    Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
    если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
    если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
    если вместо массива пришел null, метод вернет -3
    придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
    Напишите метод, в котором реализуйте взаимодействие с пользователем.
    То есть, этот метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное значение
    и покажет читаемый результат пользователю. Например, если вернулся -2,
    пользователю выведется сообщение: “Искомый элемент не найден”.
    */
    private static int task11(int value, int[] array) {
        if (array == null) {
            return -3;
        } else {
            int i = 0;
            int length = array.length;
            if (length < 5){
                return -1;
            }
            while (i < (length)) {
                if (value == array[i]) {
                    return i;
                }
                i++;
            }
            return -2;
        }
    }
    private static void for_task11(int value){
        switch (value) {
            case -1 -> System.out.println("Array length must be more than 5");
            case -2 -> System.out.println("The value is not in this array");
            case -3 -> System.out.println("Array can't be null");
            default -> System.out.printf("index of your value in this array is %d", value);
        }
    }

}



