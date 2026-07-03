package Minesweeper.src;

/* 
Initializes everything, owns Board, manage turns, handle input, track game loop (start, pause, end)
*/
public class Game {
    private Board board;

    public Game(){
        BoardGenerator bg=new BoardGenerator(9,9);
        this.board=bg.place_mines();
    }
    public void start(){
        board.display();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

}
