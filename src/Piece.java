public class Piece {

    private String height;
    private String color;
    private String shape;
    private String dotted;
    private boolean played;

    public Piece(String height, String color, String shape, String dotted, boolean played) {
        this.height = height;
        this.color = color;
        this.shape = shape;
        this.dotted = dotted;
        this.played = played;
    }

    @Override
    public String toString() {
        return height + "|" + color + "|" + shape + "|" + dotted;
    }

    public String getHeight() {
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
