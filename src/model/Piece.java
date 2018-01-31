package model;


public abstract class Piece {
    public abstract boolean validateMove(int x1, int y1, int x2, int y2);
    private Player player = null;
    public Piece(Player player) {
        this.player = player;
    }
    public Player getPlayer() {
        return player;
    }
}
