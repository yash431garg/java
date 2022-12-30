import java.util.Scanner;
public class TicToe {

    public static void main(String[] args) {
        char board[] = {'0','1', '2', '3', '4', '5','6', '7', '8', '9'};
        int player = 1;
        boolean gameover = false;



        while (!gameover){
            System.out.println("Player" +  player + ":");
            Scanner in = new Scanner(System.in);
            int userInput = Integer.parseInt(in.nextLine());  // Read user input
            if(userInput > 9 || userInput < 1 ){
                System.out.println("chose a write box");
            }else{
                if(player == 1){
                    board[userInput] = 'X';
                    player += 1;
                }else{
                    board[userInput] = 'O';
                    player -= 1;
                }
            }
            printBoard(board);
            if ( check_gameover(board) == 1) {
                gameover = true;
                System.out.println("Player" + player + " Won");
            }else if(( check_gameover(board) == 2) ){
                System.out.println("Draw");

            };
        }


    }
    static void printBoard(char[] board){

        System.out.println("+ Tac Tak Toe + ");

        System.out.println("     |     |    ");
        System.out.println(" "+board[1]+"   |  "+board[2]+"  |  "+board[3]+" ");
        System.out.println("_____|_____|____");
        System.out.println("     |     |    ");
        System.out.println(" "+board[4]+"   |  "+board[5]+"  |  "+board[6]+" ");
        System.out.println("_____|_____|____");
        System.out.println("     |     |    ");
        System.out.println(" "+board[7]+"   |  "+board[8]+"  |  "+board[9]+" ");
        System.out.println("     |     |    ");
        System.out.flush();
    }

    static int check_gameover(char board[]){
        if(board[1] == board[2] && board[2] == board[3]){
            return 1;
        }
        if(board[4] == board[5] && board[5] == board[6]){

            return 1;
        }
        if(board[7] == board[8] && board[8] == board[9]){

            return 1;
        }
        if(board[1] == board[3] && board[3] == board[7]){
            return 1;
        }
        if(board[2] == board[5] && board[5] == board[8]){
            return 1;
        }
        if(board[3] == board[6] && board[6] == board[9]){
            return 1;
        }
        if(board[1] == board[5] && board[5] == board[9]){
            return 1;
        }
        if(board[3] == board[5] && board[5] == board[7]){
            return 1;
        }
        for(int i = 0; i < board.length; i++){
            if(board[i] == 'X' || board[i] == 'O'){
                System.out.println("Draw");
               return 2;
            }
        }
    return -1;

    }
}
