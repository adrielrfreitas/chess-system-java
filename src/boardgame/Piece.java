package boardgame;

public class Piece extends Board
{

    protected Position position;
    private Board board;

    public Piece(Board board)
    {
        super();
        this.board = board;
        position = null;
    }

    protected Board getBoard()
    {
        return board;
    }




}
