package model;

public class King  extends Piece {
    public King(Player player) {
        super(player);
    }

    @Override
    public boolean validateMove(int x1, int y1, int x2, int y2) {
        if (!(Math.abs(y2 - y1) == 1 || Math.abs(x2 - x1) == 1)){
            return false;
        }
        if (!Board.getCell(x2,y2).getKind().getPlayer().equals(Board.getCell(x1,y1).getKind().getPlayer()) ||
                !Board.getCell(x2,y2).hasAnyPieceInside())
            return true;
        return false;
    }
}
