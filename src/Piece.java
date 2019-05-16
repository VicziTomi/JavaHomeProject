import javax.swing.*;

public class Piece extends JLabel {

    private String height;
    private String color;
    private String shape;
    private String dotted;
    private boolean played;
    private int posX;
    private int posY;

    public Piece(String height, String color, String shape, String dotted, boolean played) {
        this.height = height;
        this.color = color;
        this.shape = shape;
        this.dotted = dotted;
        this.played = played;
        setText(toString());
    }

    public Piece() {

    }

    @Override
    public String toString() {
        return height + "|" + color + "|" + shape + "|" + dotted;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getPieceHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getDotted() {
        return dotted;
    }

    public void setDotted(String dotted) {
        this.dotted = dotted;
    }

    public boolean isPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }
}
