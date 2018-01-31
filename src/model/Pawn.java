package model;

public class Pawn extends Piece {
    public Pawn(Player player1) {
        super(player1);
    }

    @Override
    public boolean validateMove(int x1, int y1, int x2, int y2) {
        if(Math.abs(y2 - y1) == 1 && x1 == x2 && !Board.getCell(x2,y2).hasAnyPieceInside()) return true;
        if (!Board.getCell(x2,y2).getKind().getPlayer().equals(Board.getCell(x1,y1).getKind().getPlayer()) &&
                (Math.abs(y2 - y1) == 1 && Math.abs(x2 - x1) == 1))return true;
        return false;
    }
}
