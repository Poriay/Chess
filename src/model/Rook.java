package model;

public class Rook extends Piece  {
    public Rook(Player player1) {
        super(player1);
    }

    @Override
    public boolean validateMove(int x1, int y1, int x2, int y2) {
        if (!(x1 == x2 || y1 == y2))
            return false;
        if (Board.getCell(x2,y2).hasAnyPieceInside() &&
                Board.getCell(x2,y2).getKind().getPlayer().equals(Board.getCell(x1,y1).getKind().getPlayer()))
            return false;
        else if (Board.getCell(x2,y2).hasAnyPieceInside() &&
                !Board.getCell(x2,y2).getKind().getPlayer().equals(Board.getCell(x1,y1).getKind().getPlayer()))
            return true;
        return false;

    }
}
