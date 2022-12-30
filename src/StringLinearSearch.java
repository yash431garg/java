public class StringLinearSearch {
    public static void main(String[] args) {
        String str = "yash";
        char target = 'e';
        System.out.println(search(str, target));
        search(str, target);
        System.out.println(str.charAt(1));

    }

    static boolean search(String str, char target){
        if(str.length() < 0){
            return false;
        }
        for( int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }

        }
        return false;



    };
}
