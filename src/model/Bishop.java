package model;

public class Bishop extends Piece  {
    public Bishop(Player player1) {
        super(player1);
    }

    @Override
    public boolean validateMove(int x1, int y1, int x2, int y2) {
        if (!(Math.abs(y2 - y1) % Math.abs(x2 - x1) == 0 &&
                Math.abs(y2 - y1) / Math.abs(x2 - x1) == 1))
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
