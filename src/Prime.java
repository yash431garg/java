import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(isprime(number));

    }
    static String isprime(int number){
        if (number <= 1){
            return "Not Prime";
        }
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                System.out.println(i);
                return "Not Prime ";
            }

        }
        return "Prime";
    }

    static void isArmStrong(int number){

    }
}
