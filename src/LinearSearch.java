import org.jetbrains.annotations.Contract;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = new int[]{1045, 23, 3, 4, 67, 500, 35, 550};
        int[][] nums2D = {{1,2,3}, {1, 5,4}, {1,2,5}};
//        int[][] nums2D = {{500, 35, 550}, {1, 2000, 3, 6, 500, 359, 550}, {1333, 2, 6, 500, 35, 550}};
        int target = 359;
        int ans[]  = Array2DNum(nums2D, target);
//        System.out.println(EvenDigits(nums));
//        System.out.println(Arrays.toString(ans));
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Arrays.toString(nums)[4]);
        System.out.println(MaxSalary1(nums2D));









    }
    static int MaxSalary(int[][] arr){
        if(arr.length == 0){
            return -1;

        }
        int salaryAmount = 0;
        int salary[] = new int [arr.length];
        for(int index = 0; index < arr.length; index++){
            for(int index1 = 0; index1 < arr.length; index1++){
                salaryAmount += arr[index][index1];


            }
            salary[index]  =salaryAmount;

        }
        int num = Integer.MIN_VALUE;
        for(int index2 = 0; index2 < arr.length; index2++){
            if(salary[index2] > num) {
                num = salary[index2];

            }
//            return num;


        }
        return num;

    }
    static int MaxSalary1(int[][] arr){
        if(arr.length == 0){
            return -1;

        }
        int salary = 0;
        int salaryAmount = 0;
        for(int index = 0; index < arr.length; index++){
            for(int index1 = 0; index1 < arr.length; index1++){
//                if(arr[index][index1] > salaryAmount){
                    salaryAmount += arr[index][index1];
//                }

            }

            if(salaryAmount > salary){
                salary = salaryAmount;

            }
            salaryAmount = 0;

        }
        return salary;


    }
    static int EvenDigits(int[] arr){
        if(arr.length == 0){
            return -1;

        }
        int num = 0;

        for(int index = 0; index < arr.length; index++){
           if(String.valueOf(arr[index]).length()%2 ==0){
               num++;
            };

        }

        return num;

    }
    static int[] Array2DNum(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1};

        }
        int num = arr[0][0];

        for(int index = 0; index < arr.length; index++){
            for(int index1 = 0; index1 < arr[index].length; index1++) {
                if(arr[index][index1] == target){
                return new int[]{index, index1};
                }



            }

        }
        return new int[]{-1};

    }
    static int Linear(int[] arr, int target){
        if(arr.length == 0){
            return -1;

        }

       for(int index = 0; index < arr.length; index++){
           if(target == arr[index]){
               return index;
           }
       }
        return -1;

    }
    static int MaxNum(int[] arr){
        if(arr.length == 0){
            return -1;

        }
        int num = arr[0];

        for(int index = 0; index < arr.length; index++){

                if(arr[index] > num){
                    num = arr[index];


            }



        }
        return num;

    }

    static int LinearRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;

        }

        for(int index = start; index < end; index++){
            if(target == arr[index]){
                return index;
            }
        }
        return -1;

    }
    @Contract(pure = true)
    static int Linear1(int[] arr, int target){
        if(arr.length == 0){
            return -1;

        }

        for(var element: arr)
            if (target == element) {
                return target;
            }
        return -1;

    }
}
