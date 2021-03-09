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
            System.out.println();
            System.out.print("Please press a button from 1 to 9 using num pad: ");
            int button =sc.nextInt();
            int row;
            int col;
            //---------------------------------------//


            //--------------------------------------//
            //7   8   9    //  1  2   0  row 0
            //4   5   6    //  1  2   0  row 1
            //1   2   3    //  1  2   0  row 2

            //  1  2  3  4  5  6  7  8  9  (button)
            //  0  1  2  3  4  5  6  7  8  (button-1)
            //  0  1  2  0  1  2  0  1  2  (button-1)%3

            //--------------------------------------//
            col = (button-1)%3;

            //---------------------------------------//
            //  1  2  3  4  5  6  7  8  9  (button)
            //  0  1  2  3  4  5  6  7  8   (button -1)
            //  0  0  0  1  1  1  2  2  2  (button/3)
            //  2  2  2  1  1  1  0  0  0  (2- button)
            //----------------------------------------//

            row = button-1;
            row =row/3;
            row= 2-row;

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
            else if(index>=9&&b.playingBoard[0][0]!=' '&&b.playingBoard[0][1]!=' '&&
                    b.playingBoard[0][2]!=' '&&b.playingBoard[1][0]!=' '&&b.playingBoard[1][1]!=' '&&
                    b.playingBoard[1][2]!=' '&&b.playingBoard[2][0]!=' '&&b.playingBoard[2][1]!=' '&&
                    b.playingBoard[2][2]!=' '){

                System.out.println("---------------------");
                System.out.println("Try Again: ");
                System.out.println("---------------------");
                break;

            }

        }
    }
}

/*
else if(index>=9){
                for(int i=0;i<b.playingBoard.length;i++){
                    for(int j =0;j<b.playingBoard[i].length;j++){

                        if(b.playingBoard[i]==null){
                            System.out.println("---------------------");
                            System.out.println("Try Again: ");
                            System.out.println("---------------------");
                            break;
                        }

                    }
                }

            }
 */