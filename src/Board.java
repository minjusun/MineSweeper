/*
Handles grid
 */
package src;
public class Board {
    private Cell[][] board;
    
    public Board(int row, int col){
        //instantiate new Board and populate with default cells
        this.board=new Cell[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                this.board[i][j]=new Cell(false,false,false,0);
            }
        }
    }

    public int getRows(){
        return this.board.length;
    }

    public int getCols(){
        return this.board.length==0 ? 0 : this.board[0].length;
    }

    public Cell getCell(int row, int col){
        return this.board[row][col];
    }

    public void display(){
        //print board to screen
        for (int i=0; i<getRows();i++){
            for(int j=0;j<getCols();j++){
                System.out.println(this.board[i][j]);
            }
        }
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
