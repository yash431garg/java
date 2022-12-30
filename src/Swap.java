import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        int arr[] = {2,4 ,5 ,60 , 7};
//        {7, 60, 5, 4, 2}
//        swap(arr, 1,3 );

//        max(arr);
        reverse(arr);
    }

    static void  swap(int[] arr, int ind1, int ind2){
        int num ;
        num =
        arr[ind1];


        arr[ind1] = arr[ind2];
        arr[ind2] = num;
        System.out.println(Arrays.toString(arr));




    }

    static void max(int[] arr){
        int maxnum = arr[0];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++)

            if(arr[j] > maxnum){
                maxnum = arr[j];
            }

        }
        System.out.println(maxnum);




    }
    static void  reverse(int[] arr){
        int end = arr.length -1;
        int start = 0;

        for (int i = 0; i < arr.length; i++){
            if(end > 0){
                int num = arr[end];
                arr[i] = arr[end];
                arr[end] = num;
                end--;
                start++;
            }
            System.out.println(Arrays.toString(arr));


        }




    }

}
