import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {


        int arr[] = {-2, 4, 6, 7, 9, 11, 12, 14};
        int arr1[] ={13, 12,9,  5, 4, 3, 1,0 };
        int arr2D[][] =  {{3,8,11}, {4, 9, 12}, {5, 10, 15}};
        int arrSort2D[][] =  {{1,2,3}, {4, 5, 6}, {7, 8, 9}};
        int target =8;
        System.out.println(Arrays.toString(binarySearchSort2D(arrSort2D, target)));
//        System.out.println(Arrays.toString(binarySearchFor2D(arrSort2D, 9, 2, 0, 2)));
//         System.out.println(binarySearch(arr1, target));

    }



    static int[] binarySearchSort2D(int arr[][], int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }
        int start= 0;
        int endRow = arr.length -1;
        int endCol = arr[0].length -1;

        int midCol = endCol /2;
        while(start < (endRow -1)){
            int midRow = start + (endCol + start )/2;
            if(arr[midRow][midCol] == target){
                return new int[]{midCol, midRow};
            }else if(arr[midRow][midCol] < target){
                endRow = midRow;
            }else{
                start = midRow;
            }
        }
        if( arr[start][midCol]  == target){
            return new int[]{start, midCol};
        }if (arr[start + 1][midCol]  == target)
        {
            return new int[]{start + 1, midCol};
        }

        if(arr[start][midCol] > target){
            binarySearchFor2D(arr, target, start, 0, midCol -1);
        }
        if(arr[start][midCol] < target){
            binarySearchFor2D(arr, target, start, midCol + 1, endCol);
        }

        if(arr[start + 1][midCol] < target){
            binarySearchFor2D(arr, target, start + 1, midCol + 1, endCol);
        }
        if(arr[start+ 1][midCol] > target){
            binarySearchFor2D(arr, target, start +1, midCol + 1, endCol);
        }
        return new int[]{-1, -1};
    }





    static int[] binarySearchFor2D(int arr[][], int target,int row, int cStart,int cEnd ){
        while(cStart <= cEnd){
            int mid =  (cEnd + cStart)/2;
            if(arr[row][mid] ==target){
                return new int[]{row, mid};
            }
           else if( arr[row][mid] < target){
                cStart++;
            }else{
                cEnd--;
            }
        }
        return  new int[]{-1, -1};
    }




    static int binarySearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start= 0;
        int end = arr.length-1;

        while(start <= end ){
            int mid = (start + end )/2;
            if(arr[end] > arr[start]){

                if( arr[mid] == target){
                    return mid;
                }else if(arr[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }else{
                if( arr[mid] == target){
                    return mid;
                }else if(arr[mid] > target){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }
        }



        return -1;
    }
    static int[] binarySearch2D(int arr[][], int target) {
        if (arr.length == 0) {
            return new int[]{-1};
        }
        int start= 0;
        int end = arr.length -1;

        while(start <= end ){

            if(arr[start][end] == target){
                return new int[]{start,end};
            }else if(arr[start][end] > target){
                end = end -1;
            }else{
                start = start + 1;
            }

        }



        return new int[]{-1};
    }
    static int binaryLetterSearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }

        int start= 0;
        int end = arr.length-1;

        while(start <= end ){
            int mid = (start + end )/2;
            if(arr[end] > arr[start]){

                if( arr[mid] == target){
                    return mid;
                }else if(arr[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }else{
                if( arr[mid] == target){
                    return mid ;
                }else if(arr[mid] > target){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }
        }



        return -1;
    }

}
