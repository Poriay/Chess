package model;

public class Cell {
    private int x, y;
    private boolean hasAnyPieceInside;
    private Piece kind;

    public void setKind(Piece kind) {
        this.kind = kind;
    }

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        hasAnyPieceInside = false;

        kind = null;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean hasAnyPieceInside() {
        return hasAnyPieceInside;
    }
    public void setHasAnyPieceInside(boolean hasAnyPieceInside) {
        this.hasAnyPieceInside = hasAnyPieceInside;
    }


    public Piece getKind() {
        return kind;
    }
}
