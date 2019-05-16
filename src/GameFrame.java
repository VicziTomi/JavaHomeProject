import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameFrame extends JFrame {

    private Piece[][] pieceLabels;
    private List<Piece> piecePool;

    private Piece tbsy = new Piece("tall", "black", "square", "yes", false);
    private Piece tbsn = new Piece("tall", "black", "square", "no", false);
    private Piece tbry = new Piece("tall", "black", "round", "yes", false);
    private Piece tbrn = new Piece("tall", "black", "round", "no", false);
    private Piece twsy = new Piece("tall", "white", "square", "yes", false);
    private Piece twsn = new Piece("tall", "white", "square", "no", false);
    private Piece twry = new Piece("tall", "white", "round", "yes", false);
    private Piece twrn = new Piece("tall", "white", "round", "no", false);
    private Piece sbsy = new Piece("small", "black", "square", "yes", false);
    private Piece sbsn = new Piece("small", "black", "square", "no", false);
    private Piece sbry = new Piece("small", "black", "round", "yes", false);
    private Piece sbrn = new Piece("small", "black", "round", "no", false);
    private Piece swsy = new Piece("small", "white", "square", "yes", false);
    private Piece swsn = new Piece("small", "white", "square", "no", false);
    private Piece swry = new Piece("small", "white", "round", "yes", false);
    private Piece swrn = new Piece("small", "white", "round", "no", false);


    public GameFrame() throws HeadlessException {


        piecePool = new ArrayList<Piece>();
        piecePool.add(tbsy);
        piecePool.add(tbsn);
        piecePool.add(tbry);
        piecePool.add(tbrn);
        piecePool.add(twsy);
        piecePool.add(twsn);
        piecePool.add(twry);
        piecePool.add(twrn);
        piecePool.add(sbsy);
        piecePool.add(sbsn);
        piecePool.add(sbry);
        piecePool.add(sbrn);
        piecePool.add(swsy);
        piecePool.add(swsn);
        piecePool.add(swry);
        piecePool.add(swrn);


        this.setTitle("Quatro");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(0,0,800,800);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel pieceArea = new JPanel();
        pieceArea.setBackground(Color.GREEN);
        pieceArea.setLayout(new GridLayout(2,8));


        JPanel gameArea = new JPanel();
        gameArea.setBackground(Color.GRAY);
        gameArea.setLayout(new GridLayout(4,4));



        pieceLabels = new Piece[4][4];
        for (int i = 0; i < pieceLabels.length; i++) {
            for (int j = 0; j < pieceLabels[i].length; j++) {
                pieceLabels[i][j] = new Piece();
                pieceLabels[i][j].setBorder(BorderFactory.createLineBorder(Color.WHITE));
                gameArea.add(pieceLabels[i][j]);
            }
        }

        for (Piece p : piecePool) {
            pieceArea.add(p);
            p.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        }

        this.add(gameArea);
        this.add(pieceArea);

        gameArea.setAlignmentY(gameArea.TOP_ALIGNMENT);

        pieceArea.setAlignmentY(pieceArea.BOTTOM_ALIGNMENT);

        gameArea.setMinimumSize(new Dimension(200,200));
        gameArea.setPreferredSize(new Dimension(500,500));
        gameArea.setMaximumSize(new Dimension(500,500));

        pieceArea.setMinimumSize(new Dimension(200,200));
        pieceArea.setPreferredSize(new Dimension(800,300));
        pieceArea.setMaximumSize(new Dimension(800,300));


        setVisible(true);
    }

    public void putPiece (int x, int y, Piece p) {
        this.pieceLabels[y][x].setText(p.toString());
    }

}
