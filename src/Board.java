import java.util.Scanner;

public class Board {

    char turn=' ';
    char[][] playingBoard;

    Board(){
        this.playingBoard =new char[3][3];
        turn='O';
        for(int i = 0;i<playingBoard.length;i++){
            for(int j = 0;j<playingBoard[i].length;j++){
                this.playingBoard[i][j]=' ';
            }
        }
    }
    void markCell(int row,int col){
        if(this.playingBoard[row][col]==' '){
            this.playingBoard[row][col]=turn;
            if(turn=='X'){
                turn='O';
            }else{
                turn='X';
            }
        }
        else{
            System.out.println("You have already marked the cell.");
        }

    }

    void printBoard() {

        System.out.println();

        System.out.print(this.playingBoard[0][0]);
        System.out.print("  | ");
        System.out.print(this.playingBoard[0][1]);
        System.out.print(" | ");
        System.out.print(this.playingBoard[0][2]);
        System.out.println();
        System.out.print("---|---|---");
        System.out.println();
        System.out.print(this.playingBoard[1][0]);
        System.out.print("  | "+this.playingBoard[1][1]);
        System.out.print(" | "+this.playingBoard[1][2]+" ");
        System.out.println();
        System.out.print("---|---|---");
        System.out.println();
        System.out.print(this.playingBoard[2][0]);
        System.out.print("  | ");
        System.out.print(this.playingBoard[2][1]);
        System.out.print(" | "+this.playingBoard[2][2]);
        System.out.println();

    }

    boolean checkWinner(char symbol){

        if(playingBoard[0][0]==symbol&&playingBoard[0][1]==symbol&&playingBoard[0][2]==symbol){
           return true;
        }
        else if(playingBoard[1][0]==symbol&&playingBoard[1][1]==symbol&&playingBoard[1][2]==symbol){
            return true;
        }else if(playingBoard[2][0]==symbol&&playingBoard[2][1]==symbol&&playingBoard[2][2]==symbol){
            return true;
        }else if(playingBoard[0][0]==symbol&&playingBoard[1][0]==symbol&&playingBoard[2][0]==symbol){
            return true;
        }else if(playingBoard[0][1]==symbol&&playingBoard[1][1]==symbol&&playingBoard[2][1]==symbol){
            return true;
        }
        else if(playingBoard[0][2]==symbol&&playingBoard[1][2]==symbol&&playingBoard[2][2]==symbol){
            return true;
        }
        else if(playingBoard[0][0]==symbol&&playingBoard[1][1]==symbol&&playingBoard[2][2]==symbol){
            return true;
        }
        else if(playingBoard[0][2]==symbol&&playingBoard[1][1]==symbol&&playingBoard[2][0]==symbol){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        Board b =new Board();
        b.printBoard();

        int index =0;
        while(true){

            System.out.print("Please press a button from 1 to 9 using num pad: ");
            int button =sc.nextInt();
            int row;
            int col;
            //---------------------------------------//
            if(button==7){
                row=0;
                col=0;
            }
            else if(button== 8){
                row = 0;
                col=1;
            }
            else if(button== 9){
                row = 0;
                col=2;
            }
            else if(button== 4){
                row = 1;
                col=0;
            }
            else if(button== 5){
                row = 1;
                col=1;
            }
            else if(button== 6){
                row = 1;
                col=2;
            }else if(button== 1){
                row = 2;
                col=0;
            }
            else if(button== 2){
                row = 2;
                col=1;
            }else if(button== 3){
                row = 2;
                col=2;
            }else{
                break;
            }
            index=index+1;
            //---------------------------------------//
            //System.out.print(row+" "+ col);
            b.markCell(row,col);
            b.printBoard();

            if(b.checkWinner('X')){
                System.out.println("Player X is the Winner");
                break;
            }
            else if(b.checkWinner('O')){
                System.out.println("Player O is the Winner");
                break;
            }
            else if(index==9){
                System.out.println("---------------------");
                System.out.println("Try Again: ");
                System.out.println("---------------------");
                break;
            }
        }
    }
}
