import java.util.Scanner;

public class Board {

    char[][] playingBoard;

    Board(){
        this.playingBoard =new char[3][3];

        for(int i = 0;i<playingBoard.length;i++){
            for(int j = 0;j<playingBoard[i].length;j++){
                //System.out.print("  ");
                //this.playingBoard[' '][' '];
                this.playingBoard[i][j]=' ';
            }
        }
        //this.playingBoard=playingBoard;
        //this.playingBoard[0][0]='X';
        /*markCell(0,0,'X');
        this.playingBoard[0][1]='O';
        this.playingBoard[0][2]='X';
        this.playingBoard[1][0]='0';
        this.playingBoard[1][1]='X';
        this.playingBoard[1][2]='O';
        this.playingBoard[2][0]='O';
        this.playingBoard[2][1]='O';
        this.playingBoard[2][2]='X';*/
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
        //System.out.print(this.playingBoard[1][0]='0'+"  | ");
        System.out.print(this.playingBoard[1][0]);
        System.out.print("  | "+this.playingBoard[1][1]);
        System.out.print(" | "+this.playingBoard[1][2]+" ");
        //System.out.print(this.playingBoard[1][2]);
        System.out.println();
        System.out.print("---|---|---");
        System.out.println();
        System.out.print(this.playingBoard[2][0]);
        System.out.print("  | ");
        System.out.print(this.playingBoard[2][1]);
        System.out.print(" | "+this.playingBoard[2][2]);
        System.out.println();
    }
    void markCell(int row,int col, char symbol){
        this.playingBoard[row][col]=symbol;
    }

    //void input

    public static void main(String[] args) {
       // char[][] playingBoard = new char[3][3];
        Scanner sc =new Scanner(System.in);
        Board b =new Board();
        b.printBoard();
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

            //---------------------------------------//
            System.out.print(row+" "+ col);
            b.markCell(row,col,'X');
            b.printBoard();
            //if()
        }

    }
}

/*Task, TicTacToe make a static board.
Create an empty Class named
Board
Add attributes
Add a 2d char array of size 3x3
Add methods
Constructor
Initialize 3x3 char array with hardcoded 'X', 'O' and ' ' values.
PrintBoard
Print all 3x3 chat array in a good format
Ex.
 X | O |
    | X  |O
O | O  |





for (int j = 0; j < playingBoard.length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        System.out.print("| "+ this.playingBoard[0][0]+" | ");
                    } else if (j == 1) {
                        System.out.print("O |   |");
                    }
                    //System.out.print(" ");
                } else if (i == 1) {
                    //System.out.print("  |");
                    if (j == 1) {
                        System.out.print("|   | X |");
                    }
                    else if (j == 2) {
                        System.out.print(" O |");
                    }
                } else {
                    if (j == 0) {
                        System.out.print("| O |");
                    }
                    else if (j == 1) {
                        System.out.print(" O |   |");
                    }
                    //System.out.print(" ");
                }

            }
            //System.out.println();
            //System.out.print("-------");
            if(i==0){
                System.out.println();
                System.out.print("|---|---|---|");
                System.out.println();
                //System.out.println();
            }
            else if(i==1){
                //System.out.println();
                System.out.println();
                System.out.print("|---|---|---|");
                System.out.println();
            }
            else{
                System.out.println();
                System.out.print("|---|---|---|");
            }
        }
*/