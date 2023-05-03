import java.util.Scanner;

public class View {

    public static int errors(int i) {
        if (i < 6) {
            System.out.println("You need to enter more parameters");
            return -1;
        } else if (i > 6) {
            System.out.println("You need to enter less parameters");
            return -2;
        }
        return 1;
    }

    public static void printStr(String ...values){
        StringBuilder result = new StringBuilder();
        for(String x:values)
            result.append(x);
        System.out.println(result);
    }

    public static String GetData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter data:_");
        return in.nextLine();
    }
}
