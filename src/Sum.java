import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        System.out.println(newsum());
        System.out.println(argssum(5, 7));

    }
    static float newsum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The first number");
        float num1 = in.nextFloat();

        System.out.println("Enter The Second number");
        float num2 = in.nextFloat();

        float result = num1 + num2;

       return result;

    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The first number");
        float num1 = in.nextFloat();

        System.out.println("Enter The Second number");
        float num2 = in.nextFloat();

        float result = num1 + num2;

        System.out.println(result);

    }
    static int argssum(int a, int b){

        int result = a + b;
        return result;
    }
}
