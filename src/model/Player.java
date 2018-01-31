package model;

public class Player {
    private String color;
    public Player(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public boolean equals(Object o){
        if (o == null)
            return false;
        if (o instanceof Player){
            if (((Player) o).getColor().equals(this.getColor()))
                return true;
        }else return false;
        return false;
    }
}
