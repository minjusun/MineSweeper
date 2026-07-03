package Game.src;

/* 
Initializes everything, owns Board, manage turns, handle input, track game loop (start, pause, end)
*/
public class Game {
    private Board board;

    public Game(){
        BoardGenerator bg=new BoardGenerator(9,9);
        this.board=bg.generate(9,9);
    }
    public void start(){
        board.display();
    }

}
