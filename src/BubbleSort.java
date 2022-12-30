import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4,3, 2, 1};
        int[] arr1 = {1,2,3, 4, 5};
        Selection(arr);
        System.out.println(Arrays.toString(arr1));


    }
    static void Selection(int[] arr){
        boolean swap;
        for(int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap = true;
                }
            }
//            if(swap){
//                int tem = arr[j-i];
//                arr[arr.length -1] = tem;
//                arr[j-i] = arr[arr.length -1];
//            }
            if(!swap){
                break;
            }
        }
    }
    static void Bubble(int[] arr){
        boolean swap;
        for(int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tem;
                    swap = true;
                }

            }
            if(!swap){
                break;
            }
        }
    }

}
