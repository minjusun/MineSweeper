package Game.src;

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
    public boolean place_mines(){
        Random rand=new Random();
        for(int i=0; i<10;i++){
            //place 10 mines; hardcode number of mines for now
            int row=rand.nextInt(board) //nextInt is values btwn 0 inclusive and board.length, includsive
        }
        return true;
    }
    

}
