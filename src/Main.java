import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        // final GameArea gameArea = new GameArea(4);


        // GameFrame gameFrame = new GameFrame();
        PiecePool p = new PiecePool();
        System.out.println(p);
        p.remove(16);
        p.remove(12);
        System.out.println(p);

        GameArea gameArea = new GameArea();

        gameArea.putPiece(p.swsy, 0, 1);
        System.out.println("-------------------");
        gameArea.putPiece(p.tbsn, 0, 2);


    }

}
