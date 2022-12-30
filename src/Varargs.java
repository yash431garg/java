import java.lang.reflect.Array;
import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        func(1, 2, 3, 5);

    }
    static void func(int ...x){
        System.out.println(Arrays.toString(x));
//        System.out.println(x);
    }
}
