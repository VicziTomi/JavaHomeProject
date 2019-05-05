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

    public static Piece tbsy = new Piece("tall", "black", "square", "yes", false);
    public static Piece tbsn = new Piece("tall", "black", "square", "no", false);
    public static Piece tbry = new Piece("tall", "black", "round", "yes", false);
    public static Piece tbrn = new Piece("tall", "black", "round", "no", false);
    public static Piece twsy = new Piece("tall", "white", "square", "yes", false);
    public static Piece twsn = new Piece("tall", "white", "square", "no", false);
    public static Piece twry = new Piece("tall", "white", "round", "yes", false);
    public static Piece twrn = new Piece("tall", "white", "round", "no", false);
    public static Piece sbsy = new Piece("small", "black", "square", "yes", false);
    public static Piece sbsn = new Piece("small", "black", "square", "no", false);
    public static Piece sbry = new Piece("small", "black", "round", "yes", false);
    public static Piece sbrn = new Piece("small", "black", "round", "no", false);
    public static Piece swsy = new Piece("small", "white", "square", "yes", false);
    public static Piece swsn = new Piece("small", "white", "square", "no", false);
    public static Piece swry = new Piece("small", "white", "round", "yes", false);
    public static Piece swrn = new Piece("small", "white", "round", "no", false);



    @Override
    public String toString() {
        return "Piece{" +
                "height='" + height + '\'' +
                ", color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                ", dotted='" + dotted + '\'' +
                ", played=" + played +
                '}';
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
