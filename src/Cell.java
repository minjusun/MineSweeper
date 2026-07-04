package src;

public class Cell {
    private Boolean is_mine;
    private Boolean is_revealed;
    private Boolean is_flagged;
    private int adj_mines;

    public Cell(Boolean is_mine,Boolean is_revealed,Boolean is_flagged, int adj_mines){
        this.is_mine=is_mine;
        this.is_revealed=is_revealed;
        this.is_flagged=is_flagged;
        this.adj_mines=adj_mines;
    }
    public Boolean is_mine(){
        //checks if a cell is a mine
        return this.is_mine;
    }
    public void setMine(Boolean is_mine){
        //sets whether this cell is a mine
        this.is_mine=is_mine;
    }
    public Boolean is_revealed(){
        //check if revealed
        return this.is_revealed;
    }
    public Boolean is_flagged(){
        //check if flagged
        return this.is_flagged;
    }
    public int num_adj_cells(){
        //return number of adjacent cells
        return this.adj_mines;
    }
    public String toString(){
        return "mine:"+this.is_mine;
    }

}
