/*
Handles grid
 */
package Game.src;
public class Board {
    private Cell[][] board;
    public Board(int row, int col){
        //instantiate new Board
        this.board=new Cell[row][col];

        //fill array with cell obj
        for (int r=0; r<row; r++){
            for (int c=0;c<col;c++){
                board[r][c]=new Cell(false,false,false, false);
            }
        }
    }

    public void display(){
        //print board to screen
        System.out.println(this.board);
    }
    public void reveal(){
        //reveals a cell
    }
    public void flag(){
        //flags a cell
    }
    public boolean is_won(){
        //checks if game is won
        return true;
    }

}
