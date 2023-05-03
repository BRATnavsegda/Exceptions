import java.util.Objects;

public class Controller {
    
    public static String[] checkData(String value){
        String[] array = new String[0];


            array = value.split(" ");

            if (array.length != 6) {
                View.printStr("Error ", String.valueOf(View.errors(array.length)));
            }

            else if (array[3].indexOf('.') == -1 || array[3].indexOf('.') != 2 || array[3].length() != 10)  {
                throw new RuntimeException("Birthday must be dd.mm.yyyy");
            }

            else if (!array[5].equals("m") && !array[5].equals("f")) {
                throw new RuntimeException("Sex must be f or m");
            }


        return array;
    }
}
