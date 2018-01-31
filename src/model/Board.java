package model;

import java.util.ArrayList;
import java.util.List;
public class Board {
    private final static int BOARD_SIZE = 8;
    private static List<Cell> cells = new ArrayList<>();
    private String[] initialOrder = {
            "ROCK",
            "KNIGHT",
            "BISHOP",
            "QUEEN",
            "KING",
            "BISHOP",
            "KNIGHT",
            "ROCK"
    };
    public Board() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                cells.add(new Cell(j, i));
            }
        }
        Player player1 = new Player("W"),
                player2 = new Player("B");
        for(int i = 0; i < BOARD_SIZE; i++){
            getCell(i + 1,2).setKind(new Pawn(player1));
            getCell(i + 1,7).setKind(new Pawn(player2));
            if(initialOrder[i].equals("ROCK")){
                getCell(1 + i,1).setKind(new Rook(player1));
                getCell(1 + i,8).setKind(new Rook(player2));
            }
            if(initialOrder[i].equals("KNIGHT")){
                getCell(1 + i,1).setKind(new Knight(player1));
                getCell(1 + i,8).setKind(new Knight(player2));
            }
            if(initialOrder[i].equals("BISHOP")){
                getCell(1 + i,1).setKind(new Bishop(player1));
                getCell(1 + i,8).setKind(new Bishop(player2));
            }
            if(initialOrder[i].equals("QUEEN")){
                getCell(1 + i,1).setKind(new Queen(player1));
                getCell(1 + i,8).setKind(new Queen(player2));
            }
            if(initialOrder[i].equals("KING")){
                getCell(1 + i,1).setKind(new King(player1));
                getCell(1 + i,8).setKind(new King(player2));
            }
        }

    }
    public static Cell getCell(int x, int y){
        return cells.get(whereOnArray(x, y));
    }
    private static int whereOnArray(int x , int y) {
        return (y - 1) * BOARD_SIZE + (x - 1);
    }
}
