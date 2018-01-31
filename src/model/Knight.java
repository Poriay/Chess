package model;

public class Knight extends Piece {
    public Knight(Player player1) {
        super(player1);
    }

    @Override
    public boolean validateMove(int x1, int y1, int x2, int y2) {
        if (!(Math.abs(x2 - x1) == 2 && Math.abs(y2 - y1) == 3) ||
                (Math.abs(x2 - x1) == 3 && Math.abs(y2 - y1) == 2))
            return false;
        if (!Board.getCell(x2,y2).getKind().getPlayer().equals(Board.getCell(x1,y1).getKind().getPlayer()) ||
                !Board.getCell(x2,y2).hasAnyPieceInside())
            return true;
        return false;
    }
}
