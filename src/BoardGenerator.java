package src;

import java.util.prefs.BackingStoreException;
import java.util.Random;

public class BoardGenerator {
    /*Handle logic to generate intital Board:
    - create new board
    -populate with mine
    -calc adjacency
    -return board */
    Board board;
    
    public BoardGenerator(int row,int col){
        this.board=new Board(row, col);
    }
    public Board place_mines(){
         int cnt=0;

        for(int i=0; i<10;i++){ //place 10 mines; hardcode number of mines for now
            //generate random row and col
            Random rand = new Random();
            int randomRow = rand.nextInt(board.getRows());
            int randCol=rand.nextInt(board.getCols());

            //place mine in cell if not exists
            if (!this.board.getCell(randomRow, randCol).is_mine()){
                this.board.getCell(randomRow, randCol).setMine(true);
                cnt+=1;
            }
            System.out.println("count:" + cnt);

        }
        return this.board;
    }
    

}
