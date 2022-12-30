import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        isArm(number);
//        System.out.println(103%10);
    }
    static void isArm(int n){

//        return  ? "Not Arm" : "Not Arm";
        int num = n;

        while (num > 0){
//            System.out.println(num);
           int rem = num%10;
            System.out.println(rem);
            num = num /10;


        }











    }
}
