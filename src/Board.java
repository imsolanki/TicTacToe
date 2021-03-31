import java.util.Scanner;

public class Board {

    char[][] playingBoard;
    char turn=' ';

    Board(){
        this.playingBoard =new char[3][3];
        turn='X';
        for(int i=0;i< playingBoard.length;i++){
            for(int j=0;j<playingBoard[i].length;j++){
                this.playingBoard[i][j]=' ';
            }
        }
    }

    void printBoard(){
        System.out.println();
        System.out.print("| "+this.playingBoard[0][0]);
        System.out.print(" | "+this.playingBoard[0][1]+" | "+this.playingBoard[0][2]+" |");
        System.out.println();
        System.out.println("|---|---|---|");
        System.out.print("| "+this.playingBoard[1][0]);
        System.out.print(" | "+this.playingBoard[1][1]+" | "+this.playingBoard[1][2]+" |");
        System.out.println();
        System.out.println("|---|---|---|");
        System.out.print("| "+this.playingBoard[2][0]);
        System.out.print(" | "+this.playingBoard[2][1]+" | "+this.playingBoard[2][2]+" |");
        System.out.println();
        System.out.println("|---|---|---|");

    }

    void markCell(int col,int row){
        if(this.playingBoard[row][col]==' '){
            this.playingBoard[row][col]=turn;
            if(turn=='X'){
                turn='O';
            }else{
                turn='X';
            }
        }else{
            System.out.println("Already Assigned");
        }
    }

    boolean checkWinner(char symbol){
        if(this.playingBoard[0][0]==symbol&&this.playingBoard[0][1]==symbol&&this.playingBoard[0][2]
                ==symbol){
            return true;
        }else if(this.playingBoard[1][0]==symbol&&this.playingBoard[1][1]==symbol&&this.playingBoard[1][2]
                ==symbol){
            return true;
        }else if(this.playingBoard[2][0]==symbol&&this.playingBoard[2][1]==symbol&&this.playingBoard[2][2]
                ==symbol){
            return true;
        }else if(this.playingBoard[0][0]==symbol&&this.playingBoard[1][1]==symbol&&this.playingBoard[2][2]
                ==symbol){
            return true;
        }else if(this.playingBoard[0][0]==symbol&&this.playingBoard[1][0]==symbol&&this.playingBoard[2][0]
                ==symbol){
            return true;
        }else if(this.playingBoard[0][1]==symbol&&this.playingBoard[1][1]==symbol&&this.playingBoard[2][1]
                ==symbol){
            return true;
        }else if(this.playingBoard[0][2]==symbol&&this.playingBoard[1][2]==symbol&&this.playingBoard[2][2]
                ==symbol){
            return true;
        }else if(this.playingBoard[0][2]==symbol&&this.playingBoard[1][1]==symbol&&this.playingBoard[2][0]
                ==symbol){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Board b =new Board();
        Scanner sc =new Scanner(System.in);
        int count = 0;
        int col;
        int row;
        b.printBoard();
        while(true){

            int input = sc.nextInt();
            count =count+1;
            col = (input-1)%3;
            row=2-((input-1)/3);
            b.markCell(col,row);
            b.printBoard();
            if(b.checkWinner('X')){
                System.out.println("Player X is the winner.");
                break;
            }else if(b.checkWinner('O')){
                System.out.println("Player O is the winner.");
                break;
            }
            else{
                if(count>=9&&(b.playingBoard[0][0]!=' '||b.playingBoard[0][1]!=' '||
                        b.playingBoard[0][2]!=' '||b.playingBoard[1][0]!=' '||
                        b.playingBoard[1][1]!=' '||b.playingBoard[1][2]!=' '||b.playingBoard[2][0]!=' '||
                        b.playingBoard[2][1]!=' '||
                        b.playingBoard[2][2]!=' ')){
                    System.out.println("----------------");
                    System.out.println("---Try again----");
                    System.out.println("----------------");
                    break;
                }
            }
        }
    }
}
