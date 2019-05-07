import java.util.Arrays;

public class GameArea {

    private Piece[][] gameArea;

    public GameArea(int n) {
        this.gameArea = new Piece[n][n];
    }

    public void putPiece (Piece p, int x, int y) {
        // TODO lerakrni a megadott koordinátára a bábut + validálni h nincs-e már ott bábu!
        p.setPosX(x);
        p.setPosY(y);
        gameArea[x][y] = p;
        printMap();
    }

    public void printMap() {
        for (int i = 0; i < gameArea.length; i++) {
            for (int j = 0; j < gameArea.length; j++) {
                System.out.print(gameArea[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(gameArea);
    }
}
