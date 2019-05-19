import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameArea {

    private Piece[][] map;
    private final int size = 4;
    private Piece piece;

    public GameArea() {
        this.map = new Piece[size][size];
    }

    public void putPiece(Piece p, int x, int y) {
        // TODO lerakrni a megadott koordinátára a bábut + validálni h nincs-e már ott bábu!
        if (map[x][y] == null) {
            p.setPosX(x);
            p.setPosY(y);
            this.map[x][y] = p;
            printMap();
        }
    }

    public void printMap() {
        for (int i = 0; i < this.map.length; i++) {
            for (int j = 0; j < this.map[i].length; j++) {
                if (map[i][j] instanceof Piece) {
                    System.out.print(map[i][j].nameFrame() + " ");
                } else {
                    System.out.print("#### ");
                }
            }
            System.out.println();
        }
    }


    @Override
    public String toString () {
        return Arrays.toString(map);
    }
}