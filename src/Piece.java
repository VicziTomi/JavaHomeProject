import javax.swing.*;

public class Piece extends JLabel {

    public String height;
    public String color;
    public String shape;
    public String dotted;
    public boolean played;
    public int posX;
    public int posY;
    public ImageIcon img;

    public Piece(String height, String color, String shape, String dotted, boolean played, ImageIcon img) {
        this.height = height;
        this.color = color;
        this.shape = shape;
        this.dotted = dotted;
        this.played = played;
        this.img = img;
    }

    public Piece(boolean played, ImageIcon img) { this.played = played; this.img = img; }


    public String nameFrame() {
        String h = String.valueOf(height.charAt(0));
        String c = String.valueOf(color.charAt(0));
        String s = String.valueOf(shape.charAt(0));
        String d = String.valueOf(dotted.charAt(0));
        return h + c + s + d;
    }

    @Override
    public String toString() {
        return nameFrame();
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
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
